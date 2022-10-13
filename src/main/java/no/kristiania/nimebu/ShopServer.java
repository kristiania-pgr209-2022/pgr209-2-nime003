package no.kristiania.nimebu;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.MalformedURLException;
import java.net.URL;

public class ShopServer {

    private final Server shopServer;

    public ShopServer(int port) {
        this.shopServer = new Server(port);

        var wContext = new WebAppContext();
        wContext.setContextPath("/");
        wContext.setBaseResource(Resource.newClassPathResource("/webapp"));

        shopServer.setHandler(new HandlerList(wContext));
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
