package MainMenu;

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
            String menu = "    MENU\n1 - Opción\n2 - Opción\n3 - Opción\n4 - Salir";
            Menu.mostrarMenu(menu);
            try {
                // Pedimos al usuario que elija una opción del menú
                System.out.print("Elige una opción: ");
                opcion = teclado.nextInt();
                // Utilizo un switch para representar el contenido del menú
                switch (opcion) {
                    case 1:
                        System.out.println("Elegiste la primera opción");
                        break;
                    case 2:
                        System.out.println("Elegiste la segunda opción");
                        break;
                    case 3:
                        System.out.println("Elegiste la tercera opción");
                        break;
                    case 4:
                        System.out.println("Elegiste la cuarta opción");
                        salir = true;
                        break;
                    /*
                     * En caso de que el usuario no introduzca alguna de las opciones del menú, se
                     * le pedirá que introduzca un número válido
                     */
                    default:
                        System.out.println("Debes introducir un número del 1 al 4");
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
