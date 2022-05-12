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
    public PriceDTO getFinalPrice(Integer nbKWH) {
        return new PriceDTO(
                calculateFinalPrice(nbKWH),
                LocalDateTime.now()
        );
    }

    public double calculateFinalPrice(Integer nbKWh) {
        BigDecimal cleanPrice =
                BigDecimal.valueOf(getCleansSourcesPercentage(nbKWh))
                .multiply(BigDecimal
                        .valueOf(lowCarbService.getLowCarbServiceAPI()));

        BigDecimal dirtyPrice =
                BigDecimal.valueOf(getDirtiesSourcesPercentage(nbKWh))
                        .multiply(BigDecimal
                                .valueOf(coalFiredService.getCoalFiredMock()));

        return cleanPrice.add(dirtyPrice).doubleValue();

    }

}
