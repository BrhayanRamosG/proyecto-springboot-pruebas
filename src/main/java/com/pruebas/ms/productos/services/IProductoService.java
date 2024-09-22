package com.pruebas.ms.productos.services;

import com.pruebas.ms.productos.models.Producto;

import java.util.List;
import java.util.Map;

public interface IProductoService {
    List<Producto> getAllProducts();

    Producto getProductById(int id, Map<String, String> params);
}
