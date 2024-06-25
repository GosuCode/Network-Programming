import java.io.IOException;
import java.net.*;
public class GetterMethod {
    public static void main(String[] args) {
        try {
            // Get InetAddress object for localhost
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Localhost IP address: " + localhost.getHostAddress());
            System.out.println("Localhost hostname: " + localhost.getHostName());
            System.out.println("Localhost fully qualified domain name: " + localhost.getCanonicalHostName());
            System.out.println("Localhost raw IP address: " + new String(localhost.getAddress()));
            // Get InetAddress object for a specific hostname or IP address
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google IP address: " + google.getHostAddress());
            System.out.println("Google hostname: " + google.getHostName());
            System.out.println("Google fully qualified domain name: " + google.getCanonicalHostName());
            System.out.println("Google raw IP address: " + new String(google.getAddress()));
            // Create a socket and get its properties
            Socket socket = new Socket("www.google.com", 80);
            System.out.println("Socket local address: " + socket.getLocalSocketAddress());
            System.out.println("Socket remote address: " + socket.getRemoteSocketAddress());
            System.out.println("Socket port number: " + socket.getPort());
            System.out.println("Socket input stream: " + socket.getInputStream());
            System.out.println("Socket output stream: " + socket.getOutputStream());
            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}