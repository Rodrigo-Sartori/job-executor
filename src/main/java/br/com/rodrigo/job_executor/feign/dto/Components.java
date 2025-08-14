package br.com.rodrigo.job_executor.feign.dto;

public class Components {
	private DiskSpace diskSpace;
	private Ping ping;
	private Ssl ssl;
	private Db db;

	public DiskSpace getDiskSpace(){
		return diskSpace;
	}

	public Ping getPing(){
		return ping;
	}

	public Ssl getSsl(){
		return ssl;
	}

	public Db getDb(){
		return db;
	}
}
