package com.franco.cadastro.funcionario_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franco.cadastro.funcionario_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
