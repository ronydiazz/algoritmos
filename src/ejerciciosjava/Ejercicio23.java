package ejerciciosjava;

import java.util.Scanner;

//Programa que calcule el costo del estacionamiento en un parking.
//Las primeras 3 horas se cobraran a 20 pesos 
//Las siguientes despues de las 3 horas, a 15 pesos
//Hasta llegar al tope de 250 pesos, para 24 horas.
//Si se permanece aparcado por mas de un dia, se cobraran 250 pesos por dia.
//y 15 pesos las horas siguientes.
//Se le pedira al usuario ingresar la cantidad de horas,
// y debe obtener el precio. Usar metodos
public class Ejercicio23 {

    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar las horas de estacionamiento: ");
        int horas = sc.nextInt();

        double pago = calcularPrecio(horas);
        System.out.println("El total a pagar segun horario aparcado es: " + pago + " pesos");

    }

    public static double calcularPrecio(int horas) {
         double precio, precioresto;
         int restoHoras;
         int dias;
         if(horas<=24){
         if(horas<=3){
         precio= horas*20;
         }else{
         precio=(3*20)+((horas-3)*15);
         if(precio>=250){
         precio=250;
         }
         }
         }else{
             // la division permite saber cuantos dias hay en horas
         dias=horas/24;
         //el porcentaje permite ver cuantas veces cabe 24 en horas y obtener la diferencia osea el restante de horas
         restoHoras=horas%24;
         // preio resto es igual al resto de horas por 15
         precioresto=restoHoras*15;
         // si el precio del resto de hora supera 250 asignamos al precio resto el valor maximo de 250
         if(precioresto>=250){
         precioresto=250;
         }
        //el precio final es el resultado de la cantidad de dias por 250 mas el precio resto de horas
         precio=dias*250+precioresto;
         }
         return precio;

//        int dias;
//        double precio = 0;
//        if (horas <= 3) {
//            precio = 20 * horas;
//
//        } else if (horas > 3 && horas <= 24) {
//
//            precio = (15 * horas) + 15;
//            if (precio >= 250) {
//                precio = 250;
//            }
//        } else if (horas>24 ){
         
//            horas=horas -24;
//        precio = (15 * horas) + 250;
////            if (precio >= 250) {
////                precio = 250;
////            }
//        
//        }else if(){
    
         }
//
//        return precio;
    }

