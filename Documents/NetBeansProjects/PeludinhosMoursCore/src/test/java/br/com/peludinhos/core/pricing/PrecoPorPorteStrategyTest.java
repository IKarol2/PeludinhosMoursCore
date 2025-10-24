/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.peludinhos.core.pricing;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author karol
 */

public class PrecoPorPorteStrategyTest {

    @Test
    void deveCalcularPrecoParaPortePequeno() {
        var strategy = new PrecoPorPorteStrategy();
        BigDecimal base = new BigDecimal("50.00");
        BigDecimal resultado = strategy.calcular(base, "PEQUENO");
        assertEquals(new BigDecimal("50.00"), resultado);
    }

    @Test
    void deveCalcularPrecoParaPorteMedio() {
        var strategy = new PrecoPorPorteStrategy();
        BigDecimal base = new BigDecimal("50.00");
        BigDecimal resultado = strategy.calcular(base, "MEDIO");
        assertEquals(new BigDecimal("60.00"), resultado);
    }

    @Test
    void deveCalcularPrecoParaPorteGrande() {
        var strategy = new PrecoPorPorteStrategy();
        BigDecimal base = new BigDecimal("50.00");
        BigDecimal resultado = strategy.calcular(base, "GRANDE");
        assertEquals(new BigDecimal("70.00"), resultado);
    }

    @Test
    void deveLancarExcecaoQuandoPorteInvalido() {
        var strategy = new PrecoPorPorteStrategy();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> strategy.calcular(new BigDecimal("50.00"), "GIGANTE")
        );
        assertTrue(ex.getMessage().contains("Porte inválido"));
    }

    @Test
    void deveLancarExcecaoQuandoBaseNula() {
        var strategy = new PrecoPorPorteStrategy();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> strategy.calcular(null, "PEQUENO")
        );
        assertTrue(ex.getMessage().contains("Preço base nulo"));
    }

    @Test
    void deveLancarExcecaoQuandoPorteNulo() {
        var strategy = new PrecoPorPorteStrategy();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> strategy.calcular(new BigDecimal("50.00"), null)
        );
        assertTrue(ex.getMessage().contains("Porte nulo"));
    }
}