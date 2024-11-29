package hospital;

import java.util.ArrayList;

/**
 * Description: Clase hospital
 * @author
 * @Ethan-Sarricolea
 * @version 
 */

public class Hospital {
    public String id;
    public String direccion;
    public String nombre;
    public int citasPorDia;
    private Appointment[] citas;
    private ArrayList[] doctorsLists;
    public static int pacientes;
    
    /**
     * Constructor
     * @param id
     * @param direccion
     * @param nombre
     * @param citasPorDia
     */
    public Hospital(String id, String direccion, String nombre, int limitCitas) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.citasPorDia = limitCitas;
        citas = new Appointment[this.citasPorDia];
    }

    public void generarCita(){
        // constructor paciente
            // +1 conteo pacientes
        // constructor appointment
        // agregar cita a la lista de citas
    }

    public void addDoctor(){
        // Constructor doctor
    }

    /**
     * Sobreescritura de toString
     * @return Informacion de hospital
     */
    @Override
    public String toString(){
        return ("");
    }
}
