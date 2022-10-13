package no.kristiania.nimebu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShopServerTest {
    public static ShopServer server;
    @BeforeEach
    void setup() throws Exception {
        server = new ShopServer(0);
        server.start();
    }

    @Test
    void httpResponseShouldBe200Test() throws IOException {
        var connection = openConnection("/");
        assertThat(connection.getResponseCode()).isEqualTo(200);
    }

    @Test
    public void shouldServeH1Test() throws IOException {
        var connection = openConnection("/");
        assertThat(connection.getInputStream()).asString(StandardCharsets.UTF_8).contains("<h1>nimebu Shop!</h1>");
    }

    private HttpURLConnection openConnection(String spec) throws IOException {
        return (HttpURLConnection) new URL(server.getURL(), spec).openConnection();
    }
}