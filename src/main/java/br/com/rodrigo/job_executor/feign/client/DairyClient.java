package br.com.rodrigo.job_executor.feign.client;

import br.com.rodrigo.job_executor.config.FeignConfig;
import br.com.rodrigo.job_executor.feign.dto.HealthCheckerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "dairyClient",
        url = "${spring.application.external-api.dairy-base-url}",
        configuration = FeignConfig.class
)
public interface DairyClient {

    @GetMapping("/health")
    String getHealthStatus();
}
