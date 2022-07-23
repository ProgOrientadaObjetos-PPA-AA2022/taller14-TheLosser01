/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

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
    
    public void establecerConexion(){
         try{
              String url = "jdbc:sqlite:bd/base01.bd";
              conn = DriverManager.getConnection(url);
         }catch (SQLException e) {
             System.out.println(e.getMessage());
         }
    }
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador trabajador){
         ArrayList<Trabajador> lista = new ArrayList<>();
         try{
             establecerConexion();
             Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";
         }
    }
    
}
