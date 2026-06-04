package org.ronaldpico.view;

import java.util.Scanner;
import org.ronaldpico.controller.ActorController;
import org.ronaldpico.controller.EstudioController;
import org.ronaldpico.controller.ListaFavoritosController;
import org.ronaldpico.controller.PeliculaController;
import org.ronaldpico.controller.UsuarioController;

public class MenuPrincipal {

    private final Scanner leer = new Scanner(System.in);

    public void iniciarSistema() {
        int opcion;
        do {
            System.out.println("\n-----------------------------------------");
            System.out.println("   CINECLICK - PLATAFORMA DE STREAMING");
            System.out.println("-----------------------------------------");
            System.out.println("1. Ver ESTUDIOS");
            System.out.println("2. Ver PELICULAS");
            System.out.println("3. Ver ACTORES");
            System.out.println("4. Ver USUARIOS");
            System.out.println("5. Ver LISTAS DE FAVORITOS");
            System.out.println("6. SALIR");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    EstudioController estudioCtrl = new EstudioController(new EstudioView());
                    estudioCtrl.listar();
                    break;
                case 2:
                    PeliculaController peliculaCtrl = new PeliculaController(new PeliculaView());
                    peliculaCtrl.listar();
                    break;
                case 3:
                    ActorController actorCtrl = new ActorController(new ActorView());
                    actorCtrl.listar();
                    break;
                case 4:
                    UsuarioController usuarioCtrl = new UsuarioController(new UsuarioView());
                    usuarioCtrl.listar();
                    break;
                case 5:
                    ListaFavoritosController listaCtrl = new ListaFavoritosController(new ListaFavoritosView());
                    listaCtrl.listar();
                    break;
                case 6:
                    System.out.println("\nHasta la proxima...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
    }
}
