package com.example.s.lab3tapcounterrevised;


public class Counter {
    private Integer count;

    public Counter(){count = 0;}
    public void incCount(){ count ++;}
    public void decCount(){ count --;}
    public void resetCount(){ count = 0;}
    public Integer getCount(){return count;}
}
