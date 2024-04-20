import java.util.Scanner;

public class Main {
    static String input;

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++ ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wähle Schere oder Stein oder Papier: ");
            input = scanner.nextLine();

            switch(input) {
                case "Schere":
                    System.out.println("Stein! Schere wird stumpf. Computer gewinnt!");
                    System.out.println();
                    break;
                case "Stein":
                    System.out.println("Papier! Papier wickelt Stein ein. Computer gewinnt!");
                    System.out.println();
                    break;
                case "Papier":
                    System.out.println("Schere! Schere schneidet Papier. Computer gewinnt!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }
    }
}

//Schere schlägt Papier schlägt Stein schlägt Schere