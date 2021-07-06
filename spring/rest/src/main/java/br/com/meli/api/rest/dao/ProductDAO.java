package br.com.meli.api.rest.dao;

import br.com.meli.api.rest.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDAO {
    private static List<Product> products = new ArrayList<Product>(
            Arrays.asList(
                    new Product(1,"Livro Clean Code", "Uncle bob", 19000),
                    new Product(2, "Guitarra Gianini", "Stratocaster", 90000),
                    new Product(3, "Guitarra Yamaha", "Stratocaster", 120000),
                    new Product(4, "Baixo Ibanez", "Grave", 78000)
            )
    );

    public ProductDAO() {
    }

    public static List<Product> getProducts() {
        return products;
    }

    public Product get(int id) {
        products.stream()
    }
}
