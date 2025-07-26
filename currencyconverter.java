public class currencyconverter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter amount in INR:");
        double amount = sc.nextDouble();

        System.out.println("Convert to: 1. USD  2. EUR  3. GBP");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("USD: " + amount * 0.012);
            case 2 -> System.out.println("EUR: " + amount * 0.011);
            case 3 -> System.out.println("GBP: " + amount * 0.0095);
            default -> System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
