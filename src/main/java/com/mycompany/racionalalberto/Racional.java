/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalberto;

/**
 *
 * @author GR6
 */
public class Racional {

    //Atributos
    private int numerador;
    private int denominador;

    //Constructor por defecto
    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    //Constructor parametrizado
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        //Controlamos que el denominador no sea 0
        if (denominador == 0) {
            this.denominador = 1;
            System.out.println("El denominador no es valido, se asigna el valor 1");

        } else {
            this.denominador = denominador;

        }
    }

    //Getters y Setters
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            this.denominador = 1;
            System.out.println("El denominador no es valido, se asigna el valor 1");

        } else {
            this.denominador = denominador;

        }
    }

    //Método que imprime por consola
    public void imprimirConsola() {
        System.out.println("Número racional" + numerador + "/" + denominador);
    }

    //Método que suma a un objeto creado
    public void suma(Racional racional) {

        if (this.denominador == racional.denominador) {

            this.numerador += racional.numerador;

        } else {

            this.numerador = (this.numerador * racional.denominador)
                    + (this.denominador * racional.numerador);

            this.denominador *= racional.denominador;
        }

    }

    //Método que resta a un objeto creado
    public void resta(Racional racional) {

        if (this.denominador == racional.denominador) {

            this.numerador -= racional.numerador;

        } else {

            this.numerador = (this.numerador * racional.denominador)
                    - (this.denominador * racional.numerador);

            this.denominador *= racional.denominador;
        }

    }
    
     //Método que multiplica a un objeto creado
    public void producto(Racional racional) {

        this.numerador *= racional.numerador;
        this.denominador *= racional.denominador;
    }

     //Método estático que divide dos números dados
    public static Racional division(Racional racional1, Racional racional2) {

        return new Racional(racional1.numerador *= racional2.denominador, racional1.denominador *= racional2.numerador);
    }
    
    //Método estático que compara dos números dados
    public static boolean igualdad(Racional racional1, Racional racional2) {
        boolean resultado;

        resultado = racional1.numerador * racional2.denominador
                == racional1.denominador * racional2.numerador;

        return resultado;
    }

    //Sobreescritura método toString
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
