package fr.vertours.quotingservice.controller;

import fr.vertours.quotingservice.service.QuotingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/ui")
public class QuotingUIController {

    private final QuotingService quotingService;

    public QuotingUIController(QuotingService service) {
        this.quotingService = service;
    }

    @GetMapping("/quotingService")
    public String getPrice() {
        return "index";
    }

    @PostMapping("/quotingService")
    public String result(@RequestParam int kwh, Model model) {

        model.addAttribute("dto", quotingService.getFinalPriceDTO(kwh));
        return "index";
    }
}
