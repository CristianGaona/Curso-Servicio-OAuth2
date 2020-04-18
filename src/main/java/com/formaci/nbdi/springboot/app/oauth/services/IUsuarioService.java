package com.formaci.nbdi.springboot.app.oauth.services;

import com.formaci.nbdi.springboot.app.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {
public Usuario findByUsername(String username);
	
}
