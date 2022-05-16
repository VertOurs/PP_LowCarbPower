package fr.vertours.quotingservice.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CoalFireServiceStub implements CoalFiredService {

    @Override
    public BigDecimal getCoalFiredStub() {
        return BigDecimal.valueOf(0.081D) ;
    }
}
