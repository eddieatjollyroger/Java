import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Beuas {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getByName("google.com");
            String name = "google.com";
            byte[] boas = address.getHostAddress().getBytes();
            System.out.println(Arrays.toString(boas));
            System.out.println("host IP: " + address.getHostAddress());
            System.out.println("Reachability: " + address.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("Invalid host name indiot");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
