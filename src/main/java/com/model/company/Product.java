package com.model.company;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Product {
    private String name; // nazwa produktu
    private double price; // cena produktu

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
