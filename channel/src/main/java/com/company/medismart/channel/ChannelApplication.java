package com.company.medismart.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan("com.company.medismart.channel.model")
@EnableJpaRepositories(basePackages = {"com.company.medismart.channel.dao"})
@ConfigurationProperties(prefix = "spring.datasource.hikari")
public class ChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}

}
