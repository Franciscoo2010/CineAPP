package org.ronaldpico.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.ronaldpico.model.ListaFavoritos;
import org.ronaldpico.model.conexion.Conexion;

public class ListaFavoritosDAOImpl implements ListaFavoritosDAO {

    @Override
    public List<ListaFavoritos> listar() {
        List<ListaFavoritos> listas = new ArrayList<>();
        String consulta =
                "SELECT lf.id_lista, lf.nombre, u.username " +
                "FROM ListaFavoritos lf " +
                "INNER JOIN Usuario u ON lf.id_usuario = u.id_usuario " +
                "ORDER BY u.username, lf.nombre";
        try (Connection conexion = Conexion.conectar();
             Statement stmt = conexion.createStatement();
             ResultSet resultado = stmt.executeQuery(consulta)) {
            while (resultado.next()) {
                listas.add(new ListaFavoritos(
                        resultado.getInt("id_lista"),
                        resultado.getString("nombre"),
                        resultado.getString("username")
                ));
            }
        } catch (SQLException e) {
            System.err.println("ERROR al listar listas de favoritos: " + e.getMessage());
        }
        return listas;
    }
}
