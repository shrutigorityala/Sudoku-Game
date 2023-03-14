import java.util.*;
import java.util.ArrayList;

public class SudokuBoard{
   
    ArrayList <int[]> First3Lines= new ArrayList<>(3);
    ArrayList <int[]> Second3Lines= new ArrayList<>(3);
    ArrayList <int[]> Third3Lines= new ArrayList<>(3);

    //Integer arrays which represents sudoku solution
    private int[] one   = {8,1,2,7,5,3,6,4,9};
    private int[] two   = {9,4,3,6,8,2,1,7,5};
    private int[] three = {6,7,5,4,9,1,2,8,3};
    private int[] four  = {1,5,4,2,3,7,8,9,6};
    private int[] five  = {3,6,9,8,4,5,7,2,1};
    private int[] six   = {2,8,7,1,6,9,5,3,4};
    private int[] seven = {5,2,1,9,7,4,3,6,8};
    private int[] eight = {4,3,8,5,2,6,9,1,7};
    private int[] nine  = {7,9,6,3,1,8,4,5,2};

    private int[][] finalBoard = new int[9][9];

    public SudokuBoard(){
        initialized9lines(one,two,three,four,five,six,seven,eight,nine);
        CreateBorad();
        HideBoardValues();
        //getFinalBoard();
    }

    
    
    
    public int[][] getFinalBoard(){
        return finalBoard;
    }

    public void initialized9lines(int[] one,int [] two,int [] three,int [] four,int [] five,int [] six,int [] seven,int [] eight,int [] nine){
        First3Lines.add(one);
        First3Lines.add(two);
        First3Lines.add(three);

        Second3Lines.add(four);
        Second3Lines.add(five);
        Second3Lines.add(six);

        Third3Lines.add(seven);
        Third3Lines.add(eight);
        Third3Lines.add(nine);
    }
    public void CreateBorad(){
        ConstructLinesFromAl(First3Lines,0);
        ConstructLinesFromAl(Second3Lines,3);
        ConstructLinesFromAl(Third3Lines,6);
    }
    public void ConstructLinesFromAl(ArrayList <int[]> al,int row){
        for(int i=0;i<3;i++){
            for(int col=0;col<9;col++){
                finalBoard[i+row][col]=al.get(i)[col];
            }
        }
      
    }
    public void HideBoardValues(){
        Random rad= new Random();
        int row;
        int col;
        for(int i=0;i<30;i++){
            row=rad.nextInt(9);
            col=rad.nextInt(9);
            finalBoard[row][col]=0;
        }
    }
    

}