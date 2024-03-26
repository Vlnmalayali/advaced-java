import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Specify the IP address and port number
            String ipAddress = "94.237.53.53"; // Example IP address
            int port = 34209;

            Socket socket = new Socket(ipAddress, port);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            // Loop until "quit" is entered
            while (true) {
                System.out.print("Enter your commands separated by commas (or 'quit' to exit): ");
                message = consoleInput.readLine();
                
                // Check if the message is 'quit' to exit the loop
                if ("quit".equalsIgnoreCase(message)) {
                    break;
                }
                
                // Send the message to the server
                out.println(message);
                
                // Receive and print the server response
                System.out.println("Server response: " + in.readLine());
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
