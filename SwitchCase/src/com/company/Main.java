package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer dia = 6;

        if (dia == 6 || dia == 7){
            System.out.println("Es finde");
        } else{
            System.out.println("El dia es hábil");
        }

        Integer contador = 0;
        while (contador < 10 ) {
            System.out.println(contador);
            contador++;
        }

        Scanner scanner = new Scanner(System.in); // sirve para ver de donde obtengo la informacion
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        Integer edad = scanner.nextInt();

        System.out.println("Bienvenido " + nombre);
        System.out.println("Su edad es: " + edad);
  }
}
