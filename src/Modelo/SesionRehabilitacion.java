/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oarboleda
 */
public class SesionRehabilitacion {
   private LocalDate fecha;
    private int intensidad;
    private Paciente suPaciente;
    private Terapeuta suTerapeuta;
    public String calcularDescripcionEstadoPaciente(){
        String res;
        double factor;
        double nivel;
       factor=suPaciente.calcularFactorRiesgo();
       nivel=suTerapeuta.calcularNivelEspecialista();
       res="";
       if(factor>nivel){
           res="Requiere atención prioritaria";
           
       }else{
           res="Estable";
       }
       return res; 
    }
    
}
