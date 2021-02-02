/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/*
*Crear un programa para la gestion de facturas de una empresa 
que se dedica a la venta de azúcar por kilos.
En cada factura se ingresara el codigo del producto vendido.
Ademas se ingresara la cantidad de kilos vendida 
y el total a pagar por kilos 
1- De 5 facturas introducidas, se pide:
2- Facturacion total, cantidad de kilos vendidaas, y cuantas 
facturas fueron emitidas por mas de 100.000 Gs 
 */
public class Ejercicio12 {

    public static void main(String[] agrs) {
        String codigo = "";
        int cantkilos = 0;
        float precio = 0;
        float totalpagar = 0;
        float totalpagarfinal = 0;
        int factEmitMayDe100 = 0;
        int totalkilos = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=5; i++) {
            System.out.println("Factura N°: " + i);
            System.out.println("Introducir Codigo de Producto: ");
            codigo = sc.next();

            System.out.println("Ingrese la cantidad de kilos: ");
            cantkilos = sc.nextInt();

            System.out.println("Ingrese precio del Azúcar");
            precio = sc.nextInt();

            totalpagar = precio * cantkilos;
            totalpagarfinal = totalpagarfinal + totalpagar;
            totalkilos = totalkilos + cantkilos;

            if (totalpagar > 100000) {
                factEmitMayDe100++;
            }
        }
            System.out.println("La Facturacion total es: " + totalpagarfinal);
            System.out.println("La cantidad de kilos vendida es: " + totalkilos);
            System.out.println("La cantidad de Facturas que supera el valor de 100.000 es: " + factEmitMayDe100);


    }

}
