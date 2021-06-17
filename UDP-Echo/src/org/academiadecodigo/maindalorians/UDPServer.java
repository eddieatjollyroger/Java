package org.academiadecodigo.maindalorians;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class UDPServer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("giff hostname");
        String hostName = scanner.nextLine();

        System.out.println("giff port numba");
        int portNumber = scanner.nextInt();

        //System.out.println("Giff message");
        //String boas = scanner.next();

        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];


        try {
           DatagramSocket socket = new DatagramSocket(portNumber);
           DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
           socket.receive(receivePacket);

           byte[] message = receivePacket.getData();

           String messageString = new String(message);
           System.out.println(messageString);

           byte[] sendMessage = messageString.toUpperCase().getBytes();
           sendBuffer = sendMessage;


            DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
                    sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
            socket.send(sendPacket);




            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
