package org.example;

public class Review3 {
    private Integer i = Integer.valueOf(0);
    public Review3 () {}
    public synchronized void setValues (int x) throws 	IllegalArgumentException{
        if (x < 0)
            throw new IllegalArgumentException();
        i = Integer.valueOf(x);
    }
    public synchronized Integer getValues() {
        return Integer.valueOf(i.intValue());
    }
}
