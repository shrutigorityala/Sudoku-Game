import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SudokuGame extends JFrame implements ActionListener {
    private SudokuBoard board;

    private JPanel Gamepanel;

    private JPanel Sub3by3Panel1;
    private JPanel Sub3by3Panel2;
    private JPanel Sub3by3Panel3;
    private JPanel Sub3by3Panel4;
    private JPanel Sub3by3Panel5;
    private JPanel Sub3by3Panel6;
    private JPanel Sub3by3Panel7;
    private JPanel Sub3by3Panel8;
    private JPanel Sub3by3Panel9;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    private JTextField tf13;
    private JTextField tf14;
    private JTextField tf15;
    private JTextField tf16;
    private JTextField tf17;
    private JTextField tf18;
    private JTextField tf19;
    private JTextField tf20;
    private JTextField tf21;
    private JTextField tf22;
    private JTextField tf23;
    private JTextField tf24;
    private JTextField tf25;
    private JTextField tf26;
    private JTextField tf27;
    private JTextField tf28;
    private JTextField tf29;
    private JTextField tf30;
    private JTextField tf31;
    private JTextField tf32;
    private JTextField tf33;
    private JTextField tf34;
    private JTextField tf35;
    private JTextField tf36;
    private JTextField tf37;
    private JTextField tf38;
    private JTextField tf39;
    private JTextField tf40;
    private JTextField tf41;
    private JTextField tf42;
    private JTextField tf43;
    private JTextField tf44;
    private JTextField tf45;
    private JTextField tf46;
    private JTextField tf47;
    private JTextField tf48;
    private JTextField tf49;
    private JTextField tf50;
    private JTextField tf51;
    private JTextField tf52;
    private JTextField tf53;
    private JTextField tf54;
    private JTextField tf55;
    private JTextField tf56;
    private JTextField tf57;
    private JTextField tf58;
    private JTextField tf59;
    private JTextField tf60;
    private JTextField tf61;
    private JTextField tf62;
    private JTextField tf63;
    private JTextField tf64;
    private JTextField tf65;
    private JTextField tf66;
    private JTextField tf67;
    private JTextField tf68;
    private JTextField tf69;
    private JTextField tf70;
    private JTextField tf71;
    private JTextField tf72;
    private JTextField tf73;
    private JTextField tf74;
    private JTextField tf75;
    private JTextField tf76;
    private JTextField tf77;
    private JTextField tf78;
    private JTextField tf79;
    private JTextField tf80;
    private JTextField tf81;

    private JButton newGame;

    private Font font1;

    private JTextField[] SubPanel1;
    private JTextField[] SubPanel2;
    private JTextField[] SubPanel3;
    private JTextField[] SubPanel4;
    private JTextField[] SubPanel5;
    private JTextField[] SubPanel6;
    private JTextField[] SubPanel7;
    private JTextField[] SubPanel8;
    private JTextField[] SubPanel9;

    private JTextField[][] jtfArray;

    public static void main(String[] args) {
        SudokuGame one=new SudokuGame();
    }

    public SudokuGame(){
        font1 = new Font(Font.SANS_SERIF, Font.BOLD , 24);

        tf1 = construcTextField(tf1);
        tf2 = construcTextField(tf2);
        tf3 = construcTextField(tf3);
        tf4 = construcTextField(tf4);
        tf5 = construcTextField(tf5);
        tf6 = construcTextField(tf6);
        tf7 = construcTextField(tf7);
        tf8 = construcTextField(tf8);
        tf9 = construcTextField(tf9);
        tf10 = construcTextField(tf10);
        tf11 = construcTextField(tf11);
        tf12 = construcTextField(tf12);
        tf13 = construcTextField(tf13);
        tf14 = construcTextField(tf14);
        tf15 = construcTextField(tf15);
        tf16 = construcTextField(tf16);
        tf17 = construcTextField(tf17);
        tf18 = construcTextField(tf18);
        tf19 = construcTextField(tf19);
        tf20 = construcTextField(tf20);
        tf21 = construcTextField(tf21);
        tf22 = construcTextField(tf22);
        tf23 = construcTextField(tf23);
        tf24 = construcTextField(tf24);
        tf25 = construcTextField(tf25);
        tf26 = construcTextField(tf26);
        tf27 = construcTextField(tf27);
        tf28 = construcTextField(tf28);
        tf29 = construcTextField(tf29);
        tf30 = construcTextField(tf30);
        tf31 = construcTextField(tf31);
        tf32 = construcTextField(tf32);
        tf33 = construcTextField(tf33);
        tf34 = construcTextField(tf34);
        tf35 = construcTextField(tf35);
        tf36 = construcTextField(tf36);
        tf37 = construcTextField(tf37);
        tf38 = construcTextField(tf38);
        tf39 = construcTextField(tf39);
        tf40 = construcTextField(tf40);
        tf41 = construcTextField(tf41);
        tf42 = construcTextField(tf42);
        tf43 = construcTextField(tf43);
        tf44 = construcTextField(tf44);
        tf45 = construcTextField(tf45);
        tf46 = construcTextField(tf46);
        tf47 = construcTextField(tf47);
        tf48 = construcTextField(tf48);
        tf49 = construcTextField(tf49);
        tf50 = construcTextField(tf50);
        tf51 = construcTextField(tf51);
        tf52 = construcTextField(tf52);
        tf53 = construcTextField(tf53);
        tf54 = construcTextField(tf54);
        tf55 = construcTextField(tf55);
        tf56 = construcTextField(tf56);
        tf57 = construcTextField(tf57);
        tf58 = construcTextField(tf58);
        tf59 = construcTextField(tf59);
        tf60 = construcTextField(tf60);
        tf61 = construcTextField(tf61);
        tf62 = construcTextField(tf62);
        tf63 = construcTextField(tf63);
        tf64 = construcTextField(tf64);
        tf65 = construcTextField(tf65);
        tf66 = construcTextField(tf66);
        tf67 = construcTextField(tf67);
        tf68 = construcTextField(tf68);
        tf69 = construcTextField(tf69);
        tf70 = construcTextField(tf70);
        tf71 = construcTextField(tf71);
        tf72 = construcTextField(tf72);
        tf73 = construcTextField(tf73);
        tf74 = construcTextField(tf74);
        tf75 = construcTextField(tf75);
        tf76 = construcTextField(tf76);
        tf77 = construcTextField(tf77);
        tf78 = construcTextField(tf78);
        tf79 = construcTextField(tf79);
        tf80 = construcTextField(tf80);
        tf81 = construcTextField(tf81);

        makeArrAy();

        Sub3by3Panel1= addJTFPanel(1,Sub3by3Panel1 , tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9);
        Sub3by3Panel2= addJTFPanel(2,Sub3by3Panel2 ,tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18);
        Sub3by3Panel3= addJTFPanel(3,Sub3by3Panel3 , tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27);
        Sub3by3Panel4= addJTFPanel(4,Sub3by3Panel4 , tf28, tf29, tf30, tf31, tf32, tf33, tf34, tf35, tf36);
        Sub3by3Panel5= addJTFPanel(5,Sub3by3Panel5 , tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44, tf45);
        Sub3by3Panel6= addJTFPanel(6,Sub3by3Panel6 , tf46, tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54);
        Sub3by3Panel7= addJTFPanel(7,Sub3by3Panel7 , tf55, tf56, tf57, tf58, tf59, tf60, tf61, tf62, tf63);
        Sub3by3Panel8= addJTFPanel(8,Sub3by3Panel8 , tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72);
        Sub3by3Panel9= addJTFPanel(9,Sub3by3Panel9 , tf73, tf74, tf75, tf76, tf77, tf78, tf79, tf80, tf81);

        newGame= new JButton("New game");
        newGame.addActionListener(this);

        Gamepanel= new JPanel(new FlowLayout(FlowLayout.CENTER,2,2));
        Gamepanel.add(Sub3by3Panel1);
        Gamepanel.add(Sub3by3Panel2);
        Gamepanel.add(Sub3by3Panel3);
        Gamepanel.add(Sub3by3Panel4);
        Gamepanel.add(Sub3by3Panel5);
        Gamepanel.add(Sub3by3Panel6);
        Gamepanel.add(Sub3by3Panel7);
        Gamepanel.add(Sub3by3Panel8);
        Gamepanel.add(Sub3by3Panel9);
        Gamepanel.add(newGame);

        getContentPane().add(Gamepanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 600);
        setResizable(false);
        setTitle("Sudoku");
        setVisible(true);

    }

    private JPanel addJTFPanel(int SubPanelNumber,JPanel subPanel,JTextField TF1, JTextField TF2,JTextField TF3,JTextField TF4,JTextField TF5,JTextField TF6,JTextField TF7,JTextField TF8,JTextField TF9) {
        switch(SubPanelNumber){
            case 1:
            SubPanel1= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 2:
            SubPanel2= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 3:
            SubPanel3= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 4:
            SubPanel4= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 5:
            SubPanel5= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 6:
            SubPanel6= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 7:
            SubPanel7= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 8:
            SubPanel8= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
            case 9:
            SubPanel9= MakeJtfArray(TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9);
            break;
             
        }
        
        subPanel = new JPanel(new GridLayout(3,3,1,1));
        subPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
        subPanel.add(TF1);
        subPanel.add(TF2);
        subPanel.add(TF3);
        subPanel.add(TF4);
        subPanel.add(TF5);
        subPanel.add(TF6);
        subPanel.add(TF7);
        subPanel.add(TF8);
        subPanel.add(TF9);

        return subPanel;
    }

    private JTextField[] 
    MakeJtfArray(JTextField tF1, JTextField tF2, JTextField tF3, JTextField tF4,
            JTextField tF5, JTextField tF6, JTextField tF7, JTextField tF8, JTextField tF9) {
        JTextField [] jtfArray = {tF1,tF2,tF3,tF4,tF5,tF6,tF7,tF8,tF9};
        return jtfArray;
    }

    private void makeArrAy() {
        jtfArray=new JTextField[][]{
            {tf1,tf2,tf3,tf10,tf11,tf12,tf19,tf20,tf21},
            {tf4,tf5,tf6,tf13,tf14,tf15,tf22,tf23,tf24},
            {tf7,tf8,tf9,tf16,tf17,tf18,tf25,tf26,tf27},
            {tf28,tf29,tf30,tf37,tf38,tf39,tf46,tf47,tf48},
            {tf31,tf32,tf33,tf40,tf41,tf42,tf49,tf50,tf51},
            {tf34,tf35,tf36,tf43,tf44,tf45,tf52,tf53,tf54},
            {tf55,tf56,tf57,tf64,tf65,tf66,tf73,tf74,tf75},
            {tf58,tf59,tf60,tf67,tf68,tf69,tf76,tf77,tf78},
            {tf61,tf62,tf63,tf70,tf71,tf72,tf79,tf80,tf81}
        };
    }

    private JTextField construcTextField (JTextField jtf){
        jtf=new JTextField();
        jtf.setPreferredSize(new DimensionUIResource(50, 50));
        jtf.setFont(font1);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jtf.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        KeyListener key = new KeyListener(){
            public void keyPressed(KeyEvent e) {
                System.out.println("event fired !!! keyPresssed");
                JTextField textfield= (JTextField) e.getSource();
                textfield.setText(""+);
                
                if(!isValidCharacter(e))
                {
                    textfield.setEditable(false);
                    System.out.println("Not valid key");
                }
                else
                {
                    textfield.setEditable(true);
                }
                
            }

            private boolean isValidCharacter(KeyEvent key) {
                int input= Character.getNumericValue(key.getKeyChar());
                if(input>-1){
                    if(input==1 || input==2 ||input==3 ||input==4 ||input==5 ||input==6 ||input==7 ||input==8 ||input==9){
                        return true;
                    }
                }
                return false;
            };

            public void keyReleased(KeyEvent e) {
               System.out.print(" event fired!!! keyReleased ");
               JTextField textField= (JTextField) e.getSource();
                
               int[] jtfIndexValues = findeIndexValues(textField);
            
               int jtfRow = jtfIndexValues[0];
               int jtfCol = jtfIndexValues[1];

               String ValueInputted = "" + (e.getKeyChar());

               boolean areDupesInRow = checkRowForDuplicates(jtfArray[jtfRow],textField,ValueInputted);
               boolean areDupesInCol = checkColForDuplicates(jtfCol,textField,ValueInputted);
               boolean areDupesInSubPanel = checkBoxForDuplicates(jtfRow,jtfCol,textField,ValueInputted);

               if(areDupesInCol||areDupesInRow||areDupesInSubPanel){
                System.out.println("Duplicates exists");

                SetColorRed(ValueInputted,areDupesInCol,areDupesInRow,areDupesInSubPanel,jtfRow,jtfCol);
                RestrictAllJtfAccessButFocused(jtfRow,jtfCol,true,ValueInputted);
               }
               else{
                resetJtfColor();
                RestrictAllJtfAccessButFocused(jtfRow,jtfCol,true,ValueInputted);
                restrictGeneratedJtfAccess(board);
               }
            }

            public int[] findeIndexValues(JTextField textField) {
                int [] arr = {-1,-1};
                for(int row=0;row<9;row++){
                    for(int col=0;col<9;col++){
                        if (textField.equals(jtfArray[row][col]))
                        {
                            arr[0]=row;
                            arr[1]=col;
                            return arr;
                        }
                    }
                }
                return arr;
            }
           
            private boolean checkRowForDuplicates(JTextField[] jtfRowArray, JTextField textField, String valueInputted) {
                for(JTextField element : jtfRowArray){
                    if(element!=textField){
                        if(element.getText()==valueInputted)
                           return true;
                    }
                }
                return false;
            }

            private boolean checkColForDuplicates(int jtfCol, JTextField textField, String valueInputted) {
                return checkRowForDuplicates(transpose(jtfCol),textField,valueInputted);
            }

            private JTextField[] transpose(int col){
                JTextField[] tranposedArray = new JTextField[9];
                for (int row = 0; row < 9; row++) {
                    tranposedArray[row]= jtfArray[row][col];
                }
                return tranposedArray;
            }

            private boolean checkBoxForDuplicates(int Row, int Col, JTextField textField, String valueInputted) {
                return checkRowForDuplicates(BoxToRow(Row,Col),textField,valueInputted);
            }

            private JTextField[] BoxToRow(int row, int col) {
                if( row < 3){
                    if(col<3) 
                      return SubPanel1;

                    else if(col<6) 
                      return SubPanel2;

                    else 
                      return SubPanel3;
                }
                if( row < 6){
                    if(col<3) 
                      return SubPanel4;

                    else if(col<6) 
                      return SubPanel5;

                    else 
                      return SubPanel6;
                }
                if( row < 9){
                    if(col<3) 
                      return SubPanel7;

                    else if(col<6) 
                      return SubPanel8;

                    else return SubPanel9;
                }
                return null;
            }

            private void SetColorRed(String value, boolean areDupesInCol, boolean areDupesInRow,
                    boolean areDupesInSubPanel, int Row, int Col) {
                if(areDupesInSubPanel){
                    for(JTextField element : BoxToRow(Row, Col)){
                        if(element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }
                if(areDupesInCol){
                    for(JTextField element : transpose(Col)){
                        if(element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }
                if(areDupesInRow){
                    for(JTextField element : jtfArray[Row]){
                        if(element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }        
            }

            private void RestrictAllJtfAccessButFocused(int row, int col, boolean correctValue,String value) {
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        if(correctValue){
                            jtfArray[i][j].setEditable(true);
                        }
                        else{
                            //if(!(i==row && j==col))
                            if(!(i==row && j==col)){
                                jtfArray[i][j].setEditable(false);
                            }
                        }
                    } 
                }
            }

            public void keyTyped(KeyEvent e) {
                
                
            }
        };
        jtf.addKeyListener(key);
        return jtf;
   }
   private void resetJtfColor() {
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            jtfArray[i][j].setBackground(Color.white);
            } 
        } 
   }
   
   private void restrictGeneratedJtfAccess(SudokuBoard board) {
    for (int i = 0; i < 9 ; i++) {
        for(int j=0;j<9;j++){
            jtfArray[i][j].setText(""+board.getFinalBoard()[i][j]);
            jtfArray[i][j].setEditable(false);
            if(board.getFinalBoard()[i][j]==0){

                JTextField temp= jtfArray[i][j];
                temp.setText("");
                temp.setEditable(true);  


                }
            }
        }
    }

    
    public void actionPerformed(ActionEvent e) {
        board=new SudokuBoard();
        clearTextFields();
        resetJtfColor();
        restrictGeneratedJtfAccess(board);
        
    }

    private void clearTextFields() {
        for(JTextField[] elementArr : jtfArray){
            for(JTextField element : elementArr){
                element.setText("");
            }
        }
    }
    
}
