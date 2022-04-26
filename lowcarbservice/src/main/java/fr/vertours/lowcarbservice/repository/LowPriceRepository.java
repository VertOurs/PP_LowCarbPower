package fr.vertours.lowcarbservice.repository;

import fr.vertours.lowcarbservice.domain.LowPrice;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface LowPriceRepository extends JpaRepository<LowPrice, Long> {

    Optional<LowPrice> findTopByOrderByTimeDesc();
}
