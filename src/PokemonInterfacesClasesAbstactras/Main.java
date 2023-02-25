package PokemonInterfacesClasesAbstactras;

public class Main {
    /**
     * 
     * @param args the command lines arguments
     */
    public static void main(String[] args) {
        // Objetos
        Bulbasaur bulba = new Bulbasaur();
        Charmander charma = new Charmander();
        Squirtle squir = new Squirtle();
        Pikachu pika = new Pikachu();
        // Ataques
        bulba.AtacarPlacaje();
        charma.AtacarPlacaje();
        squir.AtacarPlacaje();
        pika.AtacarPlacaje();
    }
}
