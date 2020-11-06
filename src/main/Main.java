package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

import static main.Parser.parse;

public class Main {
    public static void run() {
//        String separator = File.separator;
//        String path = "C:" + separator + "Users" + separator + "Yakushev.my" + separator + "Desktop" + separator + "get2020" + separator + "1С" + separator + "Тест.txt";
        File file = new File("1С/test.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(parse(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Yakushev.my\\Downloads\\SQLiteDatabaseBrowserPortable\\SQLiteDatabaseBrowserPortable\\Data\\test.db");
//            System.out.println("Connected");
//            Statement statement = connection.createStatement();
//            statement.setQueryTimeout(30);  // set timeout to 30 sec.
//            ResultSet rs = statement.executeQuery("select * from users");
//            while (rs.next()) {
//                // read the result set
//                System.out.println("first name = " + rs.getString("firstName"));
//                System.out.println("last name  = " + rs.getString("lastName"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        String s = parse("Лесная ул. (Прииртышский п), уч. № 1 В");
//        System.out.println(s);

        run();

    }
}
