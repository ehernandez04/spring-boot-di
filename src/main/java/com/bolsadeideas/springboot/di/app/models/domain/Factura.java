package com.bolsadeideas.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> item;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItem() {
        return item;
    }

    public void setItem(List<ItemFactura> item) {
        this.item = item;
    }
}
