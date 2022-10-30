package com.platzi.market.web.controller;

import com.platzi.market.persistence.ProductoRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class MundoController {
    @Autowired // esto se usa para que te cree la instancia Spring
    private ProductoRepository productos;
    @GetMapping("/hola/{id}")
    public String saludar(@PathVariable int id){
        return productos.getProductoNombre(id);
    }
}