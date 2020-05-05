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

}
