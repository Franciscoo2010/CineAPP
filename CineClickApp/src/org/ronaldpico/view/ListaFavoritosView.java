package org.ronaldpico.view;

import java.util.List;
import org.ronaldpico.model.ListaFavoritos;

public class ListaFavoritosView {

    public void mostrarTodos(List<ListaFavoritos> listas) {
        System.out.println("\n+++ LISTAS DE FAVORITOS +++");
        System.out.printf("%-5s %-30s %-20s%n", "ID", "NOMBRE LISTA", "USUARIO");
        System.out.println("-".repeat(60));
        for (ListaFavoritos l : listas) {
            System.out.printf("%-5d %-30s %-20s%n",
                    l.getIdLista(), l.getNombre(), l.getUsername());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
