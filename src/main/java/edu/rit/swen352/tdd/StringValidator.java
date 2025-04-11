package edu.rit.swen352.tdd;
/**
 * StringValidator provides utility methods for setting rules to validate strings.
 *
 * <p>Behaviors:
 * <ul>
 *     <li>minLength(Integer value): set the minimum length the string must be to be valid (null == no limit)</li>
 *     <li>maxLength(Integer value): set the maximum length teh string must be to be valid (null == no limit)</li>
 *     <li>onlyLetters(boolean value): set the requirement that the validated string must be only letters. If onlyNumeric is set to True throws a IllegalStateException as the validation would contradict</li>
 *     <li>onlyNumeric(boolean value): set the requirement that the validated string must be only letters. If onlyLetters is set to True throws a IllegalStateException as the validation would contradict</li>
 *     <li>mustContainSpecialChars(boolean true): set requirement that it must contain special chars like ('-', '!', '_', etc.). Throws an IllegalStateException if either onlyNumbers or onlyLetters is set to true.</li>
 *     <li>validate(String value): true if follows all rules set by the validator, throw IllegalArgumentException if given a null or blank string </i>
 * </ul>
 */
public class StringValidator {

}
