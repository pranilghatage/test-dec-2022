package com.example.demo.config;

import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.example.demo.containers.MSSQLTestContainer;

@Testcontainers
public class ContainerEnvironment {
	public static MSSQLServerContainer mssqlServerContainer = MSSQLTestContainer.getInstance();
	
	
}
