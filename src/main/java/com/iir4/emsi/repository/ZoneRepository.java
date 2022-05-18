package com.iir4.emsi.repository;

import com.iir4.emsi.domain.Zone;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Zone entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {}
