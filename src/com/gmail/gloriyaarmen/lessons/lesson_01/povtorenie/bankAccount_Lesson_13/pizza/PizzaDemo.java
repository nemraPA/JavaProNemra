package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        AbstractPizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()//,
//                new Pizza("unknow PIZZA")
        };
        for (AbstractPizza pizza : pizzas) {
            pizza.make();
        }
    }
}
