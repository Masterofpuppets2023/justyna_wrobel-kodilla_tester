import java.util.Scanner;

public class ColorName {
    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color first letter");
        while (true) {
            String entry = scanner.nextLine().trim().toUpperCase();
            switch (entry) {
                case "W": return "WHITE";
                case "Y": return "YELLOW";
                case "G": return "GREEN";
                case "O": return "ORANGE";
                case "R": return "RED";
                case "B": return "BLUE";
                case "P": return "PURPLE";
                default:
                    System.out.println("Enter just first letter");
            }
        }

    }
}
