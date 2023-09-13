package com.odin.app.productos.models.service;

import com.odin.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
	
	public List<Producto> findall();
	public Producto findById(Long id);

}
