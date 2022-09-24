package com.proyectoe2.gamm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/secciones")
public class SeccionesController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostrarIndex(Model model) {
		return "secciones/listsecciones";
	}
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear() {
		return "secciones/formSecciones";
	}
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String guardar() {
		return "secciones/listsecciones";
	}
}
