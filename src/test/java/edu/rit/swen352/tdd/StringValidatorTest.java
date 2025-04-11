package edu.rit.swen352.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * StringValidator provides utility methods for setting rules to validate strings.
 *
 * <p>Behaviors:
 * <ul>
 *     <li>minLength(Integer value): set the minimum length the string must be to be valid (null == no limit) cannot be > maxLength or it will throw an IllegalStateException</li>
 *     <li>maxLength(Integer value): set the maximum length teh string must be to be valid (null == no limit) cannot be < minLength or it will throw an IllegalStateException</li>
 *     <li>onlyLetters(boolean value): set the requirement that the validated string must be only letters. If onlyNumeric is set to True throws a IllegalStateException as the validation would contradict</li>
 *     <li>onlyNumeric(boolean value): set the requirement that the validated string must be only letters. If onlyLetters is set to True throws a IllegalStateException as the validation would contradict</li>
 *     <li>mustContainSpecialChars(boolean true): set requirement that it must contain special chars like ('-', '!', '_', etc.). Throws an IllegalStateException if either onlyNumbers or onlyLetters is set to true.</li>
 *     <li>validate(String value): true if follows all rules set by the validator, throw IllegalArgumentException if given a null or blank string </i>
 * </ul>
 */
public class StringValidatorTest {

    @DisplayName("Testing a string valid without min length requirement")
    @Test
    public void testMinLengthNull() {
        StringValidator validator = new StringValidator();
        validator.minLength(null);
        assertTrue(validator.validate("test"));
    }

    @DisplayName("Testing a valid string with a set min length")
    @Test
    public void testMinLengthNonNullValid() {
        StringValidator validator = new StringValidator();
        validator.minLength(3);
        assertTrue(validator.validate("test"));
    }


    @DisplayName("Testing an invalid string with a set min length")
    @Test
    public void testMinLengthNonNullInvalid() {
        StringValidator validator = new StringValidator();
        validator.minLength(3);
        assertFalse(validator.validate("aa"));
    }

    @DisplayName("Testing a min length exception (setting a min length with max length set lower than it")
    @Test
    public void testMinLengthException() {
        StringValidator validator = new StringValidator();
        validator.maxLength(5);
        assertThrows(IllegalStateException.class, () -> validator.minLength(6));
    }

    @DisplayName("Testing a string valid without max length requirement")
    @Test
    public void testMaxLengthNull() {
        StringValidator validator = new StringValidator();
        validator.minLength(null);
        assertTrue(validator.validate("test"));
    }

    @DisplayName("Testing a valid string with a set min length")
    @Test
    public void testMaxLengthNonNullValid() {
        StringValidator validator = new StringValidator();
        validator.maxLength(5);
        assertTrue(validator.validate("test"));
    }


    @DisplayName("Testing an invalid string with a set min length")
    @Test
    public void testMaxLengthNonNullInvalid() {
        StringValidator validator = new StringValidator();
        validator.maxLength(1);
        assertFalse(validator.validate("aa"));
    }

    @DisplayName("Testing a max length exception (setting a max length smaller than the min length set")
    @Test
    public void testMaxLengthException() {
        StringValidator validator = new StringValidator();
        validator.maxLength(5);
        assertThrows(IllegalStateException.class, () -> validator.minLength(6));
    }
}
