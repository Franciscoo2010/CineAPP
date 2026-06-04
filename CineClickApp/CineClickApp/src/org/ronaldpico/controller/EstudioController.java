package org.ronaldpico.controller;

import java.util.List;
import org.ronaldpico.model.Estudio;
import org.ronaldpico.model.dao.EstudioDAO;
import org.ronaldpico.model.dao.EstudioDAOImpl;
import org.ronaldpico.view.EstudioView;

public class EstudioController {

    private final EstudioView vista;
    private final EstudioDAO dao;

    public EstudioController(EstudioView vista) {
        this.vista = vista;
        this.dao = new EstudioDAOImpl();
    }

    public void listar() {
        List<Estudio> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay estudios registrados.");
        } else {
            vista.mostrarTodos(lista);
        }
    }
}
