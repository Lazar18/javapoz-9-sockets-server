package com.sda;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);

        System.out.println(scanner.nextLine());

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter output = new PrintWriter(outputStream);

        output.println("Hi");
        output.flush();

        socket.close();
        serverSocket.close();
    }
}
