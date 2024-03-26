import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(34209);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Client says: " + message);
                    
                    // Split the message by commas to handle multiple commands
                    String[] commands = message.split(",");
                    
                    StringBuilder response = new StringBuilder();
                    // Process each command individually
                    for (String command : commands) {
                        // Check the command and append the appropriate response to the response string
                        switch (command.trim().toUpperCase()) {
                            case "GORGE":
                                response.append("STOP");
                                break;
                            case "FREAK":
                                response.append("DROP");
                                break;
                            case "FIRE":
                                response.append("ROLL");
                                break;
                            default:
                                response.append("Unknown command");
                        }
                        
                        // Add a separator between responses
                        response.append("-");
                    }
                    
                    // Remove the trailing separator
                    response.deleteCharAt(response.length() - 1);
                    
                    // Send the response to the client
                    out.println(response.toString());
                }

                clientSocket.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
