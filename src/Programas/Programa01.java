/*
Crear un programa en Java que permita registrar las edades de los n alumnos en
un arreglo de datos. Visualizar la edad promedio.
Por ejemplo:
n=5
edad1=18
edad2=18
edad3=42
edad4=24
edad5=35
Resultados:
pe=27.4
 */
package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //Declarar variables
        int n,i,edad;
        double pe,acedad=0.0;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar cantidad de edades: ");
        n=lectura.nextInt();
        int[] aedades=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Ingresar la "+(i+1)+"° edad: ");
            edad=lectura.nextInt();
            aedades[i]=edad;
        }
        //Proceso de datos
        for(i=0;i<n;i++){
            acedad+=aedades[i];
        }
        pe=acedad/n;
        //Salida de datos
        System.out.print("El promedio de las edades es: "+pe);
    }
}
