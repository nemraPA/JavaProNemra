package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()//,
//                new Pizza("unknow PIZZA")
        };
        for (Pizza pizza : pizzas) {
            pizza.make();
        }
    }
}
