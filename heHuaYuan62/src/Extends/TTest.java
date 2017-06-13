package Extends;

/**
 * Created by Administrator on 2017/6/13.
 */
public class TTest {
    public static void main(String[] args) {
          T  t =  new T();
     printWall(t);

    }
    static void printWall(Tetrmino t){
        for(int i = 0 ; i < 20 ; i++ ){
            for(int j = 0 ; j < 10 ;j++ ){


                boolean flag = false;
                for(int k = 0 ; k<t.cells.length;k++){  //row  = 2    col  = 3
                 if(t.cells[k].row == i && t.cells[k].col==j){
                     flag = true ;
                 }
                }

                if(flag){
                    System.out.print("* ");
                }else{
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }
}
