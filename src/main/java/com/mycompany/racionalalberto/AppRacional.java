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
public class AppRacional {

    public static void main(String[] args) {

        //Crea dos racionales  con valores z=4/5 y k=3/4.
        Racional racionalZ = new Racional(4, 5);

        Racional racionalK = new Racional(3, 4);
        
        //Crea un racional aleatorio.
        
        Racional racionalAleatorio = Racional.aleatorio();

    }

}
