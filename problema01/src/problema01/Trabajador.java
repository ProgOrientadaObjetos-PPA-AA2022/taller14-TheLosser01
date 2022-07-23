/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;
    
    public Trabajador(String c, String n, String cr, double s, String mS){
        cedula = c;
        nombres = n;
        correo = cr;
        sueldo = s;
        mesSueldo = mS;        
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerCorreo(String cr){
        correo = cr;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public void establecerMesSueldo(String mS){
        mesSueldo = mS;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerMesSueldo(){
        return mesSueldo;
    }
    
    

    
}
