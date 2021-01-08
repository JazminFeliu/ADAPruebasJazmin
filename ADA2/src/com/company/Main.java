package com.company;
//crear un sistema que calcule el promedio de notas de un alumno.
//Nota: hay tres notas por materia
//Nota: el alumno tiene solo una materia

public class Main {

    public static void main(String[] args) {

        Alumno alumno = new Alumno(8,9,10);
        alumno.mostrarPromedio();

        String pruebas = new String();

        pruebas = "Hola Mundo!";

        System.out.println(pruebas.concat("!!!"));
        System.out.println((pruebas.length()));
        System.out.println(pruebas.substring(5));

    }
}
1