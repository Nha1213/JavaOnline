package GamingTopUp;

import java.util.Scanner;

public class TopUpSystem {
    private String name;
    private String game_name;
    private int top_up_amount;
    private double bonus, discount,payment;
    private double paymentDis;

    public String getName(){
        return name;
    }
    public String getGame_name(){
        return game_name;
    }
    public int getTop_up_amount(){
        return top_up_amount;
    }
    public double getBonus(){
        return bonus;
    }
    public double getDiscount(){
        return discount;
    }
    public double getPayment(){
        return payment;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGame_name(String game_name){
        this.game_name = game_name;

    }
    public void setTop_up_amount(int top_up_amount){
        this.top_up_amount = top_up_amount;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public void setPayment(double payment){
        this.payment = payment;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("Please enter your game_name: ");
        game_name = input.nextLine();
        System.out.print("Please enter your top up amount: ");
        top_up_amount = input.nextInt();
    }

    public void displayTopUp(String game_name, int top_up_amount, String name, double bonus, double discount, double payment){
        System.out.printf("%-20s %-20s %-20d %-20.2f %-20.2f %-20s\n", name, game_name, top_up_amount, bonus, discount, payment );
    }

    public static void header(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "name player", "game_name", "top_up_amount", "bonus diamond", "discount", "payment" );
    }

    public void ConditionProcess(int top_up, double payment, double discount, double bonus ){
        if (top_up >= 10){
            bonus = 100;
            this.bonus = bonus;
        }
        if (top_up >=30){
            discount = 0.05;
            paymentDis = top_up *  discount;
            payment = top_up - paymentDis;
            this.payment = payment;
            this.discount = discount;
        }
        if (top_up >= 50) {
            System.out.println("VIP  Gamer Reward Unlocked");
        }
    }

}
