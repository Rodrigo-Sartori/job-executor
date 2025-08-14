package br.com.rodrigo.job_executor.service;

import br.com.rodrigo.job_executor.feign.client.DairyClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HealthCheckerService {

    private final DairyClient dairyClient;


    public void getHealthCheckerDairy() {
        String status = dairyClient.getHealthStatus();
        if (!status.equals("UP")){
            throw new RuntimeException("Dairy application not alive");
        }
        log.info("Dairy app status {}", status);
    }
}
