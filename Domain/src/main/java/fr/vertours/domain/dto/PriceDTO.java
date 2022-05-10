package fr.vertours.domain.dto;

import java.time.LocalDateTime;

public record PriceDTO(double price, LocalDateTime dateTime) {

    public PriceDTO(double price, LocalDateTime dateTime) {
        this.price = price;
        this.dateTime = dateTime;
    }

}
