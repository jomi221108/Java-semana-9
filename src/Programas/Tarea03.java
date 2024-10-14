/*
Crear un programa en Java que permita registrar las compras de los n personas
en un arreglo de datos. Visualizar el total, promedio y compra mayor y menor.
 */

package Programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args){
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();

        double[] compras = new double[n];
        double sumaCompras = 0;
        double compraMayor = Double.MIN_VALUE;
        double compraMenor = Double.MAX_VALUE;
        
        //Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
            sumaCompras += compras[i];
            
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }

            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }

        double promedioCompras = sumaCompras / n;
        
        //Salida de datos
        System.out.println("El total de las compras es: " + sumaCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}
