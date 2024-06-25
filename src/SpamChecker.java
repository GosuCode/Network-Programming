import java.io.*;
import java.net.*;
public class SpamChecker {
    public static void main(String[] args) throws Exception {
        String host = "www.shreeshalember.com.np"; // replace with your host name or IP address
        int port = 80; // replace with the port number used by your application
        String message = "Hello Alember! How are you doing?"; // replace with the message to be sent
        boolean isSpam = checkSpam(message); // check if the message is spam
        if (!isSpam) {
            sendMessage(host, port, message); // send the message if it is not spam
        } else {
            System.out.println("The message is identified as spam and will not be sent.");
        }
    }

    private static boolean checkSpam(String message) {
        return false; // replace with your spam detection result
    }
    private static void sendMessage(String host, int port, String message) throws Exception {
        Socket socket = new Socket(host, port); // create a socket to connect to the host
        OutputStream output = socket.getOutputStream(); // get the output stream to send data
        PrintWriter writer = new PrintWriter(output, true); // wrap the output stream with a writer
        writer.println(message); // send the message
        System.out.println("The message has been sent successfully.");
        writer.close(); // close the writer and the socket
        output.close();
        socket.close();
    }
}