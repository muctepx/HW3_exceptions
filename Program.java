package Algorithm.Exceptions.seminar3.HW_v2;

public class Program {

  public static int number_of_elements(String[] string) {
        if (string.length < 4) {
            return -1;
        } else if (string.length > 4) {
            return -2;
        }
        return 0;
    }
    
    public static boolean checking_the_size(int size) {
        if (size == -1) {
            System.out.println("Вы ввели мало данных");
            return false;
        }
        if (size == -2) {
            System.out.println("Вы ввели много данных");
            return false;
        }
        return true;
    }

    public static int name_search(String[] string) throws NameIsMissingException {

        for (int i = 0; i < string.length; i++) {
            if (string[i].split(",").length == 3) {
                return i;
            }
        }
        throw new NameIsMissingException();
    }

    public static int date_search(String[] string) throws DateIsMissingException {

        for (int i = 0; i < string.length; i++) {
            if (string[i].split("\\.").length == 3) {
                String[] result = string[i].split("\\.");
                if (result[0].matches("[0-9]+") && result[0].length() == 2 &&
                        result[1].matches("[0-9]+") && result[1].length() == 2 &&
                        result[2].matches("[0-9]+") && result[2].length() == 4) {
                    return i;
                }
            }
        }
        throw new DateIsMissingException();
    }

    public static int phone_number_search(String[] string) throws PhoneNumberIsMissingException {

        for (int i = 0; i < string.length; i++) {
            if (string[i].matches("[0-9]+")) {
                return i;
            }
        }
        throw new PhoneNumberIsMissingException();
    }

    public static int gender_search(String[] string) throws GenderIsMissingException {
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() == 1 || (string[i] == "М" || string[i] == "Ж")) {
                return i;
            }
        }
        throw new GenderIsMissingException();
    }
}
