package br.com.rodrigo.job_executor.feign.dto;

import java.util.List;

public class Details{
	private String database;
	private String validationQuery;
	private List<Object> validChains;
	private List<Object> invalidChains;
	private String path;
	private long total;
	private boolean exists;
	private int threshold;
	private long free;

	public String getDatabase(){
		return database;
	}

	public String getValidationQuery(){
		return validationQuery;
	}

	public List<Object> getValidChains(){
		return validChains;
	}

	public List<Object> getInvalidChains(){
		return invalidChains;
	}

	public String getPath(){
		return path;
	}

	public long getTotal(){
		return total;
	}

	public boolean isExists(){
		return exists;
	}

	public int getThreshold(){
		return threshold;
	}

	public long getFree(){
		return free;
	}
}
