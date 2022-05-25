package fr.vertours.PrometheusTest;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusController {

    @Timed(value = "greeting.time", description = "Time taken to return greeting")
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}
