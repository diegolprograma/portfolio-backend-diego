
package com.portfolio.port.service;

import com.portfolio.port.entity.Educacion;
import com.portfolio.port.repository.REducacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    
    @Autowired
    public REducacion eduRepo;
    
    public List<Educacion> verEducaciones() {
        List<Educacion> listaEducaciones= eduRepo.findAll();
        return listaEducaciones;
    }
    
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
    public void borrarEducacion(int id){
        eduRepo.deleteById(id);
    }
    
    public void editarEducacion(Educacion edu){
        eduRepo.save(edu);
    }

    public Educacion buscarEducacion(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
