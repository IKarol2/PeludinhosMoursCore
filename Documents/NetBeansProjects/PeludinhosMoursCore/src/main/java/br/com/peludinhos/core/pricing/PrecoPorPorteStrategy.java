package br.com.peludinhos.core.pricing;
import br.com.peludinhos.core.model.Pet; import br.com.peludinhos.core.model.Servico; import java.math.BigDecimal;
public class PrecoPorPorteStrategy implements PrecoStrategy {
 public java.math.BigDecimal calcular(Pet pet, Servico servico){
  java.math.BigDecimal base = servico.getPrecoBase(); if(pet==null || pet.getPorte()==null) return base;
  switch(pet.getPorte()){ case PEQUENO: return base; case MEDIO: return base.multiply(new java.math.BigDecimal("1.20"));
   case GRANDE: return base.multiply(new java.math.BigDecimal("1.40")); default: return base; } } }