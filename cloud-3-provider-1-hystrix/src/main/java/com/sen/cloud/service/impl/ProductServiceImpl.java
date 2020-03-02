package com.sen.cloud.service.impl;


import com.sen.cloud.bean.Product;
import com.sen.cloud.mapper.ProductMapper;
import com.sen.cloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper mapper;

    @Override
    public Integer add(Product product) {

        return mapper.add(product);
    }

    @Override
    public Product get(Long id) {
        return mapper.get(id);
    }

    @Override
    public List<Product> getAll() {
        return mapper.getAll();
    }
}
