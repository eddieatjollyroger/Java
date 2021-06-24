import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private ClientConnection clientConnection;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;





    public void begin() {
        Scanner sc = new Scanner(System.in);
        String clientMessage = "";
        int portNumber = 9000;
        String localhost = "localhost";

        try {
            clientSocket = new Socket(localhost, portNumber);

         out = new PrintWriter(clientSocket.getOutputStream(), true);
         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (!clientMessage.equals("/quit")) {

            System.out.print("Giff message: ");

            System.out.println("123");
            clientMessage = sc.nextLine();
            System.out.println(clientMessage);
            out.write(clientMessage);

            out.close();

        }
    }
}