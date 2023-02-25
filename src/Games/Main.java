package Games;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * 
     * @param args the command lines arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables para el funcionamiento del menú
        int opcion = 0;
        boolean salir = false;
        // Objetos
        IGames dados = new Dados();
        IGames adivina = new AdivinaNumero();
        PalabraSecreta juego = new PalabraSecreta();
        CarreraCoches carrera = new CarreraCoches();
        // Imprimimos la fecha actual
        Date fecha = new Date();
        System.out.println("\n---- " + fecha + " ----\n");
        // Declaramos el escáner
        Scanner teclado = new Scanner(System.in);
        // Para no tener problemas con los espacios en el escáner usamos lo siguiente:
        teclado.useDelimiter("\n");
        // Para no tener problemas con los decimales en el escáner usamos lo siguiente:
        teclado.useLocale(Locale.US);
        // Bucle para mantener el programa activo hasta que la variable salir sea true
        do {
            // Imprimimos el menú con sus opciones
            String menu = "    MENU\n1 - Dados\n2 - Adivina el número\n3 - Palabra secreta\n4 - Carrera de coches\n5 - Salir";
            Menu.mostrarMenu(menu);
            try {
                // Pedimos al usuario que elija una opción del menú
                System.out.print("Elige una opción: ");
                opcion = teclado.nextInt();
                // Utilizo un switch para representar el contenido del menú
                switch (opcion) {
                    case 1:
                        dados.inicio();
                        dados.desarrollo();
                        dados.fin();
                        break;
                    case 2:
                        adivina.inicio();
                        adivina.desarrollo();
                        adivina.fin();
                        break;
                    case 3:
                        juego.inicio();
                        juego.desarrollo();
                        juego.fin();
                        break;
                    case 4:
                        carrera.inicio();
                        carrera.desarrollo();
                        carrera.fin();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debes introducir un número del 1 al 3");
                        break;
                }
            } catch (InputMismatchException e) {
                /*
                 * Al usar este try_catch nos aseguramos de que el programa no se cuelgue en
                 * caso de que el usuario introduzca un valor no numérico
                 */
                System.out.println("Error al introducir un número.");
                teclado.next();
            }
        } while (!salir);
        // Cerramos el escáner
        teclado.close();
        // El programa ha finalizado correctamente
        System.out.println("\n---- Programa finalizado ----\n");
    }
}
