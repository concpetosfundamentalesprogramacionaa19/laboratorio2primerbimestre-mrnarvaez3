/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Laboratorio2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);   
    
    //  Lista de variables que utilizadas.
    String nombre;
    int seguir;
    Double sueldo;
    int hijos;
    double pasaje;
    double bar;
    double salidas;
    double totalb = 0;
    double totalp = 0;
    double totals = 0;
    double total = 0; 
    int cont = 001;
    String mensajef = ""; 
    String reportef = "";
    
    
    do{//  Ciclo principal para la obtencion de datos
        System.out.printf("Reporte 00%d\n\n",cont);
        // pide datos del padre
    System.out.println("Ingrese sus nombres y apelliods por favor:");
    nombre = entrada.nextLine();
    entrada.nextLine();
    System.out.println("Ingrese su sueldo semanal por favor: ");
    sueldo = entrada.nextDouble();
    entrada.nextLine();
    System.out.println("Cuantos hijos tiene?");
    hijos = entrada.nextInt();
    entrada.nextLine();
    mensajef = String.format("Perosna       Pasaje      Bar     Salidas\n");
        for (int i = 1; i <= hijos; i++) { //  Ciclo para pedir datos de los hijos
            System.out.println("Ingrese el gasto semanal de su hijo "+i);
            System.out.println("Pasaje: \n");
            pasaje = entrada.nextDouble();
            System.out.println("Bar: \n");
            bar = entrada.nextDouble();
            System.out.println("Salidas: \n");
            salidas = entrada.nextDouble();
            totalp = totalp + pasaje;
            totalb = totalb + bar;
            totals = totals + salidas;
            total = totalp + totalb +totals;
            mensajef = String.format("%sHijo %d       %.2f        %.2f        "
                    + "%.2f\n", mensajef, i, pasaje, bar, salidas);
         
        }
        //  Recibo todos los datos y los acumulo en una variable String 
        reportef = String.format("%sReporte Gastos de Padres de Familia\nReporte"
                + " 00%d\n\nNombre de padre de familia: %s\nSueldo semanal:"
                + " %.2f\nNumero de hijos: %d\nReporte de Gastos\n%s\n"
                + "Totales        %.2f        %.2f        "
                    + "%.2f\n", reportef, cont, nombre, sueldo, hijos, 
                    mensajef, totalp, totalb, totals);
 
        //  pregunto si el sueldo alcanza o no.
        if(sueldo >= total){
            reportef = String.format("%sEl padre de familia %s le alcanza el "
                    + "dinero semanal para sus gastos\n"
                    + "Fin reporte 00%d\n\n", reportef, nombre, cont);
        }else{
            reportef = String.format("%sEl padre de familia %s le falta el "
                    + "dinero semanal para sus gastos\n"
                    + "Fin reporte 00%d\n\n", reportef, nombre, cont);
        }
        
        
    System.out.println("¿Desea continuar?\n1.- Si\n2.- No"); //  El usuario decide si continua con el reporte
        seguir = entrada.nextInt();
    cont = cont + 1;  
    }while (seguir == 1);
        System.out.printf("%s",reportef); //  Salida de datos
    
    }
}
