/*
Crear un programa en Java que permita registrar el ingreso económico de las
n personas en un arreglo de datos. Visualizar ingreso promedio, ingreso mayor
de las personas.
 */

package Programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args){
        int n;
        Scanner lectura=new Scanner(System.in);
        double sumaIngresos=0,ingresoMayor=0;
        //Ingreso de datos
        System.out.print("Ingrese el número de personas: ");
        n = lectura.nextInt();
        double[] ingresos=new double[n];
        //Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
            sumaIngresos += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        double promedioIngreso = sumaIngresos / n;
        
        //Salida de datos
        System.out.println("El ingreso promedio de las personas es: " + promedioIngreso);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
    }
}
