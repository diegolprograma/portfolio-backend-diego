
package com.portfolio.port.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    private String especialidad;
    
    private String porcentaje;
    
    private int color;

    public Habilidad() {
    }

    public Habilidad(String especialidad, String porcentaje, int color) {
        this.especialidad = especialidad;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
    
    
    
}
