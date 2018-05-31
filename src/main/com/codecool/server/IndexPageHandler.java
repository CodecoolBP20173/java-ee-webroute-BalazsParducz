package main.com.codecool.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import main.java.com.codecool.annotations.WebRoute;

import java.io.IOException;
import java.io.OutputStream;

public class IndexPageHandler implements HttpHandler {


    @WebRoute("/")
    public void onIndex(HttpExchange requestData) throws IOException {

    }


    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response = "<h1>Server start success if you see this message</h1>" + "<h1>Port: " + port + "</h1>";
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
