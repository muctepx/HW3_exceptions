package Algorithm.Exceptions.seminar3.HW_v2;

public class PhoneNumberIsMissingException extends Exception {
    public PhoneNumberIsMissingException() {
        super("Номер телефона не найден");
    }
}
