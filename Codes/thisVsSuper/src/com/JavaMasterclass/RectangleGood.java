package com.JavaMasterclass;

public class RectangleGood {
    private int x;
    private int y;
    private int width;
    private int height;

    // This is a good way to make constructors. There are no repeated or duplicate codes.

    // 1st Constructor
    public RectangleGood(){
        this(0,0); // Calls 2nd Constructor
    }

    // 2nd Constructor
    public RectangleGood(int width, int height){
        this(0,0,width,height); // Calls 3rd Constructor
    }

    // 3rd Constructor
    public RectangleGood(int x, int y, int width, int height){
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
