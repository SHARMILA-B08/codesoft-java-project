import java.util.*;

public class projectpassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}";
        String characters = "";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) characters += upper;

        System.out.print("Include lowercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) characters += lower;

        System.out.print("Include numbers? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) characters += numbers;

        System.out.print("Include special characters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) characters += special;

        if (characters.isEmpty()) {
            System.out.println("No character set selected.");
            return;
        }

        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(rand.nextInt(characters.length())));
        }

        System.out.println("Generated Password: " + password);
        sc.close();
    }
}
