
package com.portfolio.port.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    private String imagen;
    
    private String imagenfondo;
    
    private String presentacion;
    
    private String descripcion;

    public Banner() {
    }

    public Banner(String imagen, String imagenfondo, String presentacion, String descripcion) {
        this.imagen = imagen;
        this.imagenfondo = imagenfondo;
        this.presentacion = presentacion;
        this.descripcion = descripcion;
    }
    
    
    
}
