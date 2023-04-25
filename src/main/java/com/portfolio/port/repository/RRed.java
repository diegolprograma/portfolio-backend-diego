
package com.portfolio.port.repository;

import com.portfolio.port.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository <Red, Integer> {
    
}