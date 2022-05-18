package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Boitier;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Boitier entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BoitierRepository extends JpaRepository<Boitier, Long> {}
