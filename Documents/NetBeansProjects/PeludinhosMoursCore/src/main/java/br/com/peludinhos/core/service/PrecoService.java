package br.com.peludinhos.core.service;
import br.com.peludinhos.core.model.Pet; import br.com.peludinhos.core.model.Servico; import br.com.peludinhos.core.pricing.PrecoStrategy; import java.math.BigDecimal;
public class PrecoService { private PrecoStrategy strategy; public PrecoService(PrecoStrategy s){this.strategy=s;}
 public void setStrategy(PrecoStrategy s){this.strategy=s;} public BigDecimal calcular(Pet pet, Servico servico){ return strategy.calcular(pet, servico); } }