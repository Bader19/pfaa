package com.iir4.emsi.repository;

import com.iir4.emsi.domain.TypeSol;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TypeSol entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TypeSolRepository extends JpaRepository<TypeSol, Long> {}
