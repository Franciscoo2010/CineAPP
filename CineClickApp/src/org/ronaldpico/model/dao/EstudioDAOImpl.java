package org.ronaldpico.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.ronaldpico.model.Estudio;
import org.ronaldpico.model.conexion.Conexion;

public class EstudioDAOImpl implements EstudioDAO {

    @Override
    public List<Estudio> listar() {
        List<Estudio> estudios = new ArrayList<>();
        String consulta = "SELECT id_estudio, nombre, pais, sede_central FROM Estudio ORDER BY nombre";
        try (Connection conexion = Conexion.conectar();
             Statement stmt = conexion.createStatement();
             ResultSet resultado = stmt.executeQuery(consulta)) {
            while (resultado.next()) {
                estudios.add(new Estudio(
                        resultado.getInt("id_estudio"),
                        resultado.getString("nombre"),
                        resultado.getString("pais"),
                        resultado.getString("sede_central")
                ));
            }
        } catch (SQLException e) {
            System.err.println("ERROR al listar estudios: " + e.getMessage());
        }
        return estudios;
    }
}
