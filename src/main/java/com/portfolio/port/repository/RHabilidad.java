
package com.portfolio.port.repository;

import com.portfolio.port.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer> {
    
}

