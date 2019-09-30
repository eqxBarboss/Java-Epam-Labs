package by.bsuir.devteam.utils;

public class DataValidator {

    private static final String WORD_REGEX = "[A-Za-zА-Яа-я]+";
    private static final String PHONE_NUMBER_REGEX = "[0-9]{7}";

    public static boolean checkWord(String word) {
        return word != null && word.matches(WORD_REGEX);
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
}
