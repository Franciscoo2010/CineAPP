package org.ronaldpico.view;

import java.util.List;
import org.ronaldpico.model.Pelicula;

public class PeliculaView {

    public void mostrarTodos(List<Pelicula> peliculas) {
        System.out.println("\n+++ CATALOGO DE PELICULAS +++");
        System.out.printf("%-5s %-35s %-6s %-8s %-25s%n", "ID", "TITULO", "ANIO", "CLASIF.", "ESTUDIO");
        System.out.println("-".repeat(85));
        for (Pelicula p : peliculas) {
            System.out.printf("%-5d %-35s %-6d %-8s %-25s%n",
                    p.getIdPelicula(), p.getTitulo(), p.getAnioEstreno(),
                    p.getClasificacionEdad(), p.getEstudio());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
