package com.example.ej6.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@SpringBootApplication
//Otras dos formas: quitando el @Component de MiConfiguracion, poner aquí
//@EnableConfigurationProperties(MiConfiguracion.class) o @ConfigurationPropertiesScan(escanea las clases que tengan
//la anotación de @ConfigurationProperties(prefix = "simple")
public class Application {



	@Autowired
	MiConfiguracion miConfiguracion;

	/*
	@Bean
	@Profile("perfil1")
	String getPerfil1() {
		return "Este es " + new Perfil1().miFuncion();
	}

	@Bean
	@Profile("perfil2")
	String getPerfil2() {
		return "Este es " + new Perfil2().miFuncion();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}

	@PostConstruct
	private void postInit(){
		System.out.println("Mi configuración:...");
		System.out.println(miConfiguracion);
	}

}
