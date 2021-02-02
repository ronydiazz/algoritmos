
package ejerciciosjava;


//28.- Ejercicio #28 de Java.- Matriz de 4 x 5, con unos en las orillas, y ceros en el centro.
public class Ejercicio29 {
    public static void main(String... args){
    
        int matriz[][]= new int[4][5];
        
        for(int i=0; i<4;i++){
        for(int j=0; j<5;j++){
            
            if( i==0 || i==3 ){
                 matriz[i][j]=1;
            }
            if( j==0 || j==4){
                 matriz[i][j]=1;
            }
        }
        }
        for(int i=0; i<4;i++){
        for(int j=0; j<5;j++){
            
            System.out.print(matriz[i][j]+"\t");
        }
        System.out.print("\n");
        }
        
    }
}
