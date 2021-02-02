/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;
//ejercicio numero 16 en video de shakmuria
//Crear un programa que nos permita introducir 10 numeros enteros
//en un arreglo, y al momento de mostrarlos en pantalla
//desplazar estos numeros una posicion hacia abajo.
//El primero estara en la posicion del segundo.
//El segundo estara en la posición del tercero.
public class Ejercicio20 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int arr2[] = new int[10];
//algoritmo creado por mi
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Ingrese numero: " + (i + 1));
            arr1[i] = sc.nextInt();
        }

        int g = arr1.length - 1;// el tamaño del arreglo(10)menos 1 da 9 
        arr2[0] = arr1[g];
        System.out.println("Arreglo 2 numero: " + arr2[0]);

        for (int i = 1; i < 10; i++) {
            arr2[i] = arr1[i - 1];
            System.out.println("Arreglo 2 numero: " + arr2[i]);
        }

        //algoritmo del video
        int ultimo;
        ultimo = arr1[9];

        for (int i = 8; i >= 0; i--) {
             
            arr1[i + 1] = arr1[i];
   
        }
        
       arr1[0] = ultimo;
        System.out.println("Mostrar arreglo desplazado una posicion");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(arr1[i]);
        }
    }

}
