package com.pokemons.pokemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class PokemonApplication {

	private static final Logger logger = LoggerFactory.getLogger(PokemonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			logger.info("Let's inspect the beans provided by Spring Boot:");

			logger.info("Id :" + ctx.getId());
			logger.info("Parent :" + ctx.getParent());
			logger.info("AutowireCapableBeanFactory :" + ctx.getAutowireCapableBeanFactory());
			logger.info("ClassLoader :" + ctx.getClassLoader());
			logger.info("Class :" + ctx.getClass());
			logger.info("StartupDate :" + ctx.getStartupDate());
			logger.info("Environment :" + ctx.getEnvironment());
			logger.info("ParentBeanFactory :" + ctx.getParentBeanFactory());
		};
	}
}
