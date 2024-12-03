package hospital;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description: Clase hospital
 * @author
 * @Ethan-Sarricolea
 */

public class Hospital {
    public String id;
    public String direccion;
    public String nombre;
    private ArrayList<Appointment> citas;
    private ArrayList<Doctor> doctorsLists;
    public static int pacientes;
    private ArrayList<Patient> pacientesList;
    
    /**
     * Constructor de clase hospital
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
     * Metodo para generar una cita recibiendo los datos
     * @return Texto de confirmacion
     */
    @SuppressWarnings("resource")
    public String generarCita(){
        Scanner temp = new Scanner(System.in);
        System.out.println("1) Seleccionar paciente \t 2) Agregar un nuevo paciente");
        int option = temp.nextInt();
        Patient paciente = null;

        if (option == 1){
            System.out.println("Coloca el id del usuario: ");
            try {
                paciente = pacientesList.get(temp.nextInt()-1);
            } catch (Exception e) {
                System.out.println("-- Error - Asegurate de colocar el id correcto -- ");
                return (" -- Error al registrar -- \n");
            }

        } else if (option == 2){
            // Generar un paciente
            System.out.println("Coloca la informacion del Paciente: "
                                + "Nombre, sexo, nacimiento, Expediente (SI o NO)");
            paciente = new Patient(temp.next(), temp.next(), temp.next(), (temp.next() == "SI" ? true : false));
            this.pacientesList.add(paciente);

        } else if (option == 0) {
            return (" -- Proceso cancelado -- ");

        } if (!(option == 1 || option == 2 || option == 0)) {
            return (" -- Opcion no disponible, proceso cancelado -- ");
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
     * Clase para agregar un doctor como empleado al hospital
     * @param doctor (Objeto doctor)
     */
    public void addDoctor(Doctor doctor){
        // Constructor doctor
        this.doctorsLists.add(doctor);
        System.out.println(" -- Doctor agregado -- ");
    }

    /**
     * Getter para el doctor especificado por id
     * @param id
     * @return Objeto doctor
     */
    public Doctor getDoctor(int id){
        try {
            return (doctorsLists.get(id));    
        } catch (Exception e) {
            // Generar un doctor sin definir para agregar
            Doctor anonymous = new Doctor("Sin definir", "sin definir", "sin definir", "sin definir");
            return (anonymous);
        }
        
    }

    /**
     * Getter para las citas registradas
     * @return Lista de citas
     */
    public String getCitas(){
        String list = "";
        for (Appointment appointment : citas) {
            if (appointment == null) continue;
            else {
                list += (appointment.toString() + "\n" );
            }
        }
        return (list == "" ? "¡¡ Sin citas agendadas !!" : list );
    }

    /**
     * Clase para obtener el personal
     * @return Lista de personal del hospital
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
     * @return Lista de pacientes registradoa en citas
     */
    public String getPacientes(){
        String list = "";
        for (int i = 0; i < pacientesList.size(); i++) {
            if (pacientesList.get(i) == null) continue;
            else {
                list += ( "[" + (i+1) + "] " +  pacientesList.get(i).getNombre()
                + " - Tiene expediente: " + (pacientesList.get(i).getHasExpediente() ? "SI" : "NO") + "\n" );
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
                + "\n" + direccion 
                + "\nPacientes por atender: "
                + Hospital.pacientes + "\n";
    }
}