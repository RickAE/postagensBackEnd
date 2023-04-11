package br.edu.fateccotia.postagens.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateccotia.postagens.model.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmailAndSenha(String email, String senha);
}
