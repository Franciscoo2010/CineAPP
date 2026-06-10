package org.ronaldpico.model;

public class Usuario {

    private int idUsuario;
    private String username;
    private String correo;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String correo) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.correo = correo;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
