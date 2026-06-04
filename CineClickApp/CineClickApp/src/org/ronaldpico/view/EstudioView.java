package org.ronaldpico.view;

import java.util.List;
import org.ronaldpico.model.Estudio;

public class EstudioView {

    public void mostrarTodos(List<Estudio> estudios) {
        System.out.println("\n+++ LISTA DE ESTUDIOS +++");
        System.out.printf("%-5s %-30s %-20s %-30s%n", "ID", "NOMBRE", "PAIS", "SEDE CENTRAL");
        System.out.println("-".repeat(90));
        for (Estudio e : estudios) {
            System.out.printf("%-5d %-30s %-20s %-30s%n",
                    e.getIdEstudio(), e.getNombre(), e.getPais(), e.getSedeCentral());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
