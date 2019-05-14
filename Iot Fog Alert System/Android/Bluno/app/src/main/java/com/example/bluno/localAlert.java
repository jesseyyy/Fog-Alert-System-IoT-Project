package com.example.bluno;


public class localAlert {
    private SendMSG mySendMSG = new SendMSG();

    public SendMSG getMySendMSG() {

        if (mySendMSG.potentionmeter >5.5) {
            System.out.print("No fog");
        } else if (mySendMSG.potentionmeter >= 2.5 && mySendMSG.potentionmeter < 5.5) {
            System.out.print("light fog");
        } else if (mySendMSG.potentionmeter < 2.5 ) {
            System.out.print("heavy fog");
            turnOnLocalAlarm();
        }
        return mySendMSG;
    }

    private void turnOnLocalAlarm() {
        //do something to turn on the alarm of fog or icy
    }

    public void setMySendMSG(SendMSG mySendMSG) {
        this.mySendMSG = mySendMSG;
    }


}
