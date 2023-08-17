package com.projeto.logradouros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CepValidadorTest {
    @Test
    void testCepFormatoValido() {
        String cepValido = "01001000";
        assertTrue(CepValidadorTest.isValid(cepValido));
    }


    @Test
    void testCepFormatoInvalido() {
        String cepInvalido = "950100100"; // formato inválido
        assertFalse(CepValidadorTest.isValid(cepInvalido));
    }
}
