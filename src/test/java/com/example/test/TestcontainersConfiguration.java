package com.example.test;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class TestcontainersConfiguration {

	@Bean
	@ServiceConnection
	MariaDBContainer<?> mariaDbContainer() {
		return new MariaDBContainer<>(DockerImageName.parse("mariadb:latest"));
//		return new MariaDBContainer<>("mariadb:10.5")
//				.withUsername("test")
//				.withPassword("test")
//				.withDatabaseName("testdb");
	}

}
