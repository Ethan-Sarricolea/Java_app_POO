package hospital;
public class Doctor extends Person {
    private String especialidad;

    public Doctor(String nombre, String nacimiento, String sexo, String especialidad){
        super(nombre, nacimiento, sexo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Doctor [nombre=" + nombre + ", especialidad=" + especialidad + ", sexo=" + sexo + "]";
    }

    
}
