package com.proyectoe2.gamm.service;

import java.util.List;

import com.proyectoe2.gamm.model.Comida;

public interface IComidasService {
	
	List<Comida> buscarTodo();
	Comida buscarPorId(Integer idComida);
}
