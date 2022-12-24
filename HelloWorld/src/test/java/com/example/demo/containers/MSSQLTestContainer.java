package com.example.demo.containers;

import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.utility.DockerImageName;

public class MSSQLTestContainer extends MSSQLServerContainer<MSSQLTestContainer>   {
	public static final String IMAGE_VERSION = "mssqlserver:14.0"; 
	static DockerImageName myImage = DockerImageName.parse("mssqlserver:14.0").asCompatibleSubstituteFor("mcr.microsoft.com/mssql/server");
	public static final String DATABASE_NAME = "RedCarpetDB";
	public static MSSQLServerContainer container;
	
	public MSSQLTestContainer() {
		super(myImage);
	}
	
	@SuppressWarnings("resource")
	public static MSSQLServerContainer getInstance() {
		if(container == null)
		{
			container = new MSSQLTestContainer().withDatabaseName(DATABASE_NAME);
		}
		return container;
		
	}
	
	@Override
	public void start() {
		super.start();
		System.setProperty("DB_URL", container.getJdbcUrl());
		System.setProperty("DB_USERNAME", container.getUsername());
		System.setProperty("DB_PASSWORD", container.getPassword());
		
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}
}
