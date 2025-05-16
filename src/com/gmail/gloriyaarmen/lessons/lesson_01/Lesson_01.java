package com.gmail.gloriyaarmen.lessons.lesson_01;

public class Lesson_01 {
    public static void main(String[] args) {

        System.out.println(reverse("Hello world!)"));
    }

    private static String reverse(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result = line.charAt(i) + result;
//            result = result + line.charAt(i);
        }
        return result;
    }
}
