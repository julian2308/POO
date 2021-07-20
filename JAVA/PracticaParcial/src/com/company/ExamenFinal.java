package com.company;

public class ExamenFinal extends Examen{
    private Double notaOral;
    private String tema;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String tema) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.tema = tema;
    }

    
}
