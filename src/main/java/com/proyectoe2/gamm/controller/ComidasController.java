package com.proyectoe2.gamm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectoe2.gamm.model.Comida;
import com.proyectoe2.gamm.service.IComidasService;

@Controller
@RequestMapping("/comidas")
public class ComidasController {

	@Autowired
	private IComidasService serviceComidas; /*Inyectar las clases de servicio en nuestro controlador*/
	
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idComida, Model model) {
		System.out.println("Borrando la comida con id: " + idComida);
		model.addAttribute("id", idComida);
		return"mensaje";
	}
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idComida, Model model) {
		
		Comida comida = serviceComidas.buscarPorId(idComida);
	
		System.out.println("Comida: " + comida);
		model.addAttribute("comida", comida);
		return "detalle";
		
	}
}
