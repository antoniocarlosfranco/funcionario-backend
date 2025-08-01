package com.franco.cadastro.funcionario_backend.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(Long id) {
		//super("Could not found the user with id "+ id);
		super("Não foi possível encontrar o usuário com id " + id);
	}

}
