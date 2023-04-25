
package com.portfolio.port.service;

import com.portfolio.port.entity.Proyecto;
import com.portfolio.port.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
        @Autowired
    public RProyecto proRepo;
    
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos= proRepo.findAll();
        return listaProyectos;
    }
    
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }
    
    public void borrarProyecto(int id){
        proRepo.deleteById(id);
    }
    
    public void editarProyecto(Proyecto pro){
        proRepo.save(pro);
    }

    public Proyecto buscarProyecto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
