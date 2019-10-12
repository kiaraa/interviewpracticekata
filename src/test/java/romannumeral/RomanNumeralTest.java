package romannumeral;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.assertj.core.api.Assertions.*;

@RunWith(JUnit4.class)
public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setUp() throws Exception {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void returnsIWhenPassedOne() {
        assertThat(romanNumeral.translate(1)).isEqualTo("I");
    }

    @Test
    public void returnsIIWhenPassedTwo() {
        assertThat(romanNumeral.translate(2)).isEqualTo("II");
    }

    @Test
    public void returnsIIIWhenPassedThree() {
        assertThat(romanNumeral.translate(3)).isEqualTo("III");
    }

    @Test
    public void returnsIVWhenPassedFour() {
        assertThat(romanNumeral.translate(4)).isEqualTo("IV");
    }

    @Test
    public void returnsVWhenPassedFive() {
        assertThat(romanNumeral.translate(5)).isEqualTo("V");
    }

    @Test
    public void returnsVIWhenPassedSix() {
        assertThat(romanNumeral.translate(6)).isEqualTo("VI");
    }

    @Test
    public void returnsIXWhenPassedNine() {
        assertThat(romanNumeral.translate(9)).isEqualTo("IX");
    }

    @Test
    public void returnsXWhenPassedTen() {
        assertThat(romanNumeral.translate(10)).isEqualTo("X");
    }

    @Test
    public void returnXIIIWhenPassedThirteen() {
        assertThat(romanNumeral.translate(13)).isEqualTo("XIII");
    }

    @Test
    public void returnXIXWhenPassedNineteen() {
        assertThat(romanNumeral.translate(19)).isEqualTo("XIX");
    }

    @Test
    public void returnsXIVWhenPassedFourteen() {
        assertThat(romanNumeral.translate(14)).isEqualTo("XIV");
    }

    @Test
    public void returnsXXXIWhenPassedThirtyOne() {
        assertThat(romanNumeral.translate(31)).isEqualTo("XXXI");
    }

    @Test
    public void returnsXLWhenPassedForty() {
        assertThat(romanNumeral.translate(40)).isEqualTo("XL");
    }

    @Test
    public void returnsLWhenPassedFifty() {
        assertThat(romanNumeral.translate(50)).isEqualTo("L");
    }

    @Test
    public void returnsXCWhenPassedNinety() {
        assertThat(romanNumeral.translate(90)).isEqualTo("XC");
    }

    @Test
    public void returnsCWhenPassedOneHundred() {
        assertThat(romanNumeral.translate(100)).isEqualTo("C");
    }
}
