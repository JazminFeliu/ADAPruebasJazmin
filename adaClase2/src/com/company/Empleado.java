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
        if (cantidadDeFaltas >0){
          return 100;
        }else{
            return 200;
        }
    }

}
