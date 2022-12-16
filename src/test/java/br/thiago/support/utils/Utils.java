package br.thiago.support.utils;

/**
 * This class is responsible to provide utilities to the project
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import org.springframework.stereotype.Component;

@Component
public class Utils {

    // Method to generate mock email
    public String generateMockEmail() {
        long timestamp = System.currentTimeMillis();
        String EMAIL_PREFIX = "th-";
        String EMAIL_SUFFIX_MOCK = "@test.com";
        return EMAIL_PREFIX + timestamp + EMAIL_SUFFIX_MOCK;
    }

    // Method to generate random size
    private int randomSize(int n) {
        int ranNum = (int) (Math.random() * n);
        return ranNum;
    }

    // Method to generate a CPF
    private String generateCPF() {
        String base = String.valueOf(System.currentTimeMillis());
        base = base.substring(base.length() - 9);

        int d1 = 0, d2 = 0;
        int digit1, digit2, mod = 0;
        final char[] digits = base.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            final int idDigit = digits[i] - 48;
            d1 += (11 - (i + 1)) * idDigit;
            d2 += (12 - (i + 1)) * idDigit;
        }

        mod = (d1 % 11);
        digit1 = (mod < 2) ? 0 : 11 - mod;

        d2 += 2 * digit1;

        mod = (d2 % 11);
        digit2 = (mod < 2) ? 0 : 11 - mod;

        return base + digit1 + digit2;
    }
}
