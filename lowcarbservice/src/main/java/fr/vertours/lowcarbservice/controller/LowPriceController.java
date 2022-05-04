package fr.vertours.lowcarbservice.controller;

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
    public ResponseEntity<String> getLatestPrice() {
        return ResponseEntity.ok().body(service.getLatestPrice().getPrice().toString());
    }
}
