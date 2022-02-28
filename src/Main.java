import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/outcome082017.txt"))) {
            String lineData;
            String[] data = new String[10];
            int counter = 0;
            while ((lineData = reader.readLine()) != null) {
                try {
                    data[counter] = lineData;
                    counter++;
                }
                catch (IndexOutOfBoundsException e) {
                    System.out.println("Первые десять строк заполнены!");
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(data[i]);
            }
        }
        catch (IOException e) {
            System.out.println("Проблема с файлом!");
        }
    }
}
