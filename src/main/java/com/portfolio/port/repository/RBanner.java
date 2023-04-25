
package com.portfolio.port.repository;

import com.portfolio.port.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository <Banner, Integer> {
    
}
