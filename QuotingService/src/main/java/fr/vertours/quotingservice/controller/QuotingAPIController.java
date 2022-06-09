package fr.vertours.quotingservice.controller;

import fr.vertours.domain.dto.PriceDTO;
import fr.vertours.quotingservice.audit.QuoteEvent;
import fr.vertours.quotingservice.service.QuotingService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotingAPIController {

    private final QuotingService service;
    private ApplicationEventPublisher publisher;

    public QuotingAPIController(QuotingService service, ApplicationEventPublisher publisher) {
        this.service = service;
        this.publisher = publisher;
    }


    @GetMapping("/api/quotingService")
    public ResponseEntity<PriceDTO> getPrice(@RequestParam int nbKWh, @RequestParam String email) {
        System.out.println(nbKWh);
        PriceDTO dto = service.getFinalPriceDTO(nbKWh);
        publisher.publishEvent(new QuoteEvent(this, email, dto));
        return ResponseEntity.ok().body(dto);
    }
}
