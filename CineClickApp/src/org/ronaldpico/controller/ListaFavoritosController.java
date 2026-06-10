package org.ronaldpico.controller;

import java.util.List;
import org.ronaldpico.model.ListaFavoritos;
import org.ronaldpico.model.dao.ListaFavoritosDAO;
import org.ronaldpico.model.dao.ListaFavoritosDAOImpl;
import org.ronaldpico.view.ListaFavoritosView;

public class ListaFavoritosController {

    private final ListaFavoritosView vista;
    private final ListaFavoritosDAO dao;

    public ListaFavoritosController(ListaFavoritosView vista) {
        this.vista = vista;
        this.dao = new ListaFavoritosDAOImpl();
    }

    public void listar() {
        List<ListaFavoritos> lista = dao.listar();
        if (lista.isEmpty()) {
            vista.mostrarMensaje("No hay listas de favoritos registradas.");
        } else {
            vista.mostrarTodos(lista);
        }
    }
}
