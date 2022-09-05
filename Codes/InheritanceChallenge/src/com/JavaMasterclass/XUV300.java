package com.JavaMasterclass;

public class XUV300 extends Car{
    private int Sensors;

    public XUV300(int headlight, int wheel, int seat, int sunroof, int door, int airBag, int sensors) {
        super(headlight, wheel, seat, sunroof, door, airBag);
        this.Sensors = sensors;
    }

    public int getSensors() {
        return Sensors;
    }
}
