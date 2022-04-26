package fr.vertours.lowcarbservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class LowPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(scale = 4, precision = 4)
    private BigDecimal price;

    private LocalDateTime time;

    public LowPrice(String price) {
        this.price = new BigDecimal(price);
        this.time = LocalDateTime.now();
    }
}
