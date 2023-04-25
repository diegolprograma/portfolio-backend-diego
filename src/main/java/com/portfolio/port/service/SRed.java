
package com.portfolio.port.service;

import com.portfolio.port.entity.Red;
import com.portfolio.port.repository.RRed;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRed {
    
    @Autowired
    public RRed reRepo;
    
    public List<Red> verRedes() {
        List<Red> listaRedes= reRepo.findAll();
        return listaRedes;
    }
    
    public void crearRed(Red re) {
        reRepo.save(re);
    }
    
    public void borrarRed(int id){
        reRepo.deleteById(id);
    }
    
    public void editarRed(Red re){
        reRepo.save(re);
    }

    public Red buscarRed(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
