package fr.vertours.lowcarbpower.price.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class PriceServiceImpl implements PriceService {


    public String getPrice() {
        DecimalFormat df = new DecimalFormat("#.####");
        double a = 0.1546 + (Math.random() * (0.1587-0.1546));
        return df.format(a);
    }

}
