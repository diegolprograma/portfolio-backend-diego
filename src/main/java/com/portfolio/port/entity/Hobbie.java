
package com.portfolio.port.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hobbie {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    private String url;
    
    public Hobbie() {
    }

    public Hobbie(String url) {
        this.url = url;
    }
    
    
    
}
