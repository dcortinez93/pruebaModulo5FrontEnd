package cl.desafiolatam.frontalumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.desafiolatam.frontalumnos.servicios.IAlumnoService;

@SpringBootApplication
public class FrontAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontAlumnosApplication.class, args);
		
		//AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(FrontAlumnosApplication.class);
		//IAlumnoService alumnoService = acac.getBean(IAlumnoService.class);
		//System.out.println(alumnoService.findAll());

	}

}
