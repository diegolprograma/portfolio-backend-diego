
package com.portfolio.port.service;

import com.portfolio.port.entity.Persona;
import com.portfolio.port.repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoRepo;
    
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas= persoRepo.findAll();
        return listaPersonas;
    }
    
    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id){
        persoRepo.deleteById(id);
    }
    
    public void editarPersona(Persona perso){
        persoRepo.save(perso);
    }

    public Persona buscarPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       //Login
   public Persona loginPersona(String email, String password) {
      List <Persona> personas = persoRepo.findByEmailAndPassword(email, password);
       if(!personas.isEmpty()){
           return personas.get(0); //si la lista no esta vacía ,e devuelve la de la posición 0
        }
        return null;
    }
    
}
