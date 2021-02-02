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
//rellenar una matriz 3x3
public class Ejercicio26 {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        int matriz[][]= new int [3][3];
        
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                
            System.out.println("Introduce un numero:");
            int num= sc.nextInt();
            matriz[i][j]=num;
            }
            
        }
    for(int i= 0;i<3;i++){
           
           
            for(int j=0;j<3;j++){
                
            System.out.print(matriz[i][j]+"\t");
            }
             System.out.print("\n");
        }
    }
}
