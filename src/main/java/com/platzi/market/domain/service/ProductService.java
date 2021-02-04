package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private IProductRepository IProductRepository;

    /**
     *
     * @return list of Porducts
     */
    public List<Product> getAll() {
        return IProductRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return IProductRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return IProductRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return IProductRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            IProductRepository.delete(productId);
            return true;
        }).orElse(false);
    }
}
