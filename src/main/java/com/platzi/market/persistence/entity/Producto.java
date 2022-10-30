package com.platzi.market.persistence.entity;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import javax.swing.text.StyledEditorKit;

@Entity
@Table(name = "productos")
public class Producto {

    @Id // se usa solamente cuando es id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // le digo para que sea autoincremental
    @Column(name = "id_producto") // si la variable se llama distinto que en la base se usa column para decirle como se llama en la base
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne // un Producto tiene 1 categoria y la categoria puede estar en varios productos
    @JoinColumn (name = "id_categoria", insertable = false, updatable = false) // insertable y updatable es para que no puedan borrar,insertar o updatear
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
