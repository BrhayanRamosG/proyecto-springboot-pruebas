package repositories;

import models.Producto;

import java.util.List;

public interface IProductoRepository {
    List<Producto> getProductos();
    Producto findProductoById(int id);
    void updateProducto(Producto producto);
}
