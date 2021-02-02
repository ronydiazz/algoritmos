
package ejerciciosjava;


//Rellenar matriz 3x5 con datos de tipo char
public class Ejercicio28 {
    public static void main(String... agrs){
    int filas =3;
    int columnas=5;
    
    char[][] letras= new char[filas][columnas];
    char letraSiguiente='A';
    
    for(int i=0;i<filas;i++){
    for(int j=0;j<columnas;j++){
        letras[i][j]=letraSiguiente;
        letraSiguiente++;
     }
   }
    
    for(int i=0;i<filas;i++){
    for(int j=0;j<columnas;j++){
        System.out.print(letras[i][j]+"\t");

     }
     System.out.print("\n");
   }
    
 }
    
}
