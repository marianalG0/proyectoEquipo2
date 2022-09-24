package com.proyectoe2.gamm.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectoe2.gamm.model.Comida;

@Service
public class ComidasServiceImpl implements IComidasService {

	private List<Comida> lista = null;
	
	public ComidasServiceImpl() {
		lista = new LinkedList<Comida>();
		// Creamos la comida 1
		Comida comida1 = new Comida();
		comida1.setId(1);
		comida1.setNombre("Deliciosa Hamburguesa");
		comida1.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida1.setPrecio(75.0);
		comida1.setDescuento("15%");
		comida1.setOferta(1);
		comida1.setImagen("f2.png");
		
		// Creamos la comida 2
		Comida comida2 = new Comida();
		comida2.setId(2);
		comida2.setNombre("Tasty Burger");
		comida2.setDescripcion("Veniam debitis quaeratofficiis quasi cupiditate quo, quisquam velit");
		comida2.setPrecio(100.0);
		comida2.setDescuento("5%");
		comida2.setOferta(1);
		comida2.setImagen("f7.png");
		
		// Creamos la comida 3
		Comida comida3 = new Comida();
		comida3.setId(3);
		comida3.setNombre("Tasty Burger");
		comida3.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida3.setPrecio(70.0);
		comida3.setDescuento("10%");
		comida3.setOferta(1);
		comida3.setImagen("f8.png");
		
		// Creamos la comida 4
		Comida comida4 = new Comida();
		comida4.setId(4);
		comida4.setNombre("Delicious Pizza");
		comida4.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida4.setPrecio(130.0);
		comida4.setDescuento("0%");
		comida4.setOferta(0);
		comida4.setImagen("f1.png");
		
		// Creamos la comida 5
		Comida comida5 = new Comida();
		comida5.setId(5);
		comida5.setNombre("Delicious Pizza");
		comida5.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida5.setPrecio(100.0);
		comida5.setDescuento("0%");
		comida5.setOferta(0);
		comida5.setImagen("f3.png");
		
		// Creamos la comida 6
		Comida comida6 = new Comida();
		comida6.setId(6);
		comida6.setNombre("Delicious Pizza");
		comida6.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida6.setPrecio(200.0);
		comida6.setDescuento("3%");
		comida6.setOferta(1);
		comida6.setImagen("f6.png");
		
		// Creamos la comida 7
		Comida comida7 = new Comida();
		comida7.setId(7);
		comida7.setNombre("Delicious Pasta");
		comida7.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida7.setPrecio(50.0);
		comida7.setDescuento("0%");
		comida7.setOferta(0);
		comida7.setImagen("f4.png");
		
		// Creamos la comida 8
		Comida comida8 = new Comida();
		comida8.setId(8);
		comida8.setNombre("Delicious Pasta");
		comida8.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida8.setPrecio(85.0);
		comida8.setDescuento("3%");
		comida8.setOferta(1);
		comida8.setImagen("f9.png");
		
		// Creamos la comida 9
		Comida comida9 = new Comida();
		comida9.setId(9);
		comida9.setNombre("French Fries");
		comida9.setDescripcion("Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit");
		comida9.setPrecio(75.0);
		comida9.setDescuento("2%");
		comida9.setOferta(1);
		comida9.setImagen("f5.png");
		
		/*Agregamos los 9 objetos de tipo comida a la lista*/
		
		lista.add(comida1);
		lista.add(comida2);
		lista.add(comida3);
		lista.add(comida4);
		lista.add(comida5);
		lista.add(comida6);
		lista.add(comida7);
		lista.add(comida8);
		lista.add(comida9);
	}
	@Override
	public List<Comida> buscarTodo() {
		return lista;
	}
	@Override
	public Comida buscarPorId(Integer idComida) {
		
		for(Comida c : lista) {
			if(c.getId()==idComida) {
				return c;
			}
		}
		return null;
	}

}
