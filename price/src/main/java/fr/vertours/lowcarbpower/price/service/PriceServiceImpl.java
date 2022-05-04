package fr.vertours.lowcarbpower.price.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class PriceServiceImpl implements PriceService {


    public double getPrice() {
        DecimalFormat df = new DecimalFormat("#.####");
        return 0.1546 + (Math.random() * (0.1587-0.1546));
    }

}
