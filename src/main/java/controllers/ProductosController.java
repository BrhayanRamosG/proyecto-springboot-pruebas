package controllers;

import models.Producto;
import models.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ProductoService;

import java.util.List;

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
    public ResponseEntity<?> obtenerProducto(@PathVariable int idProducto) {
        Producto producto = productoService.getProductById(idProducto);
        if (producto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarProducto(@RequestBody ProductoRequest request) {
        // TODO Pendiente implementacion
        return null;
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminararProducto(@RequestBody ProductoRequest request) {
        // TODO Pendiente implementacion
        return null;
    }
}
