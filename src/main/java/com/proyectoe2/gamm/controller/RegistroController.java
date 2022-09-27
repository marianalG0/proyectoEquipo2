package com.proyectoe2.gamm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/Registro")
public class RegistroController {


	// @GetMapping("/index")
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostrarIndex(Model model) { 
	return "Registro/ListaRegistros";
	}
	// @GetMapping("/create")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear() {
	return "book";
	}
	// @PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion, Model model) {
		System.out.println("nombre: " + nombre);
	
		System.out.println("descripcion: " + descripcion);
		
		model.addAttribute("nombre", nombre);
		
		model.addAttribute("descripcion", descripcion);
		
		
		return "Registro/ListaRegistros";
	
}
}
