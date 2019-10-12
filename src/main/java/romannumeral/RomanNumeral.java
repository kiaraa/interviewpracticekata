package romannumeral;

import java.util.Arrays;
import java.util.List;

public class RomanNumeral {

    public static final List<RomanNumeralPairing> CHARACTER_PAIRINGS = Arrays.asList(
            new RomanNumeralPairing(100, "C"),
            new RomanNumeralPairing(90, "XC"),
            new RomanNumeralPairing(50, "L"),
            new RomanNumeralPairing(40, "XL"),
            new RomanNumeralPairing(10, "X"),
            new RomanNumeralPairing(9, "IX"),
            new RomanNumeralPairing(5, "V"),
            new RomanNumeralPairing(4, "IV"),
            new RomanNumeralPairing(1, "I")
    );

    public String translate(int number) {
        StringBuilder sb = new StringBuilder();
        int workingNumber = number;

        for (RomanNumeralPairing pairing : CHARACTER_PAIRINGS) {
            workingNumber = appendSpecialCharacter(sb, workingNumber, pairing.numericValue, pairing.stringValue);
        }

        return sb.toString();
    }

    private int appendSpecialCharacter(StringBuilder sb, int workingNumber, int numberToCheck, String romanNumeral) {
        while (workingNumber >= numberToCheck) {
            sb.append(romanNumeral);
            workingNumber -= numberToCheck;
        }
        return workingNumber;
    }

    static class RomanNumeralPairing {
        int numericValue;
        String stringValue;

        public RomanNumeralPairing(int numericValue, String stringValue) {
            this.numericValue = numericValue;
            this.stringValue = stringValue;
        }
    }
}

