/*
Crear un programa en Java que permita registrar el peso de las n personas
en un arreglo de datos. Visualizar el peso promedio de las personas. 
 */
package Programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args){
        //Declarar variables
        int num, i = 0;
        double sumaPesos=0.0,promedioPeso;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el número de personas: ");
        num = lectura.nextInt();
        double[] pesos=new double[num];
        //Proceso de datos
        for(i=0;i<num;i++){
            System.out.print("Ingrese el peso de la persona "+(i+1)+": ");
            pesos[i]=lectura.nextDouble();
            sumaPesos+=pesos[i];
        }
        promedioPeso=sumaPesos/num;
        //Salida de datos
        System.out.println("El peso promedio de las personas es: "+promedioPeso+" kg");
    }
}
