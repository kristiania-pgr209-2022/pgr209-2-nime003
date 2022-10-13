package no.kristiania.nimebu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShopServerTest {

    @BeforeEach
    void setup(){
        var server = new ShopServer(0);
        server.start;
    }

    @Test
    void httpResponseShouldBe200Test() throws IOException {
        var connection = openConnection("/");
        assertThat(connection.getResponseCode()).isEqualTo("200");
    }

    private HttpURLConnection openConnection(String spec) throws IOException {
        return (HttpURLConnection) new URL(server.getURL(), spec).openConnection();
    }
}