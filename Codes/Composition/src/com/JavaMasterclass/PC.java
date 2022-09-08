package com.JavaMasterclass;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1400, 400, "Red");
        // similar to getMonitor().drawPixelAt(1400, 400, "Red");
    }

    public void powerUP(){
        theCase.pressPowerButton(); // similar to getTheCase().pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows 1.0");
        // similar to getMotherboard().loadProgram("Windows 1.0");
    }
}
