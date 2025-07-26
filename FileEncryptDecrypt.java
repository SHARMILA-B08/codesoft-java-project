import java.io.*;
import java.util.Scanner;

public class FileEncryptDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Encrypt or Decrypt (e/d): ");
        char choice = sc.next().charAt(0);
        sc.nextLine(); // consume newline

        System.out.print("Enter file path: ");
        String inputPath = sc.nextLine();

        System.out.print("Enter output file path: ");
        String outputPath = sc.nextLine();

        System.out.print("Enter shift key (number): ");
        int key = sc.nextInt();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                if (choice == 'e') {
                    writer.write((char) (c + key));
                } else {
                    writer.write((char) (c - key));
                }
            }
            System.out.println("File processed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
