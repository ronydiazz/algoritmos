/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

// Crear algoritmo con un metodo, en el cual obtengamos 
//el numero mayor de un arreglo llenado con numeros aleatorios entre 1 y 100
public class Ejercicio24 {
    public static void main (String[] args){
    int max;
    int t[]=new int [6];
    System.out.println("Llenar arreglo con numemos aleatorios entre 1 y 100");
    
        System.out.println("Los numeros añadidos son: ");
      for(int i=0;i<t.length;i++){
          //math.random genera numeros aleatorios que le pasamos en este caso 100 y el +1 es desde donde va a empezar
          t[i]=(int)(Math.random()*100+1);
          System.out.println(t[i]);
      }    
      max=numeromaximo(t);
        System.out.println("El Numero mayor es: "+max);
    }
    
    static int numeromaximo(int t[]){
    int max;
    max=t[0];
    for(int i = 0; i< t.length;i++)
    {
        //condicional para saber que numero es mayor
        //la variable max comienza en la posicion 0 con valor nulo y en la condicional
        //pregunta si lo que tiene t es mayor que lo que tiene max, si es asi lo almacena en max, 
        //asi hasta que termine el bucle, obteniendo el numero mayor
    if(t[i]>max)max=t[i];
    }
        
        return max;
    }
}
