package org.ronaldpico.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.ronaldpico.model.Usuario;
import org.ronaldpico.model.conexion.Conexion;

public class UsuarioDAOImpl implements UsuarioDAO {

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT id_usuario, username, correo FROM Usuario ORDER BY username";
        try (Connection conexion = Conexion.conectar();
             Statement stmt = conexion.createStatement();
             ResultSet resultado = stmt.executeQuery(consulta)) {
            while (resultado.next()) {
                usuarios.add(new Usuario(
                        resultado.getInt("id_usuario"),
                        resultado.getString("username"),
                        resultado.getString("correo")
                ));
            }
        } catch (SQLException e) {
            System.err.println("ERROR al listar usuarios: " + e.getMessage());
        }
        return usuarios;
    }
}
