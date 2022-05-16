package fr.vertours.quotingservice.service;

import fr.vertours.domain.dto.PriceDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class LowCarbServiceImpl implements LowCarbService {

    private final RestTemplate restTemplate;

    public LowCarbServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public BigDecimal getLowCarbPrice() {
        PriceDTO priceFromAPI = restTemplate.getForObject(
                "http://LowCarbService/api/LowPrice", PriceDTO.class);
        return BigDecimal.valueOf(priceFromAPI.price());
    }
}
