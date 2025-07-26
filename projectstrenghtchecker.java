import java.util.Scanner;

public class projectstrenghtchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int strength = 0;
        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[a-z].*")) strength++;
        if (password.matches(".*\\d.*")) strength++;
        if (password.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:\";'<>?,./].*")) strength++;

        System.out.print("Password Strength: ");
        switch (strength) {
            case 5 -> System.out.println("Very Strong");
            case 4 -> System.out.println("Strong");
            case 3 -> System.out.println("Medium");
            case 2 -> System.out.println("Weak");
            default -> System.out.println("Very Weak");
        }

        sc.close();
    }
}
