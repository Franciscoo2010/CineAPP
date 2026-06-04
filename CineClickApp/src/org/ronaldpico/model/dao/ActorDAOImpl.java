package org.ronaldpico.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.ronaldpico.model.Actor;
import org.ronaldpico.model.conexion.Conexion;

public class ActorDAOImpl implements ActorDAO {

    @Override
    public List<Actor> listar() {
        List<Actor> actores = new ArrayList<>();
        String consulta = "SELECT id_actor, nombre_artistico, fecha_nacimiento, nacionalidad FROM Actor ORDER BY nombre_artistico";
        try (Connection conexion = Conexion.conectar();
             Statement stmt = conexion.createStatement();
             ResultSet resultado = stmt.executeQuery(consulta)) {
            while (resultado.next()) {
                actores.add(new Actor(
                        resultado.getInt("id_actor"),
                        resultado.getString("nombre_artistico"),
                        resultado.getString("fecha_nacimiento"),
                        resultado.getString("nacionalidad")
                ));
            }
        } catch (SQLException e) {
            System.err.println("ERROR al listar actores: " + e.getMessage());
        }
        return actores;
    }
}
