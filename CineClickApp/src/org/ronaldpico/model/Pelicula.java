package org.ronaldpico.model;

public class Pelicula {

    private int idPelicula;
    private String titulo;
    private int anioEstreno;
    private String clasificacionEdad;
    private String estudio;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String titulo, int anioEstreno, String clasificacionEdad, String estudio) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.clasificacionEdad = clasificacionEdad;
        this.estudio = estudio;
    }

    public int getIdPelicula() { return idPelicula; }
    public void setIdPelicula(int idPelicula) { this.idPelicula = idPelicula; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnioEstreno() { return anioEstreno; }
    public void setAnioEstreno(int anioEstreno) { this.anioEstreno = anioEstreno; }

    public String getClasificacionEdad() { return clasificacionEdad; }
    public void setClasificacionEdad(String clasificacionEdad) { this.clasificacionEdad = clasificacionEdad; }

    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }
}
