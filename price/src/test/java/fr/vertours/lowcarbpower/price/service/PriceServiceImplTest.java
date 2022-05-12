package fr.vertours.lowcarbpower.price.service;

import fr.vertours.domain.dto.PriceDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PriceServiceImplTest {

    PriceServiceImpl classUnderTest = new PriceServiceImpl();

    @Test
    void getPrice() {

        PriceDTO actual = classUnderTest.getPrice();
        assertNotNull(actual.price());
        assertNotNull(actual.dateTime());
    }
}