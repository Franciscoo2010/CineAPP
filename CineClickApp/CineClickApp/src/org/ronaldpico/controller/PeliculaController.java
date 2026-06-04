package org.ronaldpico.controller;

import java.util.List;
import org.ronaldpico.model.Pelicula;
import org.ronaldpico.model.dao.PeliculaDAO;
import org.ronaldpico.model.dao.PeliculaDAOImpl;
import org.ronaldpico.view.PeliculaView;

public class PeliculaController {

    private final PeliculaView vista;
    private final PeliculaDAO dao;

    public PeliculaController(PeliculaView vista) {
        this.vista = vista;
        this.dao = new PeliculaDAOImpl();
    }

    public void listar() {
        List<Pelicula> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay peliculas registradas.");
        } else {
            vista.mostrarTodos(lista);
        }
    }
}
