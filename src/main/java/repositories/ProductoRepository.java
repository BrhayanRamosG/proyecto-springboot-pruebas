package repositories;

import configs.ConfigConsultasProductos;
import mappers.ProductoMapper;
import models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository implements IProductoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ConfigConsultasProductos configConsultasProductos;

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos;
        productos = jdbcTemplate.query(configConsultasProductos.getProductos(), new ProductoMapper());
        return productos;
    }

    @Override
    public Producto findProductoById(int id) {
        Producto producto;
        Object[] params = {id};
        producto = jdbcTemplate.queryForObject(configConsultasProductos.getProducto(), new ProductoMapper(), params);
        return producto;
    }

    @Override
    public void updateProducto(Producto producto) {
        // TODO Pendiente implementacion
    }
}
