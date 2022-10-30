package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "clientes")
public class Cliente {


    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Long celuar;

    private String dirrecion;

    @Column (name = "Correo_electronico")
    private String correElectronico;

    @OneToMany (mappedBy = "cliente")
    private List<Compra> compra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCeluar() {
        return celuar;
    }

    public void setCeluar(Long celuar) {
        this.celuar = celuar;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getCorreElectronico() {
        return correElectronico;
    }

    public void setCorreElectronico(String correElectronico) {
        this.correElectronico = correElectronico;
    }
}
