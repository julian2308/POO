package com.company;

public class Contenedor implements Comparable<Contenedor>{
    private Integer id;
    private String pais;
    private Boolean marcaPeligroso;

    public Contenedor(Integer id, String pais, Boolean marcaPeligroso) {
        this.id = id;
        this.pais = pais;
        this.marcaPeligroso = marcaPeligroso;
    }
    @Override
    public int compareTo(Contenedor contenedor) {
        return this.id.compareTo(contenedor.id);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", pais='" + pais +
                ", marcaPeligroso=" + marcaPeligroso +
                '}';
    }

    public String getPais() {
        return pais;
    }

    public Boolean getMarcaPeligroso() {
        return marcaPeligroso;
    }
}
