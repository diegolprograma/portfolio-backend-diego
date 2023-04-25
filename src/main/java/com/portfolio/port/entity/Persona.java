
package com.portfolio.port.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="edad")
    private int edad;
    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;
    
    @Lob
    private String acercade;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.password = password;
    }

    

    
}
