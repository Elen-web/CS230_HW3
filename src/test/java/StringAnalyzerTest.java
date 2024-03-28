import static org.junit.Assert.*;
import org.junit.Test;

public class StringAnalyzerTest {




    // Keep in mind that the spaces, characters, and case should be ignored
    @Test
    public void testIsPalindrome() {
        StringAnalyzer analyzer = new StringAnalyzer();
        assertTrue(analyzer.isPalindrome("Bob")); //a palindrome containing upper case
        assertFalse(analyzer.isPalindrome("hello"));//a non-palindrome
        assertTrue(analyzer.isPalindrome("123321")); //a palindrome consisting of digits
        assertFalse(analyzer.isPalindrome("8891")); //a non-palindrome consisting of digits
        assertTrue(analyzer.isPalindrome("12a3b3a21")); //a palindrome consisting of both digits and letters
        assertTrue(analyzer.isPalindrome("A man, a plan, a canal, Panama!")); //a palindrome containing spaces,characters,upper cases
        assertTrue(analyzer.isPalindrome("!$&*")); //as characters are ignored,this is considered a palindrome
        assertTrue(analyzer.isPalindrome("")); //empty space considered a palindrome

    }

    @Test
    public void testCountVowels() {
        StringAnalyzer analyzer = new StringAnalyzer();
        assertEquals(2, analyzer.countVowels("hello")); //  containing vowels and consonants
        assertEquals(3, analyzer.countVowels("oUi")); // containing only vowels and upper case
        assertEquals(0, analyzer.countVowels("glyph")); // containing only consonants
        assertEquals(3, analyzer.countVowels("hellO World")); // containing space and upper cases
        assertEquals(3, analyzer.countConsonants("he-!!-llo")); // containing other characters
        assertEquals(0, analyzer.countConsonants("!@$%^")); //  containing only characters => no vowels
        assertEquals(0, analyzer.countVowels("")); //empty space
    }

    @Test
    public void testCountConsonants() {
        StringAnalyzer analyzer = new StringAnalyzer();
        assertEquals(3, analyzer.countConsonants("hello"));// containing vowels and consonants
        assertEquals(2, analyzer.countConsonants("gG8")); // containing consonants and digits
        assertEquals(7, analyzer.countConsonants("Hello World")); // containing spaces and upper cases
        assertEquals(3, analyzer.countConsonants("he-!!-llo")); // containing other characters
        assertEquals(0, analyzer.countConsonants("!@$%^")); // containing only characters => no consonants
        assertEquals(0, analyzer.countConsonants(""));  //empty space

    }

    @Test
    public void testReverseString() {
        StringAnalyzer analyzer = new StringAnalyzer();
        assertEquals("olleh", analyzer.reverseString("hello")); // containing only letters
        assertEquals("123", analyzer.reverseString("321")); //containing only digits
        assertEquals("H1eLlo", analyzer.reverseString("olLe1H")); //containing letters,digits,upper case
        assertEquals("hh^&1", analyzer.reverseString("1&^hh")); // containing characters, letters,digits
        assertEquals("&%^&", analyzer.reverseString("&^%&")); // containing only characters
        assertEquals("", analyzer.reverseString("")); //empty space
    }
}
