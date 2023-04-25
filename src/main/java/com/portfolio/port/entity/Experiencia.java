
package com.portfolio.port.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String lugar;
    
    
    private String inicio;
    
    
    private String fin;
    
    @Lob
    private String puesto;

    public Experiencia(String lugar, String inicio, String fin, String puesto) {
        this.lugar = lugar;
        this.inicio = inicio;
        this.fin = fin;
        this.puesto = puesto;
    }
    
 
}
