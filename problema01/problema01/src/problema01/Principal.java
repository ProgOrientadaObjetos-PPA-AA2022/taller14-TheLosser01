/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author VIVOBOOK
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();

        int n = 1;

        while (n != 0) {

            System.out.println("Ingrese cedula: \n");
            String cedula = sc.nextLine();

            System.out.println("Ingrese nombres: \n");
            String nombre = sc.nextLine();

            System.out.println("Ingrese su correo: \n");
            String correo = sc.nextLine();

            System.out.println("Ingrese sueldo: \n");
            double sueldo = sc.nextDouble();

            System.out.println("Ingrese el mes del sueldo: \n");
            sc.nextLine();
            String mes = sc.nextLine();

            Trabajador t1 = new Trabajador(cedula, nombre, correo, sueldo, mes);
            c.insertarTrabajador(t1);

            System.out.println("Ingrese 0 para terminar el proceso: ");
            n = sc.nextInt();
            sc.nextLine();

        }

    }

}
