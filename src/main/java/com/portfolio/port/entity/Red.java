
package com.portfolio.port.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Red {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    private String nombre;
    
    private String url;
    
    private String icofont;

    public Red() {
    }

    public Red(String nombre, String url, String icofont) {
        this.nombre = nombre;
        this.url = url;
        this.icofont = icofont;
    }

    
}
