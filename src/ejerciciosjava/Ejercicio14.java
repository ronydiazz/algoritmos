/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import javax.swing.JOptionPane;

//Introducir en un JOptionPane la cantidad de suedos y mostrar el mayor
public class Ejercicio14 {

    public static void main(String[] args) {

        int CantSueldo = 0;
        int sueldo = 0;
        int numero = 1;
        CantSueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de sueldos"));
        // Con arreglo/matriz
        int cantidadsueldo[] = new int[CantSueldo];
        int mayor = cantidadsueldo[0];
// aca en el for podemos poner en la condicion i <= CantSueldo e inicializar la variable i a 1
//(asi no se crea otra variable en este caso numero ya que no necesitariamos sumarle mas 1 
//esto hacemos porque el arreglo empieza desde cero y no se puede cambiar)
        for (int i = 0; i < cantidadsueldo.length; i++) {
            
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introducir Sueldo N°" + (i+1)));
            cantidadsueldo[i] = sueldo;
            if (cantidadsueldo[i] > mayor) {
                mayor = cantidadsueldo[i];
            }
        }
        JOptionPane.showMessageDialog(null, " El sueldo mayor es: " + mayor);
    }

}
