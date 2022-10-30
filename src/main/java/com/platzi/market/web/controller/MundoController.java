package com.platzi.market.web.controller;

import com.platzi.market.persistence.ProductosCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/saludar")
public class MundoController {

    @GetMapping("/hola/{id}")
    public String saludar(@PathVariable int id){

        ProductosCrudRepository productos = new ProductosCrudRepository();
        return productos.getProductoNombre(id);
    }
}