package hospital;

import java.util.ArrayList;
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
    private ArrayList<Appointment> citas;
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
    public Hospital(String id, String direccion, String nombre) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        doctorsLists = new ArrayList<Doctor>();
        pacientesList = new ArrayList<Patient>();
        citas = new ArrayList<Appointment>();
    }

    /**
     * 
     * @return
     */
    @SuppressWarnings("resource")
    public String generarCita(){
        Scanner temp = new Scanner(System.in);
        System.out.println("1) Seleccionar paciente \t 2) Agregar un nuevo paciente");
        int option = temp.nextInt();
        Patient paciente = null;

        if (option == 1){
            System.out.println("Coloca el id del usuario: ");
            paciente = pacientesList.get(temp.nextInt());

        } else if (option == 2){
            // Generar un paciente
            System.out.println("Coloca la informacion del Paciente: "
                                + "Nombre, sexo, nacimiento, Expediente (SI o NO)");
            paciente = new Patient(temp.next(), temp.next(), temp.next(), (temp.next() == "SI" ? true : false));
            this.pacientesList.add(paciente);

        } else if (option == 0) {
            return ("Proceso cancelado");

        } if (!(option == 1 || option == 2 || option == 0)) {
            return ("Opcion no disponible, proceso cancelado");
        }

        Hospital.pacientes+=1;  // Conteo mas uno
        System.out.println("Para agendar la cita, coloca: ");
        System.out.println("Id de cita, Fecha de cita, Tipo de area, Id de doctor");
        Appointment cita = new Appointment(temp.nextInt(), temp.next(),
                 temp.next(), this, paciente, this.getDoctor(temp.nextInt()-1));
        citas.add(cita);
        return (" -- Cita registrada con exito -- ");
    }

    /**
     * 
     */
    public void addDoctor(){
        // Constructor doctor
        System.out.println("Coloca la informacion del doctor: "
                            + "Nombre, nacimiento, sexo, especialidad");
        Scanner temp = new Scanner(System.in);
        Doctor doctor = new Doctor(temp.next(), temp.next(), temp.next(), temp.next());
        this.doctorsLists.add(doctor);
        System.out.println(" -- Doctor agregado -- ");
    }

    /**
     * 
     * @param id
     * @return
     */
    public Doctor getDoctor(int id){
        return (doctorsLists.get(id));
    }

    /**
     * 
     * @return
     */
    public String getCitas(){
        String list = "";
        for (Appointment appointment : citas) {
            if (appointment == null) continue;
            else {
                list += ( appointment.toString() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin citas agendadas !!" : list );
    }

    /**
     * 
     * @return
     */
    public String getDoctors(){
        String list = "";
        for (int i = 0; i < doctorsLists.size(); i++) {
            if (doctorsLists.get(i) == null) continue;
            else {
                list += ( "[" + (i+1) + "]" + doctorsLists.get(i).getNombre()
                + " - " + doctorsLists.get(i).getEspecialidad() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin personal !!" : list );
    }

    /**
     * 
     * @return
     */
    public String getPacientes(){
        String list = "";
        for (int i = 0; i < pacientesList.size(); i++) {
            if (pacientesList.get(i) == null) continue;
            else {
                list += ( pacientesList.get(i).getNombre() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin pacientes registrados !!" : list );
    }

    /**
     * Sobreescritura de toString
     * @return Informacion de hospital
     */
    @Override
    public String toString() {
        return "Hospital: " + nombre 
                + "\n" + direccion;
    }
}