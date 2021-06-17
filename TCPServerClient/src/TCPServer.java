import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose port: ");
        int portNumber = sc.nextInt();

        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(portNumber);
                System.out.println("Listening for inputs...");
                Socket clientSocket = serverSocket.accept();

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String message = in.readLine();
                System.out.println(message);
                out.println(message.toUpperCase());


                serverSocket.close();
                clientSocket.close();
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
