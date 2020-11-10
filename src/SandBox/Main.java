package SandBox;

import java.util.ArrayList;
import static SandBox.WriteAndRead.readFromFile;
import static SandBox.WriteAndRead.writeToFile;


public class Main {
    public static void main(String[] args) {
        String fileWithDate = "1С/список домов.txt"; // путь файла, в котором храняться сырые данные
        String fileToWrite = "1С/test2.txt"; // путь файла, в который записываются обработанные данные
        // читаю данные из файла
        ArrayList<String> data = new ArrayList<>(readFromFile(fileWithDate));
        // записываю данные в файл
        writeToFile(data,fileToWrite);
    }
}
