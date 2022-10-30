package com.platzi.market.persistence;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import javax.servlet.http.PushBuilder;
import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductosCrudRepository {

    private com.platzi.market.persistence.crud.ProductoCrudRepository productoCrudRepository;

    public List<Producto>  getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public  List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }


    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save (Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

    public String getProductoNombre(int idProducto){
       return productoCrudRepository.findById(idProducto).toString();
    }
}
