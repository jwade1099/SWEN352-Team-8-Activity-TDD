package edu.rit.swen352.tdd;
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
public class StringValidator {

    private Integer minLength;
    private Integer maxLength;
    private boolean onlyLetters;
    private boolean onlyNumeric;
    private boolean mustContainSpecialChars;


    public StringValidator() {
        this.minLength = null;
        this.maxLength = null;
        this.onlyLetters = false;
        this.onlyNumeric = false;
        this.mustContainSpecialChars = false;
    }

    public void minLength(Integer minLength) {
        if (this.maxLength != null && this.maxLength < minLength) {
           throw new IllegalStateException("You cannot set a min length greater than max length");
        }
        this.minLength = minLength;
    }

    public void maxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public boolean validate(String input) {
        if (minLength != null) {
            if (input.length() < minLength) {
                return false;
            }
        }

        return true;
    }

}
