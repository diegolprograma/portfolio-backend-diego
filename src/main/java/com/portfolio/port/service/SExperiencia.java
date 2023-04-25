
package com.portfolio.port.service;

import com.portfolio.port.entity.Experiencia;
import com.portfolio.port.repository.RExperiencia;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
       @Autowired
    public RExperiencia expRepo;
    
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias= expRepo.findAll();
        return listaExperiencias;
    }
    
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }
    
    public void borrarExperiencia(int id){
        expRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia exp){
        expRepo.save(exp);
    }

    public Experiencia buscarExperiencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
