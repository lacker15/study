package Extends.ATMAystem;

/**
 * Created by Administrator on 2017/6/15.
 */
public  class ABCImpl implements ABC {
    private  double money;
    private  String  input;
    ABCImpl(double money , String input){
        this.money = money;
        this.input = input;
    }

    public double getBalance() {
        return money;
    }
    public boolean payPhoneBill(String phone, double money) {
        if (phone.length()==11 && this.money >= money){
            return  true;
        }else{
            return false;
        }

    }

    public boolean Pwd(String input) {
        if (this.input.equals(input)){
            return  true ;
        }else{
            return false;
        }

    }


    public boolean drawManey(double number) {
        if (this.money >=number){
            money -= number;
            return  true ;
        }else{
            return false;
        }

    }
}
