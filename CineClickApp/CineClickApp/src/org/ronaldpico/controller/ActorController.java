package org.ronaldpico.controller;

import java.util.List;
import org.ronaldpico.model.Actor;
import org.ronaldpico.model.dao.ActorDAO;
import org.ronaldpico.model.dao.ActorDAOImpl;
import org.ronaldpico.view.ActorView;

public class ActorController {

    private final ActorView vista;
    private final ActorDAO dao;

    public ActorController(ActorView vista) {
        this.vista = vista;
        this.dao = new ActorDAOImpl();
    }

    public void listar() {
        List<Actor> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay actores registrados.");
        } else {
            vista.mostrarTodos(lista);
        }
    }
}
