import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ClientThread implements Runnable{
    private Socket clientSocket;
    private BufferedReader in;
    public ClientThread(Socket clientSocket, BufferedReader in) {
        this.clientSocket = clientSocket;
        this.in = in;
    }

    @Override
    public void run() {
        String serverMessage = null;
        try {
            serverMessage = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(serverMessage);
    }
}
