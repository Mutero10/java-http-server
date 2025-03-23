package server;

import java.net.ServerSocket;

public class HttpServer {
    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connections on port 8080...");
        
        while (true) {
        }
    }
}
