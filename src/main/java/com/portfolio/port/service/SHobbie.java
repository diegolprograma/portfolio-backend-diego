
package com.portfolio.port.service;

import com.portfolio.port.entity.Hobbie;
import com.portfolio.port.repository.RHobbie;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHobbie {
    
    @Autowired
    public RHobbie hobRepo;
    
    public List<Hobbie> verHobbies() {
        List<Hobbie> listaHobbies= hobRepo.findAll();
        return listaHobbies;
    }
    
    public void crearHobbie(Hobbie hob) {
        hobRepo.save(hob);
    }
    
    public void borrarHobbie(int id){
        hobRepo.deleteById(id);
    }
    
    public void editarHobbie(Hobbie hob){
        hobRepo.save(hob);
    }

    public Hobbie buscarHobbie(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
