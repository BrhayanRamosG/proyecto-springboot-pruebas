package com.pruebas.ms.productos.repositories;

import com.pruebas.ms.productos.models.Producto;

import java.util.List;
import java.util.Map;

public interface IProductoRepository {
    List<Producto> getProductos();

    Producto findProductoById(int id, Map<String, String> params);

    void updateProducto(Producto producto);
}
