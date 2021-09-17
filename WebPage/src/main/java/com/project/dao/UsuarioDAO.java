/**
 * 
 */
package com.project.dao;

import java.util.List;

import com.project.model.UsuarioModelo;

/**
 * @author chema
 *
 */
public interface UsuarioDAO{
	
	// Registrar datos
	public void registrar(UsuarioModelo user) throws Exception;
	// Modificar datos
	public void modificar(UsuarioModelo user) throws Exception;
	// Eliminar datos
	public void eliminar(UsuarioModelo user) throws Exception;
	// listar datos
	public List<UsuarioModelo> listar() throws Exception;
}