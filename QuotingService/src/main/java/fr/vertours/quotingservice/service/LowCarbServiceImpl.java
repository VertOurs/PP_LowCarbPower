package fr.vertours.quotingservice.service;

import fr.vertours.domain.dto.PriceDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LowCarbServiceImpl implements LowCarbService {

    private final RestTemplate restTemplate;

    public LowCarbServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public double getLowCarbServiceAPI() {
        PriceDTO priceFromAPI = restTemplate.getForObject(
                "http://LowCarbService/api/LowPrice", PriceDTO.class);
        return priceFromAPI.price();
    }
}
