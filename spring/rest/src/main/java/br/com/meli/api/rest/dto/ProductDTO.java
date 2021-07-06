package br.com.meli.api.rest.dto;

import br.com.meli.api.rest.dao.ProductDAO;
import br.com.meli.api.rest.model.Product;

public class ProductDTO {
    private String title;
    private String description;
    private Integer priceCents;

    public ProductDTO(String title, String description, Integer priceCents) {
        this.title = title;
        this.description = description;
        this.priceCents = priceCents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priceCents=" + priceCents +
                '}';
    }

    public static ProductDTO convert(Product product) {
        return new ProductDTO(product.getTitle(), product.getDescription(), product.getPriceCents());
    }

    public static Product convert(ProductDTO p, ProductDAO dao) {
        return new Product(dao.getProducts().size() + 1, p.getTitle(), p.getDescription(), p.getPriceCents());
    }
}
