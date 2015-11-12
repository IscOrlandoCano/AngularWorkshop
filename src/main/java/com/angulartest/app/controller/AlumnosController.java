package com.angulartest.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.angulartest.app.model.Alumno;
import com.angulartest.app.service.AlumnosService;

@RestController
@RequestMapping("/api/")
public class AlumnosController {
	
	@Autowired
	private AlumnosService service;
	
	@RequestMapping(value = "/alumnos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody List<Alumno> getAlumnos(HttpServletResponse httpResponse) throws IOException{
		List<Alumno> alumnos = null;
		try{
			alumnos = service.find();
			return alumnos;
		}catch(Exception e){
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
	}
//	@RequestMapping(value = "/alumnos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
//	public @ResponseBody List<Alumno> getAlumnos(@RequestBody Alumno jsonObject,
//															HttpServletResponse httpResponse) throws IOException{}
}
