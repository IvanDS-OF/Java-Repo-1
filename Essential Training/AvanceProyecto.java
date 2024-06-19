import java.util.Scanner;

public class AvanceProyecto {
    public static void main(String[] args) {
        //Avanzamos a;adiendo nuevas funcionalidades a nuestro PROYECTO INICIAL
        //Esribimos una bienvenida al usuario de banco
        Scanner scanner = new Scanner(System.in);

        //Definimos las varialbes antes como las buenas prácticas 
        int Risposta = 1;

        do {
            System.out.println("Buen d[ia, qu[e ocupa hacer hoy??");
            System.out.println("1: Consultar saldo");
            System.out.println("2: Ingresar Dinero");
            System.out.println("3: Retirar Dolarukos");
            System.out.println("4: Consultar Ultimos Movimientos");

            Risposta = scanner.nextInt();

            switch (Risposta) {
                case 1:
                    System.out.println("Usted ocupa Consultar su saldo actual");
                    break;
                case 2:
                    System.out.println("Usted Ocupa INGRESAR DINERO");
                    break;
                case 3:
                    System.out.println("Usted Ocupa Retirar Dolarukos");
                    break;
                case 4:
                    System.out.println("Usted va a ver cuándo le sobra jaja");
                    break;

                default:
                    System.out.println("No es posible encontrar su respuesta");
                    break;
            }
            
        } while (Risposta == 0 || Risposta == 1 || Risposta == 2 || Risposta == 3 || Risposta == 4); {
            System.out.println("Terminó el Programa papito, a mimir");
        }

        

    }
}
