package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Plante;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Plante entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PlanteRepository extends JpaRepository<Plante, Long> {}
