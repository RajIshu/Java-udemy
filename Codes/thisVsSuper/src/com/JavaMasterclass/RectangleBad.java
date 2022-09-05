package com.JavaMasterclass;

public class RectangleBad {
    private int x;
    private int y;
    private int width;
    private int height;

    // This is a bad way to make constructors. There are lots of repeated or duplicate codes.
    // Even Variables are initialized in every constructor.

    public RectangleBad(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public RectangleBad(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public RectangleBad(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
