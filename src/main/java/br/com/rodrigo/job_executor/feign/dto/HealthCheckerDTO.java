package br.com.rodrigo.job_executor.feign.dto;

public class HealthCheckerDTO {
	private Components components;
	private String status;

	public Components getComponents(){
		return components;
	}

	public String getStatus(){
		return status;
	}
}
