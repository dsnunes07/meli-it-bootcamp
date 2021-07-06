package br.com.meli.api.rest.controller;

import br.com.meli.api.rest.dao.ProductDAO;
import br.com.meli.api.rest.dto.ProductDTO;
import br.com.meli.api.rest.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/produtos")
public class ProductsController {

    private ProductDAO dao = new ProductDAO();

    // endpoint do /
    @GetMapping
    public String products() {
        return "You are on products API";
    }

    // endpoint get retornando json
    @GetMapping("/info")
    public ProductDTO productInfo() {
        Product p = new Product(0, "Violão Gianini", "Violão acústico Gianini estudante", 56000);
        return ProductDTO.convert(p);
    }

    // endpoint retornando json com response entity
    @GetMapping("/info-response-entity")
    public ResponseEntity<ProductDTO> productInfoEntity() {
        Product p = new Product(0, "Violão Gianini", "Violão acústico Gianini estudante", 56000);
        return new ResponseEntity<ProductDTO>(ProductDTO.convert(p), HttpStatus.OK);
    }

    // endpoint post recebendo produto no body e retornando uri do produto "criado"
    @PostMapping
    public ResponseEntity<Product> newProduct(@RequestBody ProductDTO p, UriComponentsBuilder uriBuilder) {
        System.out.println("Received: " + p.toString());
        Product product = ProductDTO.convert(p, dao);
        URI uri = uriBuilder.path("/produtos/{code}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    // endpoint get que recebe code do produto no path e retorna novo produto
    @GetMapping
    @RequestMapping("/{code}")
    public ProductDTO productInfo(@PathVariable String code) {
        ProductDTO p = new ProductDTO("Camiseta Beatles", "Camiseta Beatles abbey road", 60000);
        return p;
    }
}
