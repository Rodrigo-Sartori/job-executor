package br.com.rodrigo.job_executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.rodrigo.job_executor.feign.client")
@EnableScheduling
public class JobExecutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobExecutorApplication.class, args);
	}

}
