import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;

/**
 *
 */
public class No7 {

    static final char[][] board = {
            {'5','3','.',  '.','7','.',  '.','.','.'},
            {'6','.','.',  '1','9','5',  '.','.','.'},
            {'.','9','8',  '.','.','.',  '.','6','.'},

            {'8','.','.',  '.','6','.',  '.','.','3'},
            {'4','.','.',  '8','.','3',  '.','.','1'},
            {'7','.','.',  '.','2','.',  '.','.','6'},

            {'.','6','.',  '.','.','.',  '2','8','.'},
            {'.','.','.',  '4','1','9',  '.','.','5'},
            {'.','.','.',  '.','8','.',  '.','7','9'}
    };

    public static void main(String[] args) {
        No7 o = new No7();


    }

    public void solveSudoku(char[][] board) {
        List[][] list = new ArrayList[board.length][board[0].length];
        //HashMap
        for (int i = 0; i < board.length; i++) {
            for(int j = 0 ; j < board[0].length;j++){
                //board[i][j];
                if(board[i][j] != '.'){
                    list[i][j] = null;
                    setBoard(list,i,j);
                }else{

                }
               // list[i*board.length+j].remove();
            }
        }
    }


    public void setBoard(List[][] list,int x,int y){
        int n=(x/3)*3 ,m=(y/3)*3;
        for(int i = 0;i<list.length;i++){
            // list[]
        }
    }

}
