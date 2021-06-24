import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientConnection implements Runnable{
    private Socket clientSocket;
    private Socket serverSocket;
    private TCPServer server;
    private TCPClient client;
    private String message = "";
    public ClientConnection(Socket clientSocket, TCPServer server){
        //this.client = new TCPClient(this, clientSocket);

        this.clientSocket = clientSocket;
        this.server = server;
    }

    @Override
    public void run() {
        try {

            //BufferedReader inServer = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            BufferedReader inClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
           // PrintWriter outServer = new PrintWriter(serverSocket.getOutputStream(), true);
            PrintWriter outClient = new PrintWriter(clientSocket.getOutputStream(), true);
        while (!message.equals("/quit")) {

            System.out.println("feck");
                message = inClient.readLine();
            System.out.println("fdc");
            System.out.println(message);
                inClient.close();
                server.serverWriteAll(message);
                outClient.write(message);
                outClient.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

