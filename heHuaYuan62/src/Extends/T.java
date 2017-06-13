package Extends;

/**
 * Created by Administrator on 2017/6/13.
 */
public class T extends Tetrmino {
  T(){
       this(0,0);
  }
      T(int n , int m  ){

          cells[0] = new  Cell( n ,  m );
          cells[1] = new Cell(n,m+1);
          cells[2] = new Cell(n+1,m+1);
          cells[3] = new Cell(n,m+2);
      }

}
