package com.example.bluno;

//send messages to sever or platform via GSM/LTE data link

public class SendMSG {
    private final static int GSMDevice = 1;
    private final static int LTEDevice = 2;
    private final static int networkDevice = -1;

    public int potentionmeter = 0;
    public int humidity = 0;
    public int temperature = 0;

    private final static String platformAddress = "www.highway_fog_alter.com";
    private final static String no_fog = "No fog";

    public void updateMSG() {
        if (networkDevice == GSMDevice) {
            conectGSM();
        } else if (networkDevice == LTEDevice) {
            conectLTE();
        }
    }

    private void conectLTE() {
    }

    private void conectGSM() {
    }

}
