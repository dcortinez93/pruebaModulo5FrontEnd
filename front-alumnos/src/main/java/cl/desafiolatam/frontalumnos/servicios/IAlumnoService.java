package cl.desafiolatam.frontalumnos.servicios;

import java.util.List;

import cl.desafiolatam.frontalumnos.modelo.AlumnoDTO;



public interface IAlumnoService {
	List<AlumnoDTO> findAll();
}
