/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Empleado;
        double Ingreso,gasto,ahorrom,ahorroa;
        Scanner Lectura =new Scanner(System.in);
        System.out.print("Nombre del empleado ");
        Empleado=Lectura.next();
        System.out.print("Ingresos del empleado ");
        Ingreso=Lectura.nextDouble();
        System.out.print("Gastos del empleado ");
        gasto=Lectura.nextDouble();
        ahorrom=Ingreso-gasto;
        ahorroa=ahorrom*12;
        System.out.println("Ahorro mensual: "+ahorrom);
        System.out.println("Ahorro anual: "+ahorroa);
        
    }
    
}
