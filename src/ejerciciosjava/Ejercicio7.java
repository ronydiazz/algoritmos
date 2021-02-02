/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Cada pieza de pan tiene un precio de 5000 mil Si el cliente compra mas de 50
 * piezas, le costara a 4500 si el cliente compra mas de 100 piezas, le costara
 * a 4000 Programa que pida capturar la cantidad de piezas que el cliente
 * compro, y el total que pagara
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int numeropan = 0;
        double total = 0;
        String t;

        System.out.println("Cuantas piezas de pan el cliente compro");
        Scanner sc = new Scanner(System.in);

        numeropan = sc.nextInt();

        if (numeropan >= 50 && numeropan < 100) {

            total = numeropan * 4500;

        } else {

            total = numeropan * 5000;

        }
        if (numeropan >= 100) {
            total = numeropan * 4000;

        }

        //el resultado osea el total se se cambia a un formato string para poder
        //pasar el resultado separando los decimales esto no se va a ver reflejado
        // en la base de datos ya que vamos a mandarle el total sin cambiarle l formato
        // si queremeos mostrar el resultado traido de ua base de datos solo debemos 
        //pasar le resultado final al string del separador
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        t = formatea.format(total);
        System.out.println("El Total a pagar es: \n" + t);
        //   System.out.println(formatea.format(total));

        /* switch(numeropan){} */
    }
}
