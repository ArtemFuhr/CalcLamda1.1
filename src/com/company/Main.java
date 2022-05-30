package com.company;

public class Main {

    public static void main(String[] args) {
	Calculator calc = Calculator.instance.get();

    int a = calc.plus.apply(1, 2);
    int b = calc.minus.apply(1, 1);
    int c = calc.devide.apply(a, b);
    //ошибка из-за деления на ноль
        //необходима проверка в devide: если b != 0: выполняет
        //иначе b==0 то возвращает 0

    calc.println.accept(c);
    }
}
