package hospital;
public class Patient extends Person {
    public boolean hasExpediente;

    public Patient(String nombre, String sexo, String nacimiento, boolean hasExpediente){
        super(nombre, nacimiento, sexo);
        this.hasExpediente = hasExpediente;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre
                + "\nSexo: " + sexo
                + "\nNacimiento: " + fecha_nacimiento;
    }

    
}

// Codigo para generar un expediente
