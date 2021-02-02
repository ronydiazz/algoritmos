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


//Ingresar datos numericos en dos arreglos, y almacenarlos en un tercer arreglo
//La forma en que se almacenarán es la siguiente:
//En el arreglo A y en el arreglo B, almacenaremos 12 numeros, en cada arreglo
//Los mostraremos en un tercer arreglo C de esta forma:
//3 numeros del arreglo A, 3 numeros del arreglo B.
//otros 3 numeros del areglo A, otros 3 numeros del arreglo B.
public class Ejercicio19 {
    public static void main(String[]ars){
    Scanner sc=new Scanner(System.in);
    int array1[]=new int[12];
    int array2[]=new int[12];
    int array3[]=new int[24];
 
    int j=0;
    
    
    for(int i=0;i<array1.length;i++){
        System.out.println("Introducir el numero del array 1: ");
        array1[i]=sc.nextInt();
    
    }
    for(int i=0;i<array2.length;i++){
        System.out.println("Introducir el numero del array 2: ");
        array2[i]=sc.nextInt();
    
    }
    int i=0;
   while(i<12)//se repite 12 veces desde 0 hasta 11, esto es para rellenar el arreglo 3
   {          
       
    for(int k=0;k<3;k++){//este for es para que se repita 3 veces y se ingrese 3 numeros
    array3[j]=array1[i+k];//se guarda en array3 el array1 3 veces correlativamente, el i+k es porque
    j++;                  //cuando se termine de ejecutar se le agregara mas 3 al i para que guarde en 
    }
    for(int k=0;k<3;k++){
    array3[j]=array2[i+k];   
    j++;
    }
    i+=3;
   }
   
    System.out.println("Mostrar los numeros:");
    for(int f=0;f<24;f++){
     System.out.println(array3[f]);

    }
    }
    
}
