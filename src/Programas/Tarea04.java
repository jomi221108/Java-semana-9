/*
Crear un programa en Java que permita almacenar en un arreglo de datos cinco
nombres de personas ingresadas y realizar una búsqueda mediante un nombre
ingresado. Visualizar un mensaje indicando si la persona existe o no existe
y la posición del número en el arreglo de datos.
 */
package Programas;
import java.util.Scanner;
public class Tarea04 {
    public static void main(String[] args){
        //Declarar variables
        Scanner lectura=new Scanner(System.in);
        int i,pos=0;
        String bnombre;
        boolean encontrado=false;
        String[] nombres=new String[5];
        //Entrada de datos
        System.out.println("Ingrese 5 nombres de personas");
        for(i=0;i<nombres.length;i++){
            System.out.print("Nombre de la "+(i+1)+"° persona: ");
            nombres[i]=lectura.nextLine();
        }
        System.out.print("Ingrese el nombre a buscar: ");
        bnombre=lectura.nextLine();
        //Proceso de datos
        for(i=0;i<nombres.length;i++){
            if(nombres[i].equalsIgnoreCase(bnombre)){
                encontrado=true;
                pos=i+1;
            }
        }
        //Salida de datos
        if(encontrado){
            System.out.println(bnombre+" existe en la posición "+pos);
        }else{
            System.out.println(bnombre+" no existe entre los ingresados.");
        }
    }
}
