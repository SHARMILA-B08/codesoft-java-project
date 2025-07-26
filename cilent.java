public class cilent {
    public static void main(String[] args) throws java.io.IOException {
        java.net.Socket socket = new java.net.Socket("localhost", 5000);

        java.io.BufferedReader input = new java.io.BufferedReader(
            new java.io.InputStreamReader(socket.getInputStream()));
        java.io.PrintWriter output = new java.io.PrintWriter(socket.getOutputStream(), true);

        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        String message;
        while (true) {
            System.out.print("You: ");
            output.println(reader.readLine());
            message = input.readLine();
            if (message.equalsIgnoreCase("exit")) break;
            System.out.println("Server: " + message);
        }

        socket.close();
    }
}
