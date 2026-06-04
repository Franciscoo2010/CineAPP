package org.ronaldpico.controller;

import java.util.List;
import org.ronaldpico.model.Usuario;
import org.ronaldpico.model.dao.UsuarioDAO;
import org.ronaldpico.model.dao.UsuarioDAOImpl;
import org.ronaldpico.view.UsuarioView;

public class UsuarioController {

    private final UsuarioView vista;
    private final UsuarioDAO dao;

    public UsuarioController(UsuarioView vista) {
        this.vista = vista;
        this.dao = new UsuarioDAOImpl();
    }

    public void listar() {
        List<Usuario> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay usuarios registrados.");
        } else {
            vista.mostrarTodos(lista);
        }
    }
}
