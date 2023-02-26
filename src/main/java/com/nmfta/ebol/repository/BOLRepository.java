package com.nmfta.ebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nmfta.ebol.model.*;

public interface BOLRepository extends JpaRepository<BOLRequest, Long> {

}
