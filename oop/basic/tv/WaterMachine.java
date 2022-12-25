package oop.basic.tv;

public class WaterMachine {
    private int quantityOfCoins = 18;
    private int moneyWater = 1;
    private int moneySyrupWater = 3;
    private double scopeOfWater = 10;
    private double scopeOfSyrup = 3;

    public void putMoney(int coin, double syrup, double water) {
        if (moneyWater != coin && moneySyrupWater != coin) {
            System.out.println("Take your return money. Put only '1' or '3' coins");
            return;
        }
        if (quantityOfCoins == 20){
            System.out.println("Cell has " + quantityOfCoins + " coins.");
            return;
        }
        if (moneyWater == coin && scopeOfWater >= 0.2) {
            quantityOfCoins++;
            scopeOfWater -= water;
            System.out.println("Wait for your water until the cap filled up");
            System.out.println("Scope of water is " + scopeOfWater + " l");
            System.out.println("Cell has " + quantityOfCoins + " coin/s");
        }
        if (moneySyrupWater == coin && scopeOfSyrup >= 0.05 && scopeOfWater >= 0.15){
            quantityOfCoins++;
            scopeOfWater -= water;
            scopeOfSyrup -= syrup;
            System.out.println("Wait for your syrup drink until the cap filled up");
            System.out.println("Scope of syrup is " + scopeOfSyrup + " l and scope of water is " + scopeOfWater + " l");
            System.out.println("Cell has " + quantityOfCoins + " coin/s");
        }
        else if (moneyWater == coin && scopeOfWater < 0.2){
            System.out.println("There is no water");
        }
        else if (moneySyrupWater == coin && scopeOfSyrup >= 0.05 && scopeOfWater >= 0.15){
            System.out.println("There is no syrup");
        }
    }
    public void takeMoneyFromCell(){
        if(quantityOfCoins == 20){
            System.out.println("Clean your cell, please");
        }
    }
}
