package cl.desafiolatam.frontalumnos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import cl.desafiolatam.frontalumnos.modelo.AlumnoDTO;

@Service
public class AlumnoService implements IAlumnoService {
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<AlumnoDTO> findAll() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<List<AlumnoDTO>> response = restTemplate.exchange("http://localhost:8080/api/v1/alumnos/", 
				HttpMethod.GET, 
				new HttpEntity<AlumnoDTO>(headers), 
				new ParameterizedTypeReference<List<AlumnoDTO>>() {
				});
		return response.getBody();
	}


}
