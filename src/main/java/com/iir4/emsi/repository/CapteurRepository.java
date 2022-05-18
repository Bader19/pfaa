package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Capteur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Capteur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CapteurRepository extends JpaRepository<Capteur, Long> {}
