package no.kristiania.nimebu;

import org.eclipse.jetty.server.Server;

import java.net.MalformedURLException;
import java.net.URL;

public class ShopServer {

    private final Server shopServer;

    public ShopServer(int port) {
        this.shopServer = new Server(port);
    }

    public void start() throws Exception {
        shopServer.start();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public URL getURL() throws MalformedURLException {
        return shopServer.getURI().toURL();
    }
}
