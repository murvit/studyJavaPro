package lesson3.HTTPServer;

import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        HTTPServer server = new HTTPServer(8080, "src\\res");
        server.start();

        System.out.println("Server started...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                server.stop();
                System.out.println("Server stopped!");
            }
        });
    }
}