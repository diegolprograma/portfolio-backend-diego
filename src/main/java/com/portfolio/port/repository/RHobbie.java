
package com.portfolio.port.repository;

import com.portfolio.port.entity.Hobbie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHobbie extends JpaRepository <Hobbie, Integer> {
    
}

