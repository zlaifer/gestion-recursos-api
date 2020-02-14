package com.claro.gestionrecursosapi.model;

import com.claro.gestionrecursosapi.entity.ProveedorEntity;

public class RespuestaProveedor extends RespuestaBase {

	private Iterable<ProveedorEntity> data;

	public Iterable<ProveedorEntity> getData() {
		return data;
	}

	public void setData(Iterable<ProveedorEntity> data) {
		this.data = data;
	}
	
	
	
}
