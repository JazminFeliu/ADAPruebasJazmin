package com.company;
//Crear un sistema que le permita a un empleado saber
// su bono presencial segun los dias que faltó.
//$200 si no tuvo faltas. $ 100 si tuvo 1 falta o $0 si tuvo mas.

public class Main {

    public static void main(String[] args) {

        Empleado Jaz = new Empleado(0);

        System.out.println("El bono es: " + Jaz.calcularBono());
    }
}
