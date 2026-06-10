package org.ronaldpico.view;

import java.util.List;
import org.ronaldpico.model.Actor;

public class ActorView {

    public void mostrarTodos(List<Actor> actores) {
        System.out.println("\n+++ LISTA DE ACTORES +++");
        System.out.printf("%-5s %-30s %-15s %-25s%n", "ID", "NOMBRE ARTISTICO", "NACIMIENTO", "NACIONALIDAD");
        System.out.println("-".repeat(80));
        for (Actor a : actores) {
            System.out.printf("%-5d %-30s %-15s %-25s%n",
                    a.getIdActor(), a.getNombreArtistico(),
                    a.getFechaNacimiento(), a.getNacionalidad());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
