/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio6 {
    public static void main(String[] args){
    //saber cual es el mayor de un arreglo
    
    int array[]=new int [5];
    int mayor=array[0];
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese los 5 numeros: ");
    for(int i=0;i<array.length;i++){
    
    array[i]=sc.nextInt();
    if(array[i]>mayor){
    mayor=array[i];
    }
    }
    System.out.println("El numero mayor es:"+mayor);
    }
    
}
