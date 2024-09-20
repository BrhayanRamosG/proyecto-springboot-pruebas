package services;

import models.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getAllProducts();
    Producto getProductById(int id);
}
