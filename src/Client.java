import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverHostname = "localhost"; // server hostname
        int serverPort = 5000; // server port

        Socket socket = new Socket(serverHostname, serverPort); // create a socket object to connect to the server
        System.out.println("Connected to server...");

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // create a PrintWriter object to send data to the server

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // create a BufferedReader object to read data from the server

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); // create a BufferedReader object to read user input from the console

        String userInput;

        while ((userInput = stdIn.readLine()) != null) { // read lines of user input
            out.println(userInput); // send the user input to the server
            String serverResponse = in.readLine(); // read the response from the server
            System.out.println("Server response: " + serverResponse);
        }

        out.close(); // close the PrintWriter
        in.close(); // close the BufferedReader
        stdIn.close(); // close the standard input
        socket.close(); // close the socket
    }
}