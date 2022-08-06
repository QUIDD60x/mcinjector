package me.quidd.minecraftinjector;

public class Main {

    public static void main(String[] args) {
        try {
            Injector.inject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
