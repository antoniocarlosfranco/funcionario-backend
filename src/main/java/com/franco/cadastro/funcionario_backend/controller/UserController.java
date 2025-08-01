package com.franco.cadastro.funcionario_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.franco.cadastro.funcionario_backend.exception.UserNotFoundException;
import com.franco.cadastro.funcionario_backend.model.User;
import com.franco.cadastro.funcionario_backend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/* Salvar os dados na api */
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	
	/* Listar todos na api */
	@GetMapping("/users")
	List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Buscar por id de usuário.
	@GetMapping("/user/{id}")
	User getUserById(@PathVariable Long id) {
		return userRepository.findById(id)
				.orElseThrow(()->new UserNotFoundException(id));
	}
	
	//Edit editar.
	@PutMapping("/user/{id}")
	User updateUser(@RequestBody User newUser,@PathVariable Long id) {
		return userRepository.findById(id)
			  .map(user -> {
				  user.setUsername(newUser.getUsername());
				  user.setNome(newUser.getNome());
				  user.setEmail(newUser.getEmail());
				  user.setCargo(newUser.getCargo());
				  user.setEndereco(newUser.getEndereco());
				  user.setCidade(newUser.getCidade());
				  user.setHorario_de_trabalho(newUser.getHorario_de_trabalho());
				  return userRepository.save(user);
			  }).orElseThrow(()->new UserNotFoundException(id));
	}
	
	//Delete excluir.
	@DeleteMapping("/user/{id}")
	String deleteUser(@PathVariable Long id) {
		if(!userRepository.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		userRepository.deleteById(id);
		//return "User with id " +id+" has been deleted success.";
		return "Usuário com id " +id+" foi excluído com sucesso.";
	}
	
}
