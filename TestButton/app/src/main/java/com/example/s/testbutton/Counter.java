package com.example.s.testbutton;


public class Counter {

    private int count;

    public Counter(){
        count = 0;
    }
    public void addTap(){
        count++;
    }
    public int getCount() {
        return count;
    }
}
