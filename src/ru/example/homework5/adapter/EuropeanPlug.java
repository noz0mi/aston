package ru.example.homework5.adapter;

public class EuropeanPlug implements EuropeanSocket {

    @Override
    public void euroPlugIn() {
        System.out.println("Plugged in european socket");
    }
}
