package hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    private ArrayList<Doctor> doctorsLists;
    public static int pacientes;
    private ArrayList<Patient> pacientesList;
    public int nivel;
    
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
        doctorsLists = new ArrayList<Doctor>();
        pacientesList = new ArrayList<Patient>();
        citas = new Appointment[this.citasPorDia];
    }

    public String generarCita(){
        Scanner temp = new Scanner(System.in);
        System.out.println("1) Seleccionar paciente \t 2) Agregar un nuevo paciente");
        int option = temp.nextInt();
        Patient paciente;

        if (option == 1){
            System.out.println("Coloca el id del usuario: ");
            paciente = pacientesList.get(temp.nextInt());

        } else if (option == 2){
            // Generar un paciente
            System.out.println("Coloca la informacion del Paciente: "
                                + "Nombre, sexo, nacimiento");
            paciente = new Patient(temp.next(), temp.next(), temp.next());
            this.pacientesList.add(paciente);

        } else if (option == 0) {
            temp.close();
            return ("Proceso cancelado");

        } else if (option != 1 || option != 2 ) {
            temp.close();
            return ("Opcion no disponible, proceso cancelado");
        }

        // Corregir el error de paciente (Posibilidad de objeto vacio) ------------------------

        Hospital.pacientes+=1;  // Conteo mas uno
        System.out.println("Para agendar la cita, coloca: ");
        System.out.println("Id de cita, Fecha de cita, Numero de area, Id de doctor");
        Appointment cita = new Appointment(temp.nextInt(), temp.next(),
                 null, this, paciente, this.getDoctor(temp.nextInt()));
        temp.close();
        return ("Cita registrada con exito");
    }

    public String getCitas(){
        // Terminar la funcion
        return ("");
    }

    public void addDoctor(){
        // Constructor doctor
        System.out.println("Coloca la informacion del doctor: "
                            + "Nombre, nacimiento, sexo, especialidad");
        Scanner temp = new Scanner(System.in);
        Doctor doctor = new Doctor(temp.next(), temp.next(), temp.next(), temp.next());
        this.doctorsLists.add(doctor);
        temp.close();

    }

    public void addPatient(){
        // Se genera un paciente
    }

    public Doctor getDoctor(int id){
        return (doctorsLists.get(id));
    }

    public String getElements(boolean option){
        String list = "";
        for (int i = 0; i < citas.length; i++) {
            if (citas[i] == null) continue;
            else {
                list += ( citas.toString() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin citas agendadas !!" : list );
    }

    public String getDoctors(){
        String list = "";
        for (int i = 0; i < doctorsLists.size(); i++) {
            if (doctorsLists.get(i) == null) continue;
            else {
                list += ( doctorsLists.get(i).getNombre() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin personal !!" : list );
    }
    /**
     * Sobreescritura de toString
     * @return Informacion de hospital
     */
    @Override
    public String toString() {
        return "Hospital: " + nombre 
                + "\n" + direccion
                + "\nCitas por dia: " + citasPorDia
                + "\nLista de doctores: [" + doctorsLists + "]";
    }
}
