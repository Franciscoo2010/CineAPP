package org.ronaldpico.model;

public class Estudio {

    private int idEstudio;
    private String nombre;
    private String pais;
    private String sedeCentral;

    public Estudio() {
    }

    public Estudio(int idEstudio, String nombre, String pais, String sedeCentral) {
        this.idEstudio = idEstudio;
        this.nombre = nombre;
        this.pais = pais;
        this.sedeCentral = sedeCentral;
    }

    public int getIdEstudio() { return idEstudio; }
    public void setIdEstudio(int idEstudio) { this.idEstudio = idEstudio; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getSedeCentral() { return sedeCentral; }
    public void setSedeCentral(String sedeCentral) { this.sedeCentral = sedeCentral; }
}
