
import java.util.Scanner;
import hospital.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int option;
        int secundaryOption;

        System.out.println("Sistema de salud de el Gobierno de Mexico");
        System.out.println("Coloca la información de tu hospital");
        // instancia
        Hospital hospital = new Hospital("123", "Avenida Universidad, Coatzacoalcos", "Hospital UV", 10);

        do {
            System.out.println("Opciones: \n0) Salir \t1) Hospital \t2) Registros \t3) Personal \t3) Pacientes");

            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" === Informacion del hospital === ");
                    System.out.println(hospital.toString());
                    break;
                
                case 2:
                    System.out.println(" == Citas registradas == ");
                    System.out.println("0) Volver \t1)Agendar cita \t2) Ver citas");
                    secundaryOption = input.nextInt();
                    if (secundaryOption==1){
                        
                    } else if (secundaryOption==2){
                        System.out.println(hospital.getCitas());    // Terminar la funcion
                    } else;
                    break;

                case 3:
                    System.out.println(" == Personal registrado == ");
                    System.out.println("0) Volver \t1)Registrar Doctor \t2)Ver Doctores");
                    secundaryOption = input.nextInt();
                    if (secundaryOption==1){
                        hospital.addDoctor();
                    } else if (secundaryOption==2){
                        System.out.println(hospital.getDoctors());
                    } else;
                    break;

                case 4:
                    System.out.println(" == Pacientes registrados == ");
                    break;

                default:
                    System.out.println("Coloca una opcion disponible");
                    //
                    break;
            }
        } while(option!=0);

        System.out.println(" -- Sistema cerrado -- ");
    }
}
