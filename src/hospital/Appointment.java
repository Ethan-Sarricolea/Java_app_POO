package hospital;
public class Appointment {
    private int id;
    private String fecha; 
    private Area area;
    private Hospital hospital;
    private Patient paciente;
    private Doctor doctor;


    public Appointment(int id, String fecha, Area area, Hospital hospital, Patient paciente, Doctor doctor) {
        this.id = id;
        this.fecha = fecha;
        this.area = area;
        this.hospital = hospital;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    /**
     * @return Informacion de la cita
     */
    @Override
    public String toString() {
        return "Cita [No. " + id + ", fecha=" + fecha + ", area=" + area + ", hospital=" + hospital
                + ", paciente=" + paciente + ", doctor=" + doctor + "]";
    }

    
}
