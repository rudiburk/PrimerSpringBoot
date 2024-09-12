package org.example.miprimerspringboot4;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MiPrimerSpringBoot4Application implements CommandLineRunner {

	private final static Logger LOG = LoggerFactory.getLogger(MiPrimerSpringBoot4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerSpringBoot4Application.class, args);
		LOG.info("Primer Hola Mundo");
		LOG.error("mensaje error");
		LOG.warn("mensaje de advertencia");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("se inicio el software");
	}
}
