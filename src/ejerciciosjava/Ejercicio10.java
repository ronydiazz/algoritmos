/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

//Crear programa que muestre el producto de los primeros 10 numeros impares
//Primeros 10 numeros Impares:1,3,5,7,9,11,13,15,17,19.
public class Ejercicio10 {
    public static void main(String[] args){
    
    long numerosImpares=1;
    for(int i=1;i<20;i+=2){
    
        numerosImpares=numerosImpares*i;
        
    }
    System.out.println("El producto de los numeros son: "+numerosImpares);
    
    }
    
}
