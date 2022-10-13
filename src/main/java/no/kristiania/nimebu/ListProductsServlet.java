package no.kristiania.nimebu;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class ListProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        var exampleProduct = new Product();
        exampleProduct.setId(10);
        exampleProduct.setName("Potet");

        var products = List.of(exampleProduct);

        JsonArrayBuilder result = Json.createArrayBuilder();
        for (Product product : products) {
            result.add(Json.createObjectBuilder()
                    .add("productId", product.getId())
                    .add("productName", product.getName())
            );
        }
        resp.getWriter().write(result.build().toString());
    }
}
