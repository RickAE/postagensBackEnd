package br.edu.fateccotia.postagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	private String email;
	private String senha;
	private String nick;
	private String picture;
	private String status;
	
	
	
	public User(int idUser, String email, String senha, String nick, String picture, String status) {
		this.idUser = idUser;
		this.email = email;
		this.senha = senha;
		this.nick = nick;
		this.picture = picture;
		this.status = status;
	}
	
	public User() {
		
	}
	
	public int getIdUser() {
		
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		
		this.idUser = idUser;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	
	public String getNick() {
		
		return nick;
	}
	
	public void setNick(String nick) {
		
		this.nick = nick;
	}
	
	public String getPicture() {
		
		return picture;
	}
	
	public void setPicture(String picture) {
		
		this.picture = picture;
	}
	
	public String getStatus() {
		
		return status;
	}
	
	public void setStatus(String status) {
		
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
