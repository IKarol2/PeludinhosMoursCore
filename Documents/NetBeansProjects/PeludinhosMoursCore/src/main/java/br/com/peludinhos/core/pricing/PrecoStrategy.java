package br.com.peludinhos.core.pricing;
import br.com.peludinhos.core.model.Pet; import br.com.peludinhos.core.model.Servico; import java.math.BigDecimal;
public interface PrecoStrategy { BigDecimal calcular(Pet pet, Servico servico); }