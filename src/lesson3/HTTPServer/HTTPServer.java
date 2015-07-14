package lesson3.HTTPServer;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.Thread;

public class HTTPServer {
    private int port;
    private String path;
    private ListenThread listenThread;

    public HTTPServer(int port, String path) {
        this.port = port;
        this.path = path;
    }

    public void start() {
        listenThread = new ListenThread(port, path);
        listenThread.start();
    }
    
    public void stop() {
    	listenThread.interrupt();
    }
}