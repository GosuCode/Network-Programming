import java.io.*;
import java.net.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000); // create a server socket object listening on port 5000
        System.out.println("Server started...");

        Socket clientSocket = serverSocket.accept(); // wait for a client to connect and accept the connection
        System.out.println("Client connected...");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // create a PrintWriter object to send data to the client
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // create a BufferedReader object to read data from the client
        String inputLine;

        while ((inputLine = in.readLine()) != null) { // read lines of data from the client
            System.out.println("Received message: " + inputLine);
            out.println("Server received message: " + inputLine); // send a response back to the client
        }
        out.close(); // close the PrintWriter
        in.close(); // close the BufferedReader
        clientSocket.close(); // close the client socket
        serverSocket.close(); // close the server socket
    }
}