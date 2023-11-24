/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.System.in;
import java.util.Scanner;
import ejercicio2.Clientes.*;
import java.util.ArrayList;

//       public static void gestionarClientes() {
//            System.out.println("");
//          System.out.println("Ejercicio 2");
//          System.out.println("");
//           System.out.println("Crea una clase llamada RegistroClientes que permita "
//                   + "gestionar dinámicamente un conjunto de objetos Cliente."
//                   + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo.\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
//                   + "\nDebe calcular la cantidad de bytes total del prcedimiento calcular saldo total.\n");
//        // Implementa la lógica del ejercicio 2 aquí
/**
 *
 * @author UCR
 */
public class RegistroCliente {
    String name;

    public static void main(String[] args) throws IOException {

        System.out.println("Bienvenido al sistema de gestion de Clientes"
                + " del examen");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        System.out.println("\nElija una opcion ");
        System.out.println("1. Agregar clientes");
        System.out.println("2. Ver clientes");
        System.out.println("3. Ver saldos");
        System.out.println(" 0. salir");

        switch (opcion) {
            case 1:
                agregarClientes(args);

                break;

            case 2:
                verClientes(name, 0, 0);

                break;

            case 3:
                saldo(0);

                break;

            case 0:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                break;
        }

        br.close();

    }

    Clientes Clientes[] = new Clientes[5];

    public static void agregarClientes(String Clientes[]) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor ingrese el nuevo nombre del Cliente");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = null;
            
             System.out.println("Por favor ingrese el id del cliente");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            int idClient;
            
            System.out.println("Por favor ingrese el saldo del cliente");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            int saldo;
            
            //no los pude unir en un arreglo, :,(
            
            

        }

    }
    
    
    public static void verClientes (String name, int idClient, int saldo){
        System.out.println("El nombre es: " + name);
            System.out.println("El id es: " + idClient);
            System.out.println("El saldo es : " + saldo);
    }
    
    
    public static void saldo (int saldo){
    
        System.out.println("El saldo es : " + saldo* 5);
        // lo multiplico por los puntos que voy a teer del examen
    
    
    
    }

}
