/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepciones;

/**
 *
 * @author EQUIPO
 */
public class Excepciones {

    public static void main(String[] args) {
        
        System.out.println("---EXCEPCIONES-----");
        
        //error de divison por cero
        try{
            double resultado = 3/0;
        }catch(Exception e){
            System.out.println("No es posible dividir por CERO");
        }
        
        //error por desbordamiento
        int edades[] = {15,12,65,48};
        
        System.out.println("Posicion 2: " + edades[2]);
        try{
            System.out.println("la edad en la posicion 4 es: " + edades[4]);
        }catch(Exception e){
            System.out.println("La posicion referida, NO EXISTE!!!");
        }
        
        
    }
}
