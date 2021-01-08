package com.company;

public class Alumno {
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
    private String nombre;

    public Alumno (String nombre){
        this.nombre = nombre;
    }
    public Alumno(Integer nota1, Integer nota2, Integer nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void mostrarPromedio() {

        Integer promedio = (nota1+nota2+nota3)/3;

        System.out.println("El promedio es: " + promedio);
    }
}
