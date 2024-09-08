import model.Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Battle {
    private static Scanner input = new Scanner(System.in);

    public static void battleMenu(Pokemon gengar, Pokemon user) throws InterruptedException {

        appears();
        Thread.sleep(2000);

        Boolean gameOver = false;
        while (gameOver == false) {
            System.out.println("+-----------------------++-----------------------+");
            System.out.println("|" + user.getName() + "              |" + "| Gengar                |");
            System.out.println("|Vida: " + user.getLife() + "              |" + "| Vida: " + gengar.getLife() + "             |");
            System.out.println("+-----------------------++-----------------------+");

            System.out.println("Seu turno");
            System.out.println("A - Ataque");
            System.out.println("B - Curar");
            System.out.println("C - Especial");

            String option = input.nextLine();

            switch (option.toLowerCase()) {
                case "a":
                    damage(gengar, user);
                    break;
                case "b":
                    heal(user);
                    break;
                case "c":
                    damageEspecial(gengar, user);
                    break;
                default:
                    System.out.println("Voce perdeu a vez:<");
                    break;
            }

            Thread.sleep(1500);
            System.out.println("===========================================");
            enemyTurn(gengar, user);

            if (gengar.getLife() <= 0) {
                System.out.println("GENGAR IS GONE1)");
                gameOver = true;
            }
            else if(user.getLife() <= 0){
                System.out.println("GAME OVER :)");
                gameOver = true;
            }
        }

    }

    public static void damage(Pokemon gengar, Pokemon user) {
        System.out.println(user.getName() + " usou ataque basico");
        gengar.setLife(gengar.getLife() - user.getBasicAttack());
    }

    public static void damageEspecial(Pokemon gengar, Pokemon user) {

        Random rand = new Random();

        int luck = rand.nextInt(2);
        if (luck == 1) {
            System.out.println(user.getName() + " usou " + user.getEspecialAttackName());
            gengar.setLife(gengar.getLife() - user.getEspecialAttack());
        } else {
            System.out.println(user.getName() + " errou o ataque");
        }
    }

    public static void heal(Pokemon user) {
        System.out.println(user.getName() + " se curou");
        user.setLife(user.getLife() + 25);
    }

    public static void enemyTurn(Pokemon gengar, Pokemon user) {
        Random rand = new Random();

        int enemyRand = rand.nextInt(3);

        switch (enemyRand) {
            case 0:
                damage(user, gengar);
                break;
            case 1:
                heal(gengar);
                break;
            case 2:
                damageEspecial(user, gengar);
        }
    }

    static public void appears() {
        String RESET = "\u001B[0m";
        String MAGENTA = "\u001B[45m";

        System.out.println("A Wild GENGAR Appears!");
        System.out.println(MAGENTA + "⠀⠀⠀⠀⠀⢸⠓⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⠀⠀⢸⠀⠀⠑⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠙⢤⡷⣤⣦⣀⠤⠖⠚⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⣠⡿⠢⢄⡀⠀⡇⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠸⠷⣶⠂⠀⠀⠀⣀⣀⠀⠀⠀\n" + RESET + MAGENTA + "⢸⣃⠀⠀⠉⠳⣷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⢉⡭⠋\n" + RESET + MAGENTA + "⠀⠘⣆⠀⠀⠀⠁⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠘⣦⠆⠀⠀⢀⡎⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⡀⣠⠔⠋⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⡏⠀⠀⣆⠘⣄⠸⢧⠀⠀⠀⠀⢀⣠⠖⢻⠀⠀⠀⣿⢥⣄⣀⣀⣀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⢸⠁⠀⠀⡏⢣⣌⠙⠚⠀⠀⠠⣖⡛⠀⣠⠏⠀⠀⠀⠇⠀⠀⠀⠀⢙⣣⠄\n" + RESET + MAGENTA + "⠀⠀⢸⡀⠀⠀⠳⡞⠈⢻⠶⠤⣄⣀⣈⣉⣉⣡⡔⠀⠀⢀⠀⠀⣀⡤⠖⠚⠀⠀\n" + RESET + MAGENTA + "⠀⠀⡼⣇⠀⠀⠀⠙⠦⣞⡀⠀⢀⡏⠀⢸⣣⠞⠀⠀⠀⡼⠚⠋⠁⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⢰⡇⠙⠀⠀⠀⠀⠀⠀⠉⠙⠚⠒⠚⠉⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⢧⡀⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⠙⣶⣶⣿⠢⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⠀⠀⠉⠀⠀⠀⠙⢿⣳⠞⠳⡄⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + MAGENTA + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠹⣄⣀⡤⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" );
        System.out.println(RESET);
    }
}
