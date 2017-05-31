package com.tournament.chess;

import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;
import org.springframework.core.env.*;
import org.springframework.data.mongodb.repository.config.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.i18n.*;

import java.util.*;

/**
 * Created by admin on 2/8/17.
 */

@EnableMongoRepositories
@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@SpringBootApplication
public class Application implements EnvironmentAware {

	private static Logger LOG = LoggerFactory.getLogger(Application.class);

	/**
	 * Starts the Spring Boot application.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void setEnvironment(Environment environment) {
		String[] profiles = environment.getActiveProfiles();
		if (profiles == null || profiles.length == 0) {
			LOG.info("Application started without specifying any profile!");
		} else {
			LOG.info(String.format("Active Profiles = {%s}", profiles));
		}
	}

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setCacheSeconds(3600); //refresh cache once per hour
		return messageSource;
	}

	@Bean
	public ReloadableResourceBundleMessageSource errorMessageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:errors");
		messageSource.setCacheSeconds(3600); //refresh cache once per hour
		return messageSource;
	}
}
