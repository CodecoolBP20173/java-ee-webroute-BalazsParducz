package main.java.com.codecool.annotations;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class MyRouteMethods implements HttpHandler {

    @WebRoute("/test")
    public void onTest(HttpExchange t) throws Exception {
        String response = "<p>I came from route <h1>/test <h/1></p>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    @WebRoute("/index")
    public void onIndex(HttpExchange t) throws Exception {
        String response = "<p>I came from route <h1>/index <h/1></p>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    @WebRoute("/zoli")
    public void onZoli(HttpExchange t) throws Exception {
        String response = "<p>I came from route <h1>/zoli <h/1></p>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    @WebRoute("/bence")
    public void onBence(HttpExchange t) throws Exception {
        String response = "<p>I came from route <h1>/bence <h/1></p>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = "<h1>This is the response</h1>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
