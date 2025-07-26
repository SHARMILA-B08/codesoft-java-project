import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket socket = server.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message;

        while (true) {
            message = input.readLine();
            if (message.equalsIgnoreCase("exit")) break;
            System.out.println("Client: " + message);
            System.out.print("You: ");
            output.println(reader.readLine());
        }

        socket.close();
        server.close();
    }
}
