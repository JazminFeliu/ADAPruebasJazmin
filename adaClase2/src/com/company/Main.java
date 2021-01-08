package com.company;
//Crear un sistema que le permita a un empleado saber
// su bono presencial segun los dias que faltó.
//$200 si no tuvo faltas. $ 100 si tuvo 1 falta o mas.

public class Main {

    public static void main(String[] args) {

        Empleado Jaz = new Empleado();

        System.out.println("El bono es: " + Jaz.calcularBono());
    }
}
