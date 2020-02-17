package com.claro.gestionrecursosapi.domain.imp;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claro.gestionrecursosapi.domain.ICrudService;
import com.claro.gestionrecursosapi.domain.IProveedorService;
import com.claro.gestionrecursosapi.entity.PersonaEntity;
import com.claro.gestionrecursosapi.entity.ProveedorEntity;
import com.claro.gestionrecursosapi.excepcion.DataIncorrectaExcepcion;
import com.claro.gestionrecursosapi.excepcion.NoExisteExcepcion;
import com.claro.gestionrecursosapi.excepcion.YaExisteExcepcion;
import com.claro.gestionrecursosapi.repository.IProveedorRepository;

@Service
@Validated
public class ProveedorService implements IProveedorService {

	@Autowired
	private IProveedorRepository repository;

	@Override
	public ProveedorEntity crear(ProveedorEntity entity) throws YaExisteExcepcion, DataIncorrectaExcepcion {
		if (entity.esDatosIncorrectos()) {
			throw new DataIncorrectaExcepcion("Los campos Id, Nombre y Estado son de caracter oblidatorio");
		} else if (repository.findById(entity.getId()).isPresent() ) {
			throw new YaExisteExcepcion("Ya existe un proveedor con esa identificación");
		} else {
			return repository.save(entity);
		}
	}

	@Override
	public ProveedorEntity actualizar(int id, ProveedorEntity entity)
			throws NoExisteExcepcion, DataIncorrectaExcepcion {
		if (entity.esDatosIncorrectos()) {
			throw new DataIncorrectaExcepcion("Los campos Id, Nombre y Estado son de caracter oblidatorio");
		} else {
			ProveedorEntity proveedorEntityBuscado = buscarPorId(id);
			proveedorEntityBuscado.setNombre(entity.getNombre());
			proveedorEntityBuscado.setContratoMarco(entity.getContratoMarco());
			proveedorEntityBuscado.setNit(entity.getNit());
			proveedorEntityBuscado.setLinea(entity.getLinea());
			proveedorEntityBuscado.setEspecialidad(entity.getEspecialidad());
			proveedorEntityBuscado.setEstado(entity.getEstado());
			proveedorEntityBuscado.setLogo(entity.getLogo());
			proveedorEntityBuscado.setCiudad(entity.getCiudad());
			proveedorEntityBuscado.setDepartamento(entity.getDepartamento());
			proveedorEntityBuscado.setPais(entity.getPais());
			return repository.save(proveedorEntityBuscado);
		}

	}

	@Override
	public ProveedorEntity buscarPorId(int id) throws NoExisteExcepcion {
		Optional<ProveedorEntity> proveedorEntity = repository.findById(id);

		if (proveedorEntity.isPresent()) {
			return proveedorEntity.get();
		} else {
			throw new NoExisteExcepcion("No se encontro ningún proveedor con el Id: " + id);
		}
	}

	@Override
	public ProveedorEntity buscarPorNit(String nit) throws NoExisteExcepcion {
		ProveedorEntity proveedorEntity = repository.findByNit(nit);
		if (proveedorEntity != null) {
			return proveedorEntity;
		} else {
			throw new NoExisteExcepcion("No se encontro ningún proveedor con el Nit: " + nit);
		}
	}

	@Override
	public ProveedorEntity buscarPorContratoMarcho(String contratoMarco) throws NoExisteExcepcion {
		ProveedorEntity proveedorEntity = repository.findByContratoMarco(contratoMarco);
		if (proveedorEntity != null) {
			return proveedorEntity;
		} else {
			throw new NoExisteExcepcion("No se encontro ningún proveedor con el ContratoMarco: " + contratoMarco);
		}
	}

	@Override
	public Iterable<ProveedorEntity> buscarTodos() throws NoExisteExcepcion {
		Iterable<ProveedorEntity> listaProveedor = repository.findAll();
		if (((Collection<?>) listaProveedor).size() > 0) {
			return listaProveedor;
		} else {
			throw new NoExisteExcepcion("No se encontraron resultados");
		}
	}

	@Override
	public Iterable<ProveedorEntity> buscarPorLinea(String linea) throws NoExisteExcepcion {
		Iterable<ProveedorEntity> listaProveedor = repository.findByLinea(linea);
		if (((Collection<?>) listaProveedor).size() > 0) {
			return listaProveedor;
		} else {
			throw new NoExisteExcepcion("No se encontraron resultados");
		}
	}

	@Override
	public Iterable<ProveedorEntity> buscarPorEspecialidad(String especialidad) throws NoExisteExcepcion {
		Iterable<ProveedorEntity> listaProveedor = repository.findByEspecialidad(especialidad);
		if (((Collection<?>) listaProveedor).size() > 0) {
			return listaProveedor;
		} else {
			throw new NoExisteExcepcion("No se encontraron resultados");
		}
	}

	@Override
	public Iterable<ProveedorEntity> buscarPorEstado(String estado) throws NoExisteExcepcion {
		Iterable<ProveedorEntity> listaProveedor = repository.findByEstado(estado);
		if (((Collection<?>) listaProveedor).size() > 0) {
			return listaProveedor;
		} else {
			throw new NoExisteExcepcion("No se encontraron resultados");
		}
	}

	@Override
	public boolean eliminar(int id) throws NoExisteExcepcion {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}else {
			throw new NoExisteExcepcion("No se encontro ningún proveedor con el Id: " + id);
		}
	}

}
