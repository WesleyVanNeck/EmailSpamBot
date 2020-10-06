package at.markus;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        new Thread(()->{
            try {
                Input.console();
            } catch (IOException e) {
            }
        }, "Console").start();
    }
}
