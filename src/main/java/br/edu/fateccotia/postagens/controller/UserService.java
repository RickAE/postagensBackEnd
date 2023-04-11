package br.edu.fateccotia.postagens.controller;
import java.util.Optional;

import org.springframework.stereotype.Service;
import br.edu.fateccotia.postagens.model.User;


@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository taskRepository) {
		
		this.userRepository = taskRepository;
		
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getById(Integer id) {
		
		return userRepository.findById(id);
	}
	
	public Optional<User> findByEmailAndSenha(String email, String senha) {
		
		return userRepository.findByEmailAndSenha(email,senha);
		
	}
	
	
}
