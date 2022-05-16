package fr.vertours.quotingservice.controller;

import fr.vertours.domain.dto.PriceDTO;
import fr.vertours.quotingservice.service.QuotingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotingController {

    private final QuotingService service;

    public QuotingController(QuotingService service) {
        this.service = service;
    }

    @GetMapping("/api/quotingService")
    public ResponseEntity<PriceDTO> getPrice(@RequestParam int nbKWh) {
        return ResponseEntity.ok().body(service.getFinalPriceDTO(nbKWh));
    }
}
