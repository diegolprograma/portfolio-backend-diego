
package com.portfolio.port.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    private String lugar;
    
    
    private String inicio;
    
    
    private String fin;
    
    @Lob
    private String descripcion;
    
    

    public Educacion() {
    }

    public Educacion(String lugar, String inicio, String fin, String descripcion) {
        this.lugar = lugar;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }



 
    



}
