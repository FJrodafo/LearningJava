package EscribirLeerArchivoTXT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirLeerArchivoTXT {
    static Scanner teclado = new Scanner(System.in);
    static String path = "/home/username/Documents/JavaProject/src/EscribirLeerArchivoTXT/";

    /**
     * 
     * @param args the command lines arguments
     */
    public static void main(String[] args) {
        EscribirArchivoTXT();
        LeerArchivoTXT();
    }

    static void EscribirArchivoTXT() {
        System.out.print("Introduce el nombre del archivo a escribir: ");
        String fileName = teclado.nextLine();
        System.out.print("Introduce el texto a guardar: ");
        String text = teclado.nextLine();
        try {
            // Añadir el true para no borrar el texto ya escrito previamente
            BufferedWriter fw = new BufferedWriter(new FileWriter(path + fileName + ".txt", true));
            fw.write(text);
            fw.newLine();
            fw.close();
        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void LeerArchivoTXT() {
        System.out.print("Introduce el nombre del archivo a leer: ");
        String fileName = teclado.nextLine();
        String contenido = "";
        try {
            BufferedReader fr = new BufferedReader(new FileReader(path + fileName + ".txt"));
            int c;
            while ((c = fr.read()) != -1) {
                contenido += (char) c;
            }
            fr.close();
        } catch (FileNotFoundException e) {
            // Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("El contenido del archivo es....\n\n" + contenido);
    }
}
