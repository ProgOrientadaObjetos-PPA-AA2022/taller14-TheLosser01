/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author VIVOBOOK
 */
public class Estudiante {
     private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Estudiante(String nom, String ape, double c1, double c2, 
            double c3) {
        nombre = nom;
        apellido = ape;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    
    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerApellido(String m) {
        apellido = m;
    }

    public void establecerCal1(double m) {
        calificacion1 = m;
    }

    public void establecerCal2(double m) {
        calificacion2 = m;
    }

    public void establecerCal3(double m) {
        calificacion3 = m;
    }
    
    public double calcularPromedio() {       
        double prom = (calificacion1 + calificacion2 + calificacion3) / 3;
        return prom;       
    }
     
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCal1() {
        return calificacion1;
    }

    public double obtenerCal2() {
        return calificacion2;
    }

    public double obtenerCal3() {
        return calificacion3;
    }

    @Override
    public String toString() {
        
        calcularPromedio();
        
        String cadena = String.format("%s %s\n"
                + "Calificaciones:\n"
                + "%.2f\n"
                + "%.2f\n"
                + "%.2f\n"
                + "Promedio: %.2f\n",
                nombre,
                apellido, 
                calificacion1,
                calificacion2,
                calificacion3,
                calcularPromedio());
        
        return cadena;
    }

    
}
