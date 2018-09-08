package com.sda;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8082);

        boolean b = true;
        while (b) {
            try {
                Socket socket = serverSocket.accept();
                ServerTask serverTask = new ServerTask(socket);
                new Thread(serverTask).start();
            } catch (Exception e) {
                //consume
            }
        }
        serverSocket.close();
    }
}
