package br.com.peludinhos.core.model;
import java.math.BigDecimal;
public class Servico { private Long id; private String nome; private BigDecimal precoBase;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;}
public BigDecimal getPrecoBase(){return precoBase;} public void setPrecoBase(BigDecimal p){this.precoBase=p;} }