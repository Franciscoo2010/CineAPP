package org.ronaldpico.model;

public class Actor {

    private int idActor;
    private String nombreArtistico;
    private String fechaNacimiento;
    private String nacionalidad;

    public Actor() {
    }

    public Actor(int idActor, String nombreArtistico, String fechaNacimiento, String nacionalidad) {
        this.idActor = idActor;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getIdActor() { return idActor; }
    public void setIdActor(int idActor) { this.idActor = idActor; }

    public String getNombreArtistico() { return nombreArtistico; }
    public void setNombreArtistico(String nombreArtistico) { this.nombreArtistico = nombreArtistico; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
}
