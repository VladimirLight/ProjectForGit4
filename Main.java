package org.example;

public class Main {
    public static void main(String[] args) {
        Cats c1 = new Cats("Ruskiy");
        c1.Miau();

        Dogs d1 = new Dogs("Taksa");
        d1.Gav();

        Birds b1 = new Birds();
        b1.Chiric();
    }
}