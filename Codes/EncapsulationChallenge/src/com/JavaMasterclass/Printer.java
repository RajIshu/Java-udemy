package com.JavaMasterclass;

public class Printer {
    private int tonerLevel = 100;
    private int noOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean duplex){
        if(fillUpTheToner(tonerLevel)){
            this.tonerLevel = tonerLevel;
        }
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplex = duplex;
    }

    public boolean fillUpTheToner(int level){
        if(level > 0 && level <= 100){
            return true;
        }
        return false;
    }

    public void printPage(int pages){
        System.out.println("Printing...");
        this.noOfPagesPrinted = this.noOfPagesPrinted + pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }

    public void isPrinterDuplex(){
        if(isDuplex()){
            System.out.println("Yes, the printer is duplex");
        }
        else {
            System.out.println("No, the printer is duplex");
        }
    }
}
