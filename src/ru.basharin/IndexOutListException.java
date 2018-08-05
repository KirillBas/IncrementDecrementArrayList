package ru.basharin;

public class IndexOutListException extends Exception {

    private int detail;

    public IndexOutListException() {
    }

    public IndexOutListException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

