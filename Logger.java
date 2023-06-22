package Algorithm.Exceptions.seminar3.HW_v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logger {
    public static void writer(String[] string, int name, int date, int phone, int gender) throws IOException {
        String[] nameArray = string[name].split(",");
        String surname = String.format("%s.txt", nameArray[0]);
        Path path = Paths.get(surname);
        String text = String.format("<%s><%s><%s><%s><%s><%s>\n", nameArray[0], nameArray[1],
                nameArray[2], string[date], string[phone], string[gender]);
        try {
            Files.write(path,
                    text.getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new IOException("Не удалось записать в файл", e);
        }
    }
}
