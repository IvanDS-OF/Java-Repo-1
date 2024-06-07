import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        //Vamos a conocer como  se usa la sentencia Awitch
        //Srive para hacer una seleccion entre muchas opciones.  

        Scanner scanner = new Scanner(System.in);

        //Creamos un mensaje de salida para ver el dia de la semana
        System.out.println("En qué día de la semana se encuentra usted");

        String DiaSemana = scanner.nextLine();

        System.out.println("A " + DiaSemana);
        //La sentencia Swith está conformada por un Case y un Break en cada case
        //Como se muestra a continuacion
        switch (DiaSemana) {
            case "Lunes":
                System.out.println("Usted se encuentra en el día: " + DiaSemana);
                break;
            case "Martes":
                System.out.println("Usted se encuentra en el día: " + DiaSemana);
                break;
            case "Miercoles":
                System.out.println("Usted se encuentra en el día: " + DiaSemana);
                break;
            case "Jueves":
                System.out.println("Usted se encuentra en el día: " + DiaSemana);
                break;
            case "Viernes":
                System.out.println("Usted se encuentra en el día: " + DiaSemana);
                break;


            default:
                System.out.println("Ese dia no existe mi pana");
                break;
        }

        System.out.println("Amonos ajuera pa, hace frio aca");

        //En caso de no tener la sentencia Brake 
        //Se van a ejecutar todas las sentencias posteriores en los Cases
        
    }
}
