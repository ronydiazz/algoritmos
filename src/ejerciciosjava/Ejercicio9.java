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
public class Ejercicio9 {
    
    //Crear un programa que nos pida capturar numeros positivos y cuando se 
    //introduce un numero egatio fialice el programa
    //Calcular la media o promedio de esos numeros 
   public static void main (String[] args){
   int num=0;
   int suma=0;
   int cantidadNumeros=0;
   double media=0;
   System.out.println("Introducir numeros positivos");
   Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   
   while(num>0){
  
       suma=suma+num;
       System.out.println("Introducir numero");
       num=sc.nextInt();
     
   cantidadNumeros++;
   }
   if(cantidadNumeros==0){
   System.out.println("No se puede calcuar la media");
   
   }else{
         media=suma/cantidadNumeros;
   System.out.println("El promedio de los numeros es: "+media);
   }
   
   
   
   
   
   }
    
}
