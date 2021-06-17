package org.academiadecodigo.maindalorians;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("giff hostname");
        String hostName = scanner.nextLine();

        System.out.println("giff port numba");
        int portNumber = scanner.nextInt();

        System.out.println("Giff message");
        String boas = scanner.next();

        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        byte[] sendMessage = boas.getBytes();
        sendBuffer = sendMessage;

        try {
            DatagramSocket socket = new DatagramSocket();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
                    sendBuffer.length, InetAddress.getByName(hostName), portNumber);
            socket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            socket.receive(receivePacket);
            String fromServer = new String(receivePacket.getData());
            System.out.println(fromServer.toUpperCase());

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
