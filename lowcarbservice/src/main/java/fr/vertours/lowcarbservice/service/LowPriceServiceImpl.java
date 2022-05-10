package fr.vertours.lowcarbservice.service;

import fr.vertours.lowcarbpower.price.dto.PriceDTO;
import fr.vertours.lowcarbservice.domain.LowPrice;
import fr.vertours.lowcarbservice.repository.LowPriceRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@EnableScheduling
public class LowPriceServiceImpl implements LowPriceService {

    private final LowPriceRepository repository;
    private final RestTemplate restTemplate;

    public LowPriceServiceImpl(LowPriceRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    @Override
    public LowPrice getLatestPrice() {
        return repository.findTopByOrderByTimeDesc()
                .orElse(new LowPrice(
                        BigDecimal.valueOf(0.1560d),
                        LocalDateTime.now()));
    }

    @Scheduled (fixedRate = 1000*5)
    public void priceRequest() {
        PriceDTO priceFromAPI = restTemplate.getForObject(
                "http://Price/api/LowPrice", PriceDTO.class);

        repository.save(new LowPrice(
                        BigDecimal.valueOf(priceFromAPI.price()),
                        priceFromAPI.dateTime()));
    }
}
