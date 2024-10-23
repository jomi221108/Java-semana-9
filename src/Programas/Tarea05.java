/*
Crear un programa en Java que permita almacenar cinco números en el arreglo a
y b. Visualizar los valores del arreglo a y b en forma intercalada en el
arreglo c.
a[]=10 20 30 40 50
b[]=60 70 80 90 100
c[]=10 60 20 70 30 80 40 90 50 100
 */
package Programas;
import java.util.Scanner;
public class Tarea05 {
    public static void main(String[] args){
        //Definir variables
        Scanner lectura=new Scanner(System.in);
        int i,index=0;
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[10];
        //Ingreso de datos
        System.out.println("Ingrese 5 números para el arreglo a: ");
        for(i=0;i<a.length;i++){
            System.out.print((i+1)+"° valor de a: ");
            a[i]=lectura.nextInt();
        }
        System.out.println("Ingrese 5 números para el arreglo b: ");
        for(i=0;i<b.length;i++){
            System.out.print((i+1)+"° valor de b: ");
            b[i]=lectura.nextInt();
        }
        //Proceso de datos
        for(i=0;i<5;i++){
            c[index]=a[i];
            index++;
            c[index]=b[i];
            index++;
        }
        //Salida de datos
        System.out.println("Los valores intercalados de c son:");
        for(i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
