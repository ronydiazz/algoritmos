/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

// Crear un metodo que reciba un arreglo de 10 posiciones, y ordene sus numeros de menor a mayor

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String... args){
        
    Scanner sc=new Scanner(System.in);
    
    int array[]=new int[10];
    
    for(int i=0; i<array.length;i++){
        System.out.println("Introducir numero: ");
        array[i]=sc.nextInt();
    }
    ordenarArreglo(array);
    
    System.out.println("Arreglo ordenado:");
    for(int i=0; i<array.length;i++){
        System.out.println(array[i]);
    }
   }
    
    public static void ordenarArreglo(int a[]){
        int numeromenor;
        int contador = 0;
    for(boolean orden=false;!orden;){
      for(int i =0;i<a.length-1;i++){
      
      if(a[i]>a[i+1]){
       numeromenor=a[i];
      a[i]=a[i+1];
      a[i+1]=numeromenor;
      contador++;
      }
      
      }
      if(contador==0){
      orden=true;
      }
      contador=0;
    }
    } 
   }

