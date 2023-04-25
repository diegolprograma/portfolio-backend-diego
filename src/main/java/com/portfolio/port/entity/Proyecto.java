
package com.portfolio.port.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(String descripcion) {
        this.descripcion = descripcion;
    }
    
 
}
