package com.sen.cloud.bean;

import java.io.Serializable;

public class Product implements Serializable {
    private Long id;
    private String productName;
    private String dbSource;

    public Product() {

    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(Long id, String productName, String dbSource) {
        this.id = id;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
