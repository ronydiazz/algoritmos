/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;


//Crear programa con un metodo, en el cual obtengamos
// el numero menor de un arreglo llenado con 6 numeros aleatorio entre 1 y 100
public class Ejercicio25 {
    public static void main(String[] ag){
    int menor;
    int arr[]= new int[6];
    System.out.println("Llenar un arreglo con numeros aleatorios entre 1 y 100");
        System.out.println("Los numeros aleatorios son: ");
       
    for(int i = 0; i<arr.length;i++){
    
        arr[i]=(int)(Math.random()*100+1);
        System.out.println(arr[i]);
    }
    menor=numeromenor(arr);
        System.out.println("EL numero menor es: "+menor);
    }
    
    static int numeromenor(int arr[]){
    int menor;
    menor=arr[0];
    for(int i= 0;i<arr.length; i++){
    
        if(arr[i]<menor)menor=arr[i];
    }
    
    return menor;
    }
}
