package com.franco.cadastro.funcionario_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/* Created by Carlos Franco */

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String nome;
	private String email;
	private String cargo;
	private String endereco;
	private String cidade;
	private String horario_de_trabalho;
	
	/* clica com o botão direito do mouse e Source ou Alt+Shift+S e escolher Getters and Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getHorario_de_trabalho() {
		return horario_de_trabalho;
	}
	public void setHorario_de_trabalho(String horario_de_trabalho) {
		this.horario_de_trabalho = horario_de_trabalho;
	}
	
    
	
}
