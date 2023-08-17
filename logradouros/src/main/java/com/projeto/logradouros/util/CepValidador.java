package com.projeto.logradouros.util;

public class CepValidador {
    public static boolean isValid(String cep) {

        if (cep == null || cep.length() != 8) {
            return false;
        }

        for (char c : cep.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}

