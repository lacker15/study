package Extends.ATMAystem;

/**
 * Created by Administrator on 2017/6/15.
 */
public class ICBCImpl  implements ICBC{
    private double  maney;
    private  String input;
    ICBCImpl(double money ,String input ){
        this.maney = money;
        this.input = input;

    }
    public boolean onlinePay(double pay) {
        if (this.maney >= pay){
            maney -= pay;
            return  true;
        }else {
            return false;
        }

    }

    public double getBalance() {
        return maney;
    }

    public boolean Pwd(String input) {
        if (this.input.equals(input) ){
            return  true;
        }else {
            return false;
        }

    }

    public boolean drawManey(double number) {
        if (this.maney >= number){
            this.maney -= number;
            return  true;
        }else {
            return false;
        }

    }
}
