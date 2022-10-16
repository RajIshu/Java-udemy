package com.JavaMasterclass;

public interface ITelephone {
//    public void powerOn();
//    public void dial(int phoneNumber);
//    public void answer();
//    public boolean callPhone(int phoneNumber);
//    public boolean isRinging();

    // 'public' modifier in above methods are redundant. Because Interface Methods are public by default.

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
