package Extends.ATMAystem;

/**
 * Created by Administrator on 2017/6/15.
 */
public class UnionpayTest {
    public static void main(String[] args) {
        ATM atm = new ATM();
        ABC abc = new ABCImpl( 100000,"123456" );
        atm.insertCard(abc);
        atm.allMenu();


    }



}