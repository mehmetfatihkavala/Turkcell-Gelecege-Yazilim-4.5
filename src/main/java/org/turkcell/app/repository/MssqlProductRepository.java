package org.turkcell.app.repository;

import org.turkcell.app.entity.Product;

import java.util.List;

public class MssqlProductRepository implements BaseRepository<Product> {
    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
