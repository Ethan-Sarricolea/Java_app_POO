package hospital;

public class Person {
    protected String nombre;
    protected String fecha_nacimiento;
    protected String sexo;

    public Person(String nombre, String nacimiento, String sexo){
        this.nombre = nombre;
        this.fecha_nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    
}
