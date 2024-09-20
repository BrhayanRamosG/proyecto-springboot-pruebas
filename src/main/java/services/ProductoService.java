package services;

import models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IProductoRepository;

import java.util.List;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public List<Producto> getAllProducts() {
        return iProductoRepository.getProductos();
    }

    @Override
    public Producto getProductById(int id) {
        return iProductoRepository.findProductoById(id);
    }
}
