package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        int count1 = 1;

        while (count1 <= 5) {
            System.out.println("I love Java");
            count1 = count1 + 1;
        }
        main2();

    }
    public static void main2() {
        int count2 = 1;
        do {
            System.out.println("I love Java");
            count2++;
        } while (count2 <= 5);
    }
}
