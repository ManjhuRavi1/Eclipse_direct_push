
package Package1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab_4_1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Ravindra.5.Kumar\\git\\Jan2026\\Project_jan_2026\\src\\test\\java\\Package1\\LabSample.txt";

        FileReader reader = new FileReader(path);
        StringBuilder data = new StringBuilder();
        int ch;
        while ((ch = reader.read()) != -1) {
            data.append((char) ch);
        }
        reader.close();

        StringBuilder reversed = new StringBuilder();
        for (int i = data.length() - 1; i >= 0; i--) {
            reversed.append(data.charAt(i));
        }

        FileWriter writer = new FileWriter(path, false);
        writer.write(reversed.toString());
        writer.close();
    }
}
