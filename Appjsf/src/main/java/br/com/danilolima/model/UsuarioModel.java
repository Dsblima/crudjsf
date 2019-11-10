package br.com.danilolima.model;


import java.io.Serializable;

public class UsuarioModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String usuario;
	private String senha;

	public String getCodigo() {
		return nome;
	}
	public void setCodigo(String codigo) {
		this.nome = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
