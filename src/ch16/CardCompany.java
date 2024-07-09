package ch16;

public class CardCompany {
    private static int serialNum = 101478;
    private int cardID;

    public CardCompany(){
        this.cardID = ++serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        CardCompany.serialNum = serialNum;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }
}
