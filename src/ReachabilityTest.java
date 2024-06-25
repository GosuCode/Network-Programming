import java.net.InetAddress;
public class ReachabilityTest {
    public static void main(String[] args) {
        try {
            String hostname = "www.google.com";
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("This is address"+address);

            if (address.isReachable(5000)) {
                System.out.println("Host " + hostname + " is reachable");
            } else {
                System.out.println("Host " + hostname + " is not reachable");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}