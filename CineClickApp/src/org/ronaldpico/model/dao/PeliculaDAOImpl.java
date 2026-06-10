package org.ronaldpico.model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.ronaldpico.model.Pelicula;
import org.ronaldpico.model.conexion.Conexion;

public class PeliculaDAOImpl implements PeliculaDAO {

    @Override
    public List<Pelicula> listar() {
        List<Pelicula> peliculas = new ArrayList<>();
        String consulta = "{call sp_ListarPeliculas()}";
        try (Connection conexion = Conexion.conectar();
             CallableStatement call = conexion.prepareCall(consulta);
             ResultSet resultado = call.executeQuery()) {
            while (resultado.next()) {
                peliculas.add(new Pelicula(
                        resultado.getInt("id_pelicula"),
                        resultado.getString("titulo"),
                        resultado.getInt("anio_estreno"),
                        resultado.getString("clasificacion_edad"),
                        resultado.getString("estudio")
                ));
            }
        } catch (SQLException e) {
            System.err.println("ERROR al listar peliculas: " + e.getMessage());
        }
        return peliculas;
    }
}
