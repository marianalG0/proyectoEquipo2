package com.proyectoe2.gamm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {
	
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
