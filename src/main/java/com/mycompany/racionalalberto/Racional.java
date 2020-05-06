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
    
    //Sobreescritura método toString
    @Override
    public String toString() {
        return numerador + "/" + denominador;
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

}
