import java.net.InetAddress;
public class IpAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            System.out.println("Host Address: " + address.getHostAddress());
            if (address.isAnyLocalAddress()) {
                System.out.println("This is a wildcard or loopback address");
            }
            if (address.isLoopbackAddress()) {
                System.out.println("This is a loopback address");
            }
            if (address.isLinkLocalAddress()) {
                System.out.println("This is a link-local address");
            }
            if (address.isSiteLocalAddress()) {
                System.out.println("This is a site-local address");
            }
            if (address.isMCGlobal()) {
                System.out.println("This is a global multicast address");
            }

            if (address.isMCOrgLocal()) {
                System.out.println("This is an organization-local multicast address");
            }
            if (address.isMCSiteLocal()) {
                System.out.println("This is a site-local multicast address");
            }
            if (address.isMCLinkLocal()) {
                System.out.println("This is a link-local multicast address");
            }
            if (address.isMCNodeLocal()) {
                System.out.println("This is a node-local multicast address");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}