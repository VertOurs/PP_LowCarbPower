package fr.vertours.lowcarbservice.service;

import fr.vertours.lowcarbservice.domain.LowPrice;
import fr.vertours.lowcarbservice.repository.LowPriceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class LowPriceServiceImplTest {

     LowPriceRepository repository = mock(LowPriceRepository.class);
     RestTemplate restTemplate = mock(RestTemplate.class);

     LowPriceServiceImpl classUnderTest = new LowPriceServiceImpl(
             repository, restTemplate);

    @Test
    void getLatestPrice() {
        LowPrice expected = new LowPrice(
                BigDecimal.valueOf(25.2525d),
                LocalDateTime.now());
        when(repository.findTopByOrderByTimeDesc())
                .thenReturn(Optional.of(expected));

        LowPrice actual = classUnderTest.getLatestPrice();

        verify(repository, times(1))
                .findTopByOrderByTimeDesc();

        assertEquals(
                expected.getPrice(),
                actual.getPrice());

    }

    @Test
    void priceRequest() {
    }
}