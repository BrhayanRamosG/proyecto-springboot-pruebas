package com.pruebas.ms.productos.repositories;

import com.pruebas.ms.productos.configs.ConfigConsultasProductos;
import com.pruebas.ms.productos.mappers.ProductoMapper;
import com.pruebas.ms.productos.models.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Slf4j
@Repository
public class ProductoRepository implements IProductoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ConfigConsultasProductos configConsultasProductos;

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = null;
        try {
            productos = jdbcTemplate.query(configConsultasProductos.getProductos(), new ProductoMapper());
        } catch (EmptyResultDataAccessException erdae) {
            log.error("getProductos error: ", erdae);
        }
        return productos;
    }

    @Override
    public Producto findProductoById(int id, Map<String, String> RequestParams) {
        Producto producto = null;
        Object[] params = {id};
        try {
            String query = configConsultasProductos.getProducto();
            producto = jdbcTemplate.queryForObject(query, new ProductoMapper(), params);
        } catch (EmptyResultDataAccessException erdae) {
            log.error("findProductoById error: ", erdae);
        }
        return producto;
    }

    @Override
    public void updateProducto(Producto producto) {
        // TODO Pendiente implementacion
    }
}
