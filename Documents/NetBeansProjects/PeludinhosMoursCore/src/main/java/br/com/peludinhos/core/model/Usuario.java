package br.com.peludinhos.core.model;
public class Usuario { private Long id; private String nome; private String login; private String senha; private String tipo;
public Usuario(){} public Usuario(String n,String l,String s,String t){nome=n;login=l;senha=s;tipo=t;}
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;}
public String getLogin(){return login;} public void setLogin(String login){this.login=login;}
public String getSenha(){return senha;} public void setSenha(String senha){this.senha=senha;}
public String getTipo(){return tipo;} public void setTipo(String tipo){this.tipo=tipo;}
public String toString(){return "Usuario{id="+id+", login='"+login+"', nome='"+nome+"'}";} }