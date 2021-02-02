/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * @author DELL
 * 
 */
// decrementar desde el numero 100 hasta cero de dos en dos
public class Ejercicio4 {
    public static void main(String[] args){
    
    for(int i=100;i>=0;i-=4){
    
        System.out.println(i);
    }
    System.out.println("Usando el ciclo while");
    
    
    int i=100;
    while(i>=0){
    System.out.println(i);
    i=i-4;
    }
    }
    
}
