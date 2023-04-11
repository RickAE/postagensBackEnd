package br.edu.fateccotia.postagens.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateccotia.postagens.model.User;



public interface UserRepository extends JpaRepository<User, Integer>{

}
