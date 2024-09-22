package com.pruebas.ms.productos.controllers;

import com.pruebas.ms.productos.models.Producto;
import com.pruebas.ms.productos.models.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pruebas.ms.productos.services.ProductoService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductosController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<?> obtenerProductos() {
        List<Producto> productos = productoService.getAllProducts();
        if (productos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("buscar/{idProducto}")
    public ResponseEntity<?> obtenerProducto(@PathVariable int idProducto, @RequestParam Map<String, String> params) {
        Producto producto = productoService.getProductById(idProducto, params);
        if (producto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarProducto(@RequestBody ProductoRequest request) {
        // TODO Pendiente implementacion
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public ResponseEntity<?> eliminarProducto(@PathVariable int idProducto) {
        // TODO Pendiente implementacion
        return new ResponseEntity<>(idProducto, HttpStatus.OK);
    }
}
