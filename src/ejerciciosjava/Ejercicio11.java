/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

//El programa pedira 10 numeros enteros
//Y mostrara el promedio de los que sean negativos
//Tambien el promedio de los positivos
//y nos dira cuantos ceros fueron ingresados
public class Ejercicio11 {

    public static void main(String[] args) {
        int num = 0,sumaneg = 0,sumapos=0;
        int numpos = 0, numneg = 0;
        double promedioneg = 0;
        double promediopos = 0;
        int numcero=0;
     
        int y = 0;
      
        Scanner sc = new Scanner(System.in);

        while (y < 10) {
            System.out.println("Introducir numero ");
            num = sc.nextInt();
            
         if (num == 0)numcero++;
         else if (num > 0) {
                numpos++;
                sumapos = sumapos + num;
                
                } else  {
                numneg++;
                sumaneg = sumaneg + num;
                }
           
            y++;
        }

          if (numpos == 0)System.out.println("No se puede realizar el promedio de los positivos");
                
             else {
                promediopos = sumapos / numpos;
                System.out.println("El promedio de los numeros positivos es: " + promediopos);
            }
           if(numneg==0)System.out.println("No se puede reealizar el promedio de los negativos");
           
           else{
               promedioneg=sumaneg/numneg;
            System.out.println("El promedio de los numeros negativos es: " + promedioneg);
           }
           
                System.out.println("La cantidad de Ceros ingresados son: " + numcero);
           


    }
}
