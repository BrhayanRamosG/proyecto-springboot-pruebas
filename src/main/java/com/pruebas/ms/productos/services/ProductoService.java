package com.pruebas.ms.productos.services;

import com.pruebas.ms.productos.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebas.ms.productos.repositories.IProductoRepository;

import java.util.List;
import java.util.Map;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public List<Producto> getAllProducts() {
        return iProductoRepository.getProductos();
    }

    @Override
    public Producto getProductById(int id, Map<String,String> params) {
        return iProductoRepository.findProductoById(id, params);
    }
}
