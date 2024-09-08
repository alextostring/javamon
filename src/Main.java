import model.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bem viado ao javamon");
        menu();
    }

    public static void menu() throws InterruptedException {

        System.out.println("+-------Escolha seu Pokemon------+");
        System.out.println("|        1 - Blastoise           |");
        System.out.println("|        2 - Venusaur            |");
        System.out.println("|        3 - Charizard           |");
        System.out.println("+--------------------------------+");

        int option = input.nextInt();
        input.nextLine();
        Pokemon gengar = new Pokemon("Gengar", 400, 35,"Bola Sombria",60);

        switch (option) {
            case 1:
                Pokemon blastoise = new Pokemon("Blastoise", 380, 30, "Hidro Canhão", 50);
                Battle.battleMenu(gengar, blastoise);

                break;
            case 2:
                Pokemon venusaur = new Pokemon("Venusaur", 330, 40,"Chicote de Vinha", 60);
                Battle.battleMenu(gengar, venusaur);
                break;
            case 3:
                Pokemon charizard = new Pokemon("Charizard", 300, 50,"Chama Furacão", 75);
                Battle.battleMenu(gengar, charizard);
                break;
            default:
                System.out.println("Opção invalida");
                menu();
        }
    }
}
