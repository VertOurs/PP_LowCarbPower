package fr.vertours.lowcarbpower.price.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


public record PriceDTO(double price, LocalDateTime dateTime) {
    public PriceDTO(double price, LocalDateTime dateTime) {
        this.price = price;
        this.dateTime = dateTime;
    }
}
