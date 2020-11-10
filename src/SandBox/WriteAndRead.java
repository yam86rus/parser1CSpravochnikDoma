package SandBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import static SandBox.Parser.parse; // парсер

public class WriteAndRead {

    // считываем данные из файла
    public static ArrayList<String> readFromFile(String path) {
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    //  записываем данные в файл
    public static void writeToFile(ArrayList<String> arrayList, String path) {
        File file = new File(path);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Object obj : arrayList) {
                printWriter.write(parse((String) obj) +"\n");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


