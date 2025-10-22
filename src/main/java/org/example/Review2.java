package org.example;

import java.awt.*;

public class Review2 {
    private Dimension d = new Dimension (0, 0);
    public Review2 () {}
    public synchronized void setValues (int height, int width) throws 	IllegalArgumentException{
        if (height < 0 || width < 0)
            throw new IllegalArgumentException();
        d.height = height;
        d.width = width;
    }
    public synchronized Dimension getValues() {
        return d;
    }
}
//this is our second change