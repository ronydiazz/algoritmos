/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;




//Crear 2 arreglos, the introducir en cada uno, 10 numeros enteros
//Y mezclarlos en un tercer arreglo. De la siguiente forma:
//El 1° de a, el 1° de b, el 2° de a, el 2° de b, el 3° de a, el 3° de b...etc.
public class Ejercicio18 {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int array1[]=new int[10];
    int array2[]=new int[10];
    int array3[]=new int[20];
    int i;
    int j=0;
    for(i=0;i<array1.length;i++){
    System.out.println("Introducir un numero arreglo 1");
    array1[i]=sc.nextInt();
    }
     for(i=0;i<array2.length;i++){
    System.out.println("Introducir un numero arreglo 2");
    array2[i]=sc.nextInt();
    }
     
     System.out.println("Los numeros son");
     for( i=0;i<10;i++)
     {
         array3[j]=array1[i];
         System.out.println(array3[j]);
          j++;
          
          array3[j]=array2[i];
          System.out.println(array3[j]);
          j++;
             
             }
    }
    
}
