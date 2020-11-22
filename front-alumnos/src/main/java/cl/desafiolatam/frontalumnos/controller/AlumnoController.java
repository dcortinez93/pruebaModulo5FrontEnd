package cl.desafiolatam.frontalumnos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.desafiolatam.frontalumnos.modelo.AlumnoDTO;
import cl.desafiolatam.frontalumnos.servicios.IAlumnoService;



@Controller
public class AlumnoController {

	@Autowired
	IAlumnoService alumnoService;
	


	 @RequestMapping("/")
	 public String listaAlumnos(Model modelo) { 
		 List<AlumnoDTO> alumnos = alumnoService.findAll(); 
		 modelo.addAttribute("alumnos", alumnos);
		 return "listaAlumnos"; }
	 
}
