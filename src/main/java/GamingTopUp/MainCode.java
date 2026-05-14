package GamingTopUp;

import com.sun.security.jgss.GSSUtil;

public class MainCode {
    static void main() {

        double bonus = 0, discount = 0;
        double payment = 0;

        TopUpSystem topUpSystem = new TopUpSystem();
        topUpSystem.inputData();

        String name = topUpSystem.getName();
        int top_up = topUpSystem.getTop_up_amount();
        String game_name = topUpSystem.getGame_name();

        if(game_name.equals("MobileLegends")){
            topUpSystem.ConditionProcess(top_up, payment, discount, bonus);
        } else if (game_name.equals("PuBg")) {
            topUpSystem.ConditionProcess(top_up, payment, discount, bonus);
        } else if (game_name.equals("FreeFire")) {
            topUpSystem.ConditionProcess(top_up, payment, discount, bonus);
        }
        else{
            System.out.println("Invalid Game! Don't have Game");
            return;
        }

        TopUpSystem.header();
        topUpSystem.displayTopUp(game_name, top_up, name, topUpSystem.getBonus(), topUpSystem.getDiscount(), topUpSystem.getPayment());
    }
}
