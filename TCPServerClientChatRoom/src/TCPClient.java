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
    private ClientThread clientThread;



    public void begin() {
        Scanner sc = new Scanner(System.in);
        String clientMessage = "";
        int portNumber = 8080;
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
            clientMessage = sc.nextLine();
            out.println(clientMessage);

                clientThread = new ClientThread(clientSocket, in);
                Thread clientThreadRunner = new Thread(clientThread);
                clientThreadRunner.start();


        }
    }
}