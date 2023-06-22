package Algorithm.Exceptions.seminar3.HW_v2;

import java.util.Scanner;

public class View {
    public static String[] addString() {
        System.out.println("Введите данные в формате - Ф,И,О дата_рождения номер_телефона пол (пример: Иванов,Иван,Иванович 10.10.1980 79995552233 М)");
        String[] string;
        try (Scanner scan = new Scanner(System.in)) {
            String text = scan.nextLine();
            string = text.split(" ");
        }
        return string;
    }
}