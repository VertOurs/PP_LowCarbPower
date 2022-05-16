package fr.vertours.quotingservice.service;

import fr.vertours.domain.dto.PriceDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static fr.vertours.quotingservice.constant.Constants.*;

@Service
public class QuotingServiceImpl implements QuotingService {

    private final CoalFiredService coalFiredService;
    private final LowCarbService lowCarbService;

    public QuotingServiceImpl(CoalFiredService coalFiredService, LowCarbService lowCarbService) {
        this.coalFiredService = coalFiredService;
        this.lowCarbService = lowCarbService;
    }


    @Override
    public PriceDTO getFinalPriceDTO(Integer nbKWH) {
        return new PriceDTO(
                calculateFinalPrice(nbKWH).doubleValue(),
                LocalDateTime.now()
        );
    }

    public BigDecimal calculateFinalPrice(Integer nbKWh) {
        BigDecimal cleanPrice =
                getCleansSourcesPercentage(nbKWh)
                        .multiply(
                                lowCarbService.getLowCarbPrice());
        BigDecimal dirtyPrice =
                getDirtiesSourcesPercentage(nbKWh)
                        .multiply(
                                coalFiredService.getCoalFiredStub());
        return cleanPrice.add(dirtyPrice);

    }

}
