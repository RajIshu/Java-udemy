package com.JavaMasterclass;

// Defining interfaces name starting with 'I' makes it easy to find that this is an Interface.
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

    default String whatAmI(){
        return "A portable Phone";
    }
}
