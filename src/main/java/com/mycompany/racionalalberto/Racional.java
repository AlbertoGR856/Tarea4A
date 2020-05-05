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

    private char a;
    private char b;

    public Racional(char a, char b) {
        this.a = 1;
        this.b = 1;
    }

    public Racional() {
        if (b == 0) {
            System.out.println("El denominador no es valido");
            this.b = 1;
        }

    }

    public char getA() {
        return a;
    }

    public void setA(char a) {
        this.a = 1;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = 1;
    }

    public void imprimirConsola() {

        System.out.println("Numero racional" + " " + a + " " + b);
    }

    @Override
    public String toString() {
        return "Racional{" + "a=" + a + ", b=" + b + '}';
    }

    
}
