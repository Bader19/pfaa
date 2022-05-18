package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Connecte;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Connecte entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConnecteRepository extends JpaRepository<Connecte, Long> {}
