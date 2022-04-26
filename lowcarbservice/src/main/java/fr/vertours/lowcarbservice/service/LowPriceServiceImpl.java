package fr.vertours.lowcarbservice.service;

import fr.vertours.lowcarbservice.domain.LowPrice;
import fr.vertours.lowcarbservice.repository.LowPriceRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        return repository.findTopByOrderByTimeDesc().orElse(new LowPrice("0.1560"));  //syntaxe ?
    }

    @Scheduled (fixedRate = 1000*5)
    public void priceRequest() {
        String s = restTemplate.getForObject("http://localhost:80/api/LowPrice",String.class);
        s = s.replace(",", ".");     //bigDecimal et String
        repository.save(new LowPrice(s));
    }
}
