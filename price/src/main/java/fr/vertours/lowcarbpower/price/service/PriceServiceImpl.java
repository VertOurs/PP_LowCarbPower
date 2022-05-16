package fr.vertours.lowcarbpower.price.service;


import fr.vertours.domain.dto.PriceDTO;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Service
public class PriceServiceImpl implements PriceService {


    public PriceDTO getPrice() {
        double price = 0.1546 + (Math.random() * (0.1587 - 0.1546));
        return  new PriceDTO(price, LocalDateTime.now());
    }

}
