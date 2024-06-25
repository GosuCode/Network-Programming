import java.io.*;
import java.net.*;
public class ObjectMethod{
    public static void main(String[] args) {
        try {
            // Create a new socket object and connect to the server at localhost on port 8080
            Socket socket = new Socket("localhost", 8080);
            // Get the input and output streams of the socket
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            /* Send a message to the server by writing to the output stream */
            String message = "Hello, server!";
            outputStream.write(message.getBytes());
            // Read the response from the server by reading from the input stream
            byte[] buffer = new byte[1024];
            int length = inputStream.read(buffer);
            String response = new String(buffer, 0, length);
            // Print the response to the console
            System.out.println("Server response: " + response);
            // Close the socket to release the resources
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}