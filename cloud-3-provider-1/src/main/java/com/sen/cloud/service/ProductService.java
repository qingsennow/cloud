package com.sen.cloud.service;

import com.sen.cloud.bean.Product;

import java.util.List;

public interface ProductService {
    Integer add(Product product);

    Product get(Long id);

    List<Product> getAll();

}