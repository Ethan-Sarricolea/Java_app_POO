
import java.util.Scanner;
import hospital.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("Sistema de salud de el Gobierno de Mexico");
        System.out.println("Coloca la información de tu hospital");
        // instancia

        do {
            System.out.println("Opciones: \n0) Salir \t1) Hospital \t2) Registros \t3) Personal \t3) Pacientes");

            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" === Hospitales registrados === ");
                    // hospital.toString
                    break;
                
                case 2:
                    System.out.println(" == Citas registradas == ");

                    break;

                case 3:
                    System.out.println(" == Personal registrado == ");
                    break;

                case 4:
                    System.out.println(" == Selecciona un paciente == ");
                    break;

                default:
                    System.out.println("Coloca una opcion disponible");
                    break;
            }
        } while(option!=0);

        System.out.println(" -- Sistema cerrado -- ");
    }
}
