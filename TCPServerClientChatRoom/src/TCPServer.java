import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class TCPServer {
    LinkedList<Socket> list = new LinkedList<>();


    public void start() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose port: ");
        int portNumber = sc.nextInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(portNumber);
            while (true) {

                System.out.println("Listening for inputs...");
                Socket clientSocket = serverSocket.accept();
                ClientConnection clientConnection = new ClientConnection(clientSocket, this);
                System.out.println(clientSocket);
                list.add(clientSocket);
                Thread clientThread = new Thread(clientConnection);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serverWriteAll(String message) throws IOException {
      //  PrintWriter out = null;
        for (Socket c : list) {
            PrintWriter out = new PrintWriter(c.getOutputStream(), true);
            //System.out.println(message);
            out.println(message);
            
        }
    }
}
