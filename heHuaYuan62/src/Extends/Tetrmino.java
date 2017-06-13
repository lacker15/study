package Extends;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Tetrmino {
    Cell[] cells = new  Cell[4]; //[c,c,c,c]


    void  drop(){
     for (int i = 0 ; i < cells.length ; i++){
         cells[i].row++ ;
     }

 }
    void  moveLeft(){
     for(int i = 0 ; i < cells.length;i++){
         cells[i].col--;
     }



    }

    void  moveRight(){
        for(int i = 0 ;i < cells.length; i++){
            cells[i].col++;
        }
    }

    void geiCellInfo(){
        for( int i = 0;i<cells.length;i++ ){
          cells[i].getCelllinfo();
        }
    }
}
