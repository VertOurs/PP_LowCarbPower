package fr.vertours.lowcarbpower.price.controller;


import fr.vertours.domain.dto.PriceDTO;
import fr.vertours.lowcarbpower.price.service.PriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {


    private PriceService service;

    public PriceController(PriceService service) {
        this.service = service;
    }

    @GetMapping("/api/LowPrice")
    public ResponseEntity<PriceDTO> getPrice() {
        return ResponseEntity.ok().body(service.getPrice());
    }
}
