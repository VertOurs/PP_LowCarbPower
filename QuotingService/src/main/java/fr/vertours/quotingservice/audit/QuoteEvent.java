package fr.vertours.quotingservice.audit;


import fr.vertours.domain.dto.PriceDTO;
import org.springframework.context.ApplicationEvent;



public class QuoteEvent extends ApplicationEvent {

    private String email;
    private PriceDTO dto;


    public QuoteEvent(Object source, String email, PriceDTO dto) {
        super(source);
        this.email = email;
        this.dto=dto;

    }

    public String getEmail() {
        return email;
    }

    public PriceDTO getDto() {
        return dto;
    }
}
