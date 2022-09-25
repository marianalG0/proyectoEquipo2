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
	return "Registro/FromRegistro";
	}
	// @PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(@RequestParam("nombre") String nombre,@RequestParam("precio") String precio,@RequestParam("descripcion") String descripcion,@RequestParam("descuento") String descuento, Model model) {
		System.out.println("nombre: " + nombre);
		System.out.println("precio: " + precio);
		System.out.println("descripcion: " + descripcion);
		System.out.println("descuento: " + descuento);
		model.addAttribute("nombre", nombre);
		model.addAttribute("precio", precio);
		model.addAttribute("descripcion", descripcion);
		model.addAttribute("descuento", descuento);
		
		return "Registro/ListaRegistros";
	
}
}
