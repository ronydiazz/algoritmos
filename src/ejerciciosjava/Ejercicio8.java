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
public class Ejercicio8 {

    public static void main(String[] args) {
        //Crear un programa que este pidiedo numeros enteros
        //Cuando un cero se haya introducido finalizara la captura de datos 
        //Sumar los numeros y mostrar la suma en la pantalla
        int numeroentero = 0, suma=0;
        Scanner sc = new Scanner(System.in);
        
        //el do while se usa para ejecutar una vez el bloque de codigo que tenga
        //adenttro independientemente de la condicion
        do{
        System.out.println("Introduce un numero");
        
        numeroentero = sc.nextInt();
        suma=suma+numeroentero;
        }while(numeroentero!=0);
        System.out.println("La suma de todos los numeros es: "+suma);

    }

}
