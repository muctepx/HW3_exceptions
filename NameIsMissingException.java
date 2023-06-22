package Algorithm.Exceptions.seminar3.HW_v2;

public class NameIsMissingException extends Exception {
    public NameIsMissingException() {
        super("ФИО не найдено");
    }
}