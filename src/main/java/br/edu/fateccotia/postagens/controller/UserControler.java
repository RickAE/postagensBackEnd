package br.edu.fateccotia.postagens.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateccotia.postagens.model.User;



@RestController
@RequestMapping("/postagens")
public class UserControler {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<User>> getById(@PathVariable Integer id) {
//		
//		Optional<User> user = userService.getById(id);
//		if(user.isPresent()) {
//			return ResponseEntity.ok(user);
//		}
//		
//		else {
//			return ResponseEntity.notFound().build();
//		}
//		
//	}
	
	@GetMapping("/{email}/{senha}")
	public ResponseEntity<Optional<User>> findByEmailAndSenha(@PathVariable String email, @PathVariable String senha) {
		
		Optional<User> user = userService.findByEmailAndSenha(email,senha);
		
		if(user.isPresent()) {
			return ResponseEntity.ok(user);
		}
		
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
		
		User userCreated = userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
	}
}
