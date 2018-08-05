package ru.basharin;

public class Main {
    public static void main(String[] args) {
        IncrementDecrementArrayList m = new IncrementDecrementArrayList();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        m.delete(3);
        System.out.println(m.delete(19));

        System.out.println(m.searchIndex(10));
    }
}
