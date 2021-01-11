package com.company;

public class Empleado {

    private Integer bonoPresentismo;
    private Integer cantidadDeFaltas;

    public Empleado(Integer cantidadDeFaltas) {
        this.cantidadDeFaltas = cantidadDeFaltas;
    }

    public Empleado() {
        cantidadDeFaltas = 0;
    }

    public Integer calcularBono(){
        switch (cantidadDeFaltas){
            case 0: return 200;
            case 1: return 100;
            default: return 0;
        }
    }

}
