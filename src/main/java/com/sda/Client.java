package com.sda;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter output = new PrintWriter(outputStream);

        output.println("Hello world");
        output.flush();

        Scanner scanner = new Scanner(socket.getInputStream());
        String next = scanner.next();
        System.out.println(next);

        socket.close();
    }
}
