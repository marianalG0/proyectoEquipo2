package com.proyectoe2.gamm.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyectoe2.gamm.model.Comida;
import com.proyectoe2.gamm.service.IComidasService;



@Controller
public class homeController {
	
	@Autowired
	private IComidasService serviceComidas;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Comida> lista = serviceComidas.buscarTodo();
		model.addAttribute("comidas", lista);
		
		return "tabla";
	}
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Comida comida = new Comida(); 
		comida.setNombre("Deliciosa hambuerguesa");
		comida.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit,");
		comida.setPrecio(80.0);
		comida.setDescuento("16%");
		model.addAttribute("comida", comida);
		return "detalle";
	}
	@GetMapping("/listado") /* URL: localhost:8080/listado */
	public String mostrarListado(Model model) { /*Este metodo sirve para que podemos ingresar lista*/
		List<String> lista = new LinkedList<String>(); /*Con esto podemos usar lista, recuerda importar su extension, el metodo list contiene cadenas*/
		lista.add("Comida1");
		lista.add("Comida2");
		lista.add("comida2");
		lista.add("comida");
		
		model.addAttribute("comida", lista); /*Una vez creada nuestra lista debemos importar el modelo, le asignamos un atributo "empleos"*/
		
		return "listado";
	}
	
	//Encargado de renderizar la pagina principal
		@GetMapping("/") 
		public String mostrarHome(Model model) {
			return "home";

		} 
		
		//Encargado de renderizar la pagina principal
		@GetMapping("/about") 
		public String mostrarabout(Model model) {
			return "about";
		} 
		//Encargado de renderizar la pagina principal
		@GetMapping("/book") 
		public String mostrarbook(Model model) {
			return "book";
		}
		
		@GetMapping("/menu") 
		public String mostrarmenu(Model model) {
			return "menu";
		} 
		

}
