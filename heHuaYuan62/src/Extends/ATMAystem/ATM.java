package Extends.ATMAystem;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/15.
 */
public class ATM {
   private  Unionpay  card ;
   public  void    insertCard(Unionpay card ){
       if (this.card ==null ){
           this.card = card;
       }

   }
   public  void  outCard(){
           this.card = null;
   }
   public  void  showBalance(){
      System.out.println(card.getBalance()) ;
   }
   public  void  takeMoney(){
       Scanner scan = new Scanner(System.in);
       System.out.println("取多少钱");
       double money = scan.nextDouble();
       if(card.drawManey(money)){
           System.out.println("取钱成功");
       }else {
           System.out.println("取钱失败");
       }
   }

    public  void payTelBill(){
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入号码");
       String phone = scan.next();
       System.out.println("请输入金额");
       double money = scan.nextDouble();
       if(card  instanceof    ABCImpl ){
           ((ABCImpl) card).payPhoneBill( phone,  money ) ;
           System.out.println("充值成功");
       }else{
           System.out.println("充值失败");
       }
    }
    public  void allMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入密码");
        String input = scan.next();
       if (card.Pwd(input)){
           Scanner scann = new Scanner(System.in);
            System.out.println("请选择功能 1：查看余额   2; 取款   3： 充话费");
            int num = scann.nextInt();
           switch (num){
               case  1 :showBalance();
               break;
               case  2: takeMoney();
               break;
               case 3 : payTelBill();
               break;
               default:
                   System.out.println("操作错误");
           }
        }else{
           System.out.println("110,我卡被偷了");
       }


    }

}
