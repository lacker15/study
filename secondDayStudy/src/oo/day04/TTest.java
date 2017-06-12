package oo.day04;

/**
 * Created by Administrator on 2017/6/12.
 */
public class TTest {
    public static void main(String[] args) {
        Tetromino t = new T(0, 0);
        printWall(t);
    }
    public static void printWall(Tetromino t) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                boolean s = false;
                for (int k = 0; k < t.cells.length; k++)
                    if (i == t.cells[k].row && j == t.cells[k].col) {
                        s = true;
                        break;
                    }
                if (s) {
                    System.out.print("* ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    }