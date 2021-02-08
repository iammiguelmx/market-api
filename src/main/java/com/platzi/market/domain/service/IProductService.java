package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Optional<List<Product>> getByCategory(int categoryId);
    Product save(Product product);
    boolean delete(int productId);

}
