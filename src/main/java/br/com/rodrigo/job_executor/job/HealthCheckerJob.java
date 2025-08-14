package br.com.rodrigo.job_executor.job;

import br.com.rodrigo.job_executor.service.HealthCheckerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class HealthCheckerJob {

    private final HealthCheckerService healthCheckerService;

    @Scheduled(cron =  "1 * * * * *")
    public void execute(){
        System.out.println("job begin");
        healthCheckerService.getHealthCheckerDairy();
        System.out.println("job end");
    }
}
