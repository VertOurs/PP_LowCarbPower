package fr.vertours.quotingservice.configuration;

import fr.vertours.quotingservice.audit.QuoteEvent;
import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class MonitoringConfig  implements ApplicationListener<QuoteEvent> {


    private MeterRegistry registry;

    public MonitoringConfig(MeterRegistry registry) {
        this.registry = registry;
    }


    @Override
    public void onApplicationEvent(QuoteEvent event) {
//        Counter counter = Counter
//                .builder("priceRequest")
//                .description(" c'est une bonne question")
//                .tags("dev", "performance")
//                .register(registry);
//        counter.increment(1);
//        Counter counter2 = Counter
//                .builder("priceRequestEmail")
//                .description(" c'est toujours une bonne question")
//                .tags("dev", "performance")
//                .register(registry);
//        counter2.increment(2);
        registry.counter("priceRequest", Tags.of("dev", "performance"));
        registry.counter("emailRequest", Tags.of("dev", "performance"));

    }


//public class MonitoringConfig {
//
//    @EventListener
//    void countedQuoteEvent(QuoteEvent event) {
    // registry.counter("priceRequest", Tags.of("dev", "performance"));
//        System.out.println("?");
//    }

//    @Bean
//    public CountedAspect timedAspect(MeterRegistry registry) {
//        return new CountedAspect(registry);
//    }

}
