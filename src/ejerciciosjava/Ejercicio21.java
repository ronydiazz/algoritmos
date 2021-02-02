/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
ejercio 17 en youtube
 */
package ejerciciosjava;

import java.util.Scanner;


//Introducir 5 numeros enteros en un arreglo, de forma creciente, y ordenados 
//Por Ejemplo: 2, 4, 6, 8, 10.
// Estos numeros se almacenaran en un arreglo de tamaño 10
//Posteriormente introduciremos un numero n
// Y se insertara en el lugar correspondiente
// Sin alterar el orden de la tabla
public class Ejercicio21 {
    
    public static void main(String[] args){
        
    Scanner sc= new Scanner(System.in);
    
    int array[]= new int[10];
    int num;
    int pos = 0;
    int j=0;
    
    
   for (int i = 0; i<5;i++){
   System.out.println("Introducir 5 numeros: "+(i+1));
  array[i]=sc.nextInt();
  
   }
   
   System.out.println("Introducir un numero");
   num=sc.nextInt();
   
   while(array[j]<num && j<=4){
   
   pos++;
   j++;
   
   }
   for(int i= 4;i>=pos;i--){
   array[i+1]=array[i];
   }
   array[pos]=num;
   
   //imprimir resultado
     for(int s=0;s<array.length;s++){
        
         
     System.out.println(array[s]);
     }
    
}}
