package com.pruebas.ms.productos.mappers;

import com.pruebas.ms.productos.models.Producto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoMapper implements RowMapper<Producto> {
    @Override
    public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
        Producto producto = new Producto();
        producto.setIdProducto(rs.getInt("id_producto"));
        producto.setNombreProducto(rs.getString("name"));
        producto.setStatus(rs.getBoolean("status"));
        return producto;
    }
}
