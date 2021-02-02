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
//ejercicio18
//Programa que nos pida la cantidad de piezas compradas, y el precio por pieza
// si se compraron 100 o mas piezas, se dara el 20% de descuento por pieza
//Calcular el total a pagar, usando un metodo
public class Ejercicio22 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int cantidad;
    double precio;
   
        System.out.println("Introducir precio: ");
        precio= sc.nextDouble();
        
        System.out.println("Introducir cantidad de piezas compradas: ");
        cantidad= sc.nextInt();
        double pago=calcularPago(cantidad, precio);
         System.out.println("El pago total es: "+pago);
    }    
    
        public static double calcularPago(int cantidad, double precio){
    //   double total;
   //    double porcentaje;
       double total_pago ;
       
     //  total= precio*cantidad;
         
        if(cantidad>=100){
        //porcentaje= (total*20)/100;
         total_pago=(precio*cantidad)-((precio*cantidad)*0.20);
         
       
        }else{
       total_pago=precio*cantidad;
        }
       return total_pago;
        }
    
            
    
}
