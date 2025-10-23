package br.com.peludinhos.core.model;
public class Pet { public enum Porte{PEQUENO,MEDIO,GRANDE} private Long id; private String nome; private String especie; private Porte porte; private Long clienteId;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;}
public String getEspecie(){return especie;} public void setEspecie(String especie){this.especie=especie;}
public Porte getPorte(){return porte;} public void setPorte(Porte porte){this.porte=porte;}
public Long getClienteId(){return clienteId;} public void setClienteId(Long id){this.clienteId=id;} }