package com.org.data.datastruandalgorith.recursion;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.solution(2, 'a', 'b', 'c');
    }

    public void solution(int n, char x, char y, char z) {
        if (n == 1) {
            move(x, n, z);
            return;
        }
        solution(n - 1, x, z, y);
        move(x, n, z);
        solution(n - 1, y, x, z);

    }

    public void move(char x, int n, char y) {
        System.out.println("move " + n + " from " + x + " to " + y);
    }
}
