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
// De 5 alumnos ingresar el numero de control correspondiente junto a la calificacion del mismo 
// y saber si ha reprobado o no
public class Ejercicio15 {
    public static void main(String[] args){
        int numc=0;
        int cali=0;
           for(int i=0;i<5;i++){
               
 numc=Integer.parseInt(JOptionPane.showInputDialog("Alumno N°:"+(i+1)+ "\nIntroduzca el numero de control",""));
 cali=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Calificación"));
  if(cali>5 &&cali<10){
                 JOptionPane.showMessageDialog(null,"El alumno "+numc+" NO ha reprobado");
   
             }else if(cali<=5){
                 JOptionPane.showMessageDialog(null,"El alumno "+numc+"ha reprobado ");
             }
 
           }
            
    
    }
}
