import java.util.Scanner;

public class projectpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String input = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}
