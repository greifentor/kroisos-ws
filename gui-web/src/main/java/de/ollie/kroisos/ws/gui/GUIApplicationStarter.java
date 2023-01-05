package de.ollie.kroisos.ws.gui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The starter class for the application.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("de.ollie.kroisos.ws.persistence.repository")
@ComponentScan("de.ollie.kroisos.ws")
@EntityScan("de.ollie.kroisos.ws.persistence.entity")
public class GUIApplicationStarter extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GUIApplicationStarter.class, args);
	}

}