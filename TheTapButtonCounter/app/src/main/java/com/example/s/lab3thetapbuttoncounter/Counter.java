package com.example.s.lab3thetapbuttoncounter;


class Counter {
    private int mCount;

    public Counter(){
        mCount = 0;
    }

    public void addCount(){
        mCount ++;
    }

    public void decCount(){
        mCount--;
    }

    public void resetCount(){
        mCount = 0;
    }
    public int getCount(){
        return mCount;
    }
}
