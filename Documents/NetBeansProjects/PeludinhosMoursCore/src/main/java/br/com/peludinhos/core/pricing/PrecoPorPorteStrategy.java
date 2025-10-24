package br.com.peludinhos.core.pricing;
import br.com.peludinhos.core.model.Pet;
import br.com.peludinhos.core.model.Servico;
import java.math.BigDecimal;

/**
 *
 * @author karol
 */

public class PrecoPorPorteStrategy implements PrecoStrategy {

    public BigDecimal calcular(Pet pet, Servico servico) {
        BigDecimal base = servico.getPrecoBase();
        if (pet == null || pet.getPorte() == null) return base;

        switch (pet.getPorte()) {
            case PEQUENO:
                return base;
            case MEDIO:
                return base.multiply(new BigDecimal("1.20"));
            case GRANDE:
                return base.multiply(new BigDecimal("1.40"));
            default:
                return base;
        }
    }

    // 👉 Novo método usado no teste JUnit
    public BigDecimal calcular(BigDecimal base, String porte) {
        if (base == null) throw new IllegalArgumentException("Preço base nulo");
        if (porte == null) throw new IllegalArgumentException("Porte nulo");

        String p = porte.trim().toUpperCase();
        BigDecimal resultado;

        switch (p) {
            case "PEQUENO":
                resultado = base;
                break;
            case "MEDIO":
                resultado = base.multiply(new BigDecimal("1.20"));
                break;
            case "GRANDE":
                resultado = base.multiply(new BigDecimal("1.40"));
                break;
            default:
                throw new IllegalArgumentException("Porte inválido: " + porte);
        }

        return resultado.setScale(2);
    }
}























