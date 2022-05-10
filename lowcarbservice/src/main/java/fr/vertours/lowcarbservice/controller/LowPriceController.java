package fr.vertours.lowcarbservice.controller;

import fr.vertours.domain.dto.PriceDTO;
import fr.vertours.lowcarbservice.domain.LowPrice;
import fr.vertours.lowcarbservice.service.LowPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LowPriceController {

    private LowPriceService service;

    public LowPriceController(LowPriceService service) {
        this.service = service;
    }

    @GetMapping("api/LowCarbService")
    public ResponseEntity<PriceDTO> getLatestPrice() {
        LowPrice latestPrice = service.getLatestPrice();
        return ResponseEntity.ok().body(
                new PriceDTO(
                        latestPrice.getPrice().longValue(),
                        latestPrice.getTime()));
    }
}
