package org.ronaldpico.model;

public class ListaFavoritos {

    private int idLista;
    private String nombre;
    private String username;

    public ListaFavoritos() {
    }

    public ListaFavoritos(int idLista, String nombre, String username) {
        this.idLista = idLista;
        this.nombre = nombre;
        this.username = username;
    }

    public int getIdLista() { return idLista; }
    public void setIdLista(int idLista) { this.idLista = idLista; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
