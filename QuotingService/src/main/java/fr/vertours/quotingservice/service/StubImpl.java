package fr.vertours.quotingservice.service;

import org.springframework.stereotype.Service;

@Service
public class StubImpl implements CoalFiredService {

    @Override
    public Double getCoalFiredMock() {
        return 0.081D ;
    }
}
