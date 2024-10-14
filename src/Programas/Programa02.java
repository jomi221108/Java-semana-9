/*
Crear un programa en Java que permita almacenar en un arreglo de datos cinco
n�meros ingresados y realizar una b�squeda mediante un n�mero ingresado.
Visualizar un mensaje indicando si el n�mero existe o no existe. 
Ejemplo:
A[5]=10 20 30 40 50
nbus=30
Resultado:
mensaje=�Si existe el n�mero�
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
            System.out.print("Ingresar n�mero "+(i+1)+": ");
            numero=lectura.nextInt();
            anumeros[i]=numero;
        }
        System.out.print("Ingresar n�mero a buscar: ");
        nbus=lectura.nextInt();
        //Proceso de datos
        for(i=0;i<anumeros.length;i++){
            if(anumeros[i]==nbus){
                mensaje="Si existe el n�mero";
                i=anumeros.length+1;
            }else{
                mensaje="No existe el n�mero";
            }
        }
        //Salida de datos
        System.out.println(mensaje);
    }
}
