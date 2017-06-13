package Extends;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Cell {
    int  row ;
    int  col ;
    Cell(){
        this(0,0);
    }
     Cell(int n ,int m  ){
         row = n;
         col = m;
     }

     void drop(){
         row++;
     }
   void  moveRight(){
         col++;
        }
    void  moveLeft(){
       col--;
    }
     void getCelllinfo(){
        System.out.println(row+","+col);
     }
}
