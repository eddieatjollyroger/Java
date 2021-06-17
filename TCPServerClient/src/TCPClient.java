import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Giff portnumber: ");
        int portNumber = sc.nextInt();
        String hostname = "localhost";

        while (true) {
            //System.out.print("Giff message: ");
            String clientMessage = sc.nextLine();

            try {
                Socket clientSocket = new Socket(hostname, portNumber);

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                out.println(clientMessage);
                System.out.println(in.readLine());

                clientSocket.close();
                out.close();
                in.close();
            } catch (IOException e) {
                System.err.println("Server not found...");
                System.err.println("Exiting...");
                System.exit(0);
            }
        }

    }
}
