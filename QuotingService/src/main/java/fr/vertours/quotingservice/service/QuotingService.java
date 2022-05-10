package fr.vertours.quotingservice.service;

import fr.vertours.domain.dto.PriceDTO;

public interface QuotingService {

    PriceDTO getFinalPrice(Integer nbKWH);
}
