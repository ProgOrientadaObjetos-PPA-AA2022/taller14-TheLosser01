/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {
        try {
            String url = "jdbc:sqlite:bd/base01.bd";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarEstudiante(Estudiante estudiante) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido, calificacion1, calificacion2, calificacion3)"
                    + "values ('%s', '%s', '%.2f', '%.2f', '%.2f')",
                    estudiante.obtenerNombre(),
                    estudiante.obtenerApellido(), estudiante.obtenerCal1(),
                    estudiante.obtenerCal2(), estudiante.obtenerCal3());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiante");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Estudiante> obtenerDataEstudiante() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiante miEstudiante = new Estudiante(rs.getString("nombre"),
                        rs.getString("apellido"), rs.getDouble("calificacion1"),
                        rs.getDouble("calificacion2"), rs.getDouble("calificacion3"));
                lista.add(miEstudiante);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiante");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
