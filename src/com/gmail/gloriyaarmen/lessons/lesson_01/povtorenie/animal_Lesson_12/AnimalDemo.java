package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.animal_Lesson_12;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
//                new Animal("dog", 2),
//                new Animal("cat", 1)
                new Dog("dog", 2),
                new Cat("cat", 1)
        };
        print(animals);
        saySomething(animals);

        Cat cat = new Cat("pretty cat", 3, "black");
//        cat.name = "pretty cat";
//        cat.age = 2;
//        cat.color = "black";
        cat.describe();

        BritishCat britishCat = new BritishCat();
        britishCat.describe();
        britishCat.say();

    }
    private static void print(Animal[] animals) {
        System.out.println("!");
        for (Animal animal : animals) {
            animal.describe();
        }
    }

    private static void saySomething(Animal[] animals) {
        System.out.println();
        System.out.println("SAYING....");
        for (Animal animal : animals) {
            animal.say();
        }
        System.out.println("==============");
    }
}
