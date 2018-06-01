package main.java.com.codecool.annotations;

import java.lang.reflect.Method;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;


/**
 *  Balázs Párducz, 1st July 2018.
 */
public class WebRouteHomeWork {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Find the class with Reflection
        Class myRouteMethods = MyRouteMethods.class;
        Object instance = myRouteMethods.newInstance();
        Method[] methods = myRouteMethods.getMethods();
        try {
            for (Method m : methods) {
                if (m.isAnnotationPresent(WebRoute.class)) {
                    server.createContext(m.getAnnotation(WebRoute.class).value(), new MyRouteMethods());
                }
            }
        } catch (Throwable ex) {
            System.out.println("An error occurred. Please, ask a mentor.");
        }

        server.setExecutor(null);
        server.start();
    }
}