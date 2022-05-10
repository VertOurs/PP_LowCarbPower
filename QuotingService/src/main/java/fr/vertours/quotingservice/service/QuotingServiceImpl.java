package fr.vertours.quotingservice.service;

import fr.vertours.domain.dto.PriceDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static fr.vertours.quotingservice.constant.Constants.*;

@Service
public class QuotingServiceImpl implements QuotingService {

    private final RestTemplate restTemplate;

    public QuotingServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // mock CoalFired a remplacer par l'API
    public Double getCoalFiredMock() {
    //    Double mock = BLOCK_VALUE * 0.081D;
        return 0.081D ;
    }

    //une methode qui récupère LowCarbService (a l'exception de la base de données, il y a un coté très redondant)
    public Double getLowcarbServiceAPI() {
        PriceDTO priceFromAPI = restTemplate.getForObject(
                "http://LowCarbService/api/LowPrice", PriceDTO.class);

        //return priceFromAPI.price() * BLOCK_VALUE;
        return priceFromAPI.price();
    }
    @Override
    public PriceDTO getFinalPrice(Integer nbKWH) {
        return new PriceDTO(calculateFinalPrice(nbKWH), LocalDateTime.now());
    }



    public Double calculateFinalPrice(Integer nbKWh) {
        Double cleanKWh = getCleansSourcesPercentage(nbKWh);
        Double dirtyKWh = nbKWh - cleanKWh;

        Double finalPrice = (cleanKWh * getLowcarbServiceAPI())
                        + (dirtyKWh * getCoalFiredMock());
        return finalPrice;
    }

}
