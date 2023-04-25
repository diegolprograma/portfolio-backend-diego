
package com.portfolio.port.service;

import com.portfolio.port.entity.Habilidad;
import com.portfolio.port.repository.RHabilidad;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    
        @Autowired
    public RHabilidad habRepo;
    
    public List<Habilidad> verHabilidades() {
        List<Habilidad> listaHabilidades= habRepo.findAll();
        return listaHabilidades;
    }
    
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }
    
    public void borrarHabilidad(int id){
        habRepo.deleteById(id);
    }
    
    public void editarHabilidad(Habilidad hab){
        habRepo.save(hab);
    }

    public Habilidad buscarHabilidad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
