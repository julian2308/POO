package com.company;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //Constructor
    public UsuarioJuego (String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public String getClave(){
        return clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //Metodos
    public void aumentarPuntaje(){
        puntaje++;
    }

    public void aumentarNivel(){
        nivel++;
    }

    public void bonus (Integer valor){
        puntaje += valor;
    }
}
