/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
//Guardar 5 numeros en un array y mostrarlos en un orden descendente(en el video es en orden inverso)
public class Ejercicio16 {

    public static void main(String[] args) {
        // int numero=0;
        int numarray[] = new int[5];
        int menor = numarray[0];
        for (int i = 0; i < numarray.length; i++) {
            numarray[i] = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero: "));

//            if (menor < numarray[i]) {
//                menor = numarray[i];
//            }
//            JOptionPane.showMessageDialog(null, "Los numeros inversos son: " + menor);
        }
        
            for (int pasada = 0; pasada < numarray.length; pasada++) {

                for (int k = 0; k < numarray.length; k++) {
                    if (numarray[k] < numarray[k + 1]) {
                        int aux = numarray[k];
                        numarray[k] = numarray[k + 1];
                        numarray[k + 1] = aux;
                    }
                }
            }

            for (int i : numarray) {
                JOptionPane.showMessageDialog(null, "Los numeros inversos son: " + i);
            }
        }
    }

