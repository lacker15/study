package oo.day04;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Cell {
    int row;
    int col;
    Cell(){
        this(0,0);
    }
    Cell ( int row ,int col ){
        this. row = row ;
        this. col = col;
    }
    String getCelllnfo(){
        return  row+ ","+col;
    }
}
