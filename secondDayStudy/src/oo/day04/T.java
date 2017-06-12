package oo.day04;

/**
 * Created by Administrator on 2017/6/12.
 */
public class T extends Tetromino{
    T(){
        this(0,0);
    }
    T(int row ,int col){
        cells[0] = new Cell(row ,col);
        cells[1] = new Cell(row +1,col);
        cells[2] = new Cell(row+2,col);
        cells[3] = new Cell(row+1,col+1);
    }
}
