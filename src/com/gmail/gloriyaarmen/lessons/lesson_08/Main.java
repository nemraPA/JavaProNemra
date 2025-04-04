package com.gmail.gloriyaarmen.lessons.lesson_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Читання файлу через File IO API
public class Main {

    // Шлях до зовнішньої папки.
    //  / - кореневий каталог, у термінах Windows - це,
    //  наприклад, C:\
    private final static String BASE_PATH = "/Username/Files/";

    static File file;
    static FileReader fr;
    static String fileName;

    public static void main(String[] args) {

        // Файл, який не існує
        fileName = "myfile.txt";

        // Обробка винятку щодо роботи з файлами
        try {
            // Робота з файлами через File IO API
            file = new File(BASE_PATH + fileName);
            fr = new FileReader(file);
            // Читаємо символи
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
        } catch (FileNotFoundException ex) {
            // Тут перехоплення винятку щодо наявності файлу.
            // Якщо файла не існує, то виведеться відповідне
            // повідомлення про виняток.
            System.out.println("Exception: " + ex.getMessage());
        } catch (IOException e) {
            // Тут перехоплення винятку щодо використання File IO API.
            // При неможливості використання File IO API, виведеться відповідне
            // повідомлення про виняток.
            System.out.println("Exception: " + e.getMessage());
        }
    }
}