
package com.portfolio.port.service;

import com.portfolio.port.entity.Banner;
import com.portfolio.port.repository.RBanner;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner {
    
     @Autowired
    public RBanner banRepo;
    
    public List<Banner> verBanners() {
        List<Banner> listaBanners= banRepo.findAll();
        return listaBanners;
    }
    
    public void crearBanner(Banner ban) {
        banRepo.save(ban);
    }
    
    public void borrarBanner(int id){
        banRepo.deleteById(id);
    }
    
    public void editarBanner(Banner ban){
        banRepo.save(ban);
    }

    public Banner buscarBanner(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
