/*
Crear un programa en Java que permita almacenar en un arreglo de datos cinco
números ingresados y realizar una búsqueda mediante un número ingresado.
Visualizar un mensaje indicando si el número existe o no existe. 
Ejemplo:
A[5]=10 20 30 40 50
nbus=30
Resultado:
mensaje=”Si existe el número”
 */
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //Declarar variables
        int numero, nbus, i;
        String mensaje = null;
        Scanner lectura=new Scanner(System.in);
        int[] anumeros=new int[5];
        //Entrada de datos
        for(i=0;i<anumeros.length;i++){
            System.out.print("Ingresar número "+(i+1)+": ");
            numero=lectura.nextInt();
            anumeros[i]=numero;
        }
        System.out.print("Ingresar número a buscar: ");
        nbus=lectura.nextInt();
        //Proceso de datos
        for(i=0;i<anumeros.length;i++){
            if(anumeros[i]==nbus){
                mensaje="Si existe el número";
                i=anumeros.length+1;
            }else{
                mensaje="No existe el número";
            }
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
