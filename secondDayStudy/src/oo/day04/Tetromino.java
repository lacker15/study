package oo.day04;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Tetromino {
    //生成变量cells
    Cell[] cells;
    //构造方法
    Tetromino() {
        cells  =new Cell[4];
    }

    void drop(int n ){
        for ( int i = 0 ; i < cells.length;i++ ){
           cells[i].row += n ;
        }
    }
    void moveLfet(int n ){
        for(int i = 0 ; i <cells.length;i++){
            cells[i] . col -= n ;
        }
    }
    void moveRight(int n ){
        for(int i = 0 ;i<cells.length ; i++ ){
            cells[i].col += n;
        }
    }
    void print(int n ){
        for(int i = 0 ; i < cells.length; i++){
            String string = cells[i].getCelllnfo();
                System.out.println(string);
        }
    }
}