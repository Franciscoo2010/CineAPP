package org.ronaldpico.view;

import java.util.List;
import org.ronaldpico.model.Usuario;

public class UsuarioView {

    public void mostrarTodos(List<Usuario> usuarios) {
        System.out.println("\n+++ LISTA DE USUARIOS +++");
        System.out.printf("%-5s %-20s %-35s%n", "ID", "USERNAME", "CORREO");
        System.out.println("-".repeat(65));
        for (Usuario u : usuarios) {
            System.out.printf("%-5d %-20s %-35s%n",
                    u.getIdUsuario(), u.getUsername(), u.getCorreo());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
