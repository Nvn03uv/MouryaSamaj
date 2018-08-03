package com.bussiness.logic.mouryasamaj.config;

import javax.sql.DataSource;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
class CloudConfig extends AbstractCloudConfig {

	@Bean
	public Cloud cloud() {
		return new CloudFactory().getCloud();
	}

	@Bean
	public DataSource inventoryDataSource() {
		return connectionFactory().dataSource();
	}
}
