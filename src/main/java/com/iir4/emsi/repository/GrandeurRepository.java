package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Grandeur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Grandeur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GrandeurRepository extends JpaRepository<Grandeur, Long> {}
