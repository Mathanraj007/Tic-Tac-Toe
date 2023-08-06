/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Random;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;


class twoPlayer {

    static String game[][] = new String[3][3];
    static String play1, play2,one,x,y;
    static int getvalue[] = new int[3];
    static int playcount = 1;
    static int testing_count=0;
    // static int play2count=1;
    static int i, j, m;
    Scanner obj = new Scanner(System.in);
    Scanner obj1 = new Scanner(System.in);

    public void boart() {

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                game[i][j] = "-";
            }
        }

    }

    public void printboart() {
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(game[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void player() {

        System.out.println("enter name of player 1:");
        play1 = obj.nextLine();

        System.out.println("enter name of player 2:");
        play2 = obj.nextLine();
    }
     public int OnePlayer(){
         System.out.println("enter the name :");
         one=obj.nextLine();
         System.out.println("choose the symble of your game X or O");
         x=obj.nextLine();
         switch(x){
             case "X":y="O";break;
             case "O":y="X";break;
             default : System.out.println("enter the correct option:");return OnePlayer();
         }
         return 0;
     }
     public int OnePlayergame(){
         System.out.println("your turn enter empty box number :");
         int box=obj.nextInt();
         int row ;
         int column;
         switch(box){
             case 1:
                 row=0;
                 column=0;
                 break;
             case 2:
                 row=0;
                 column=1;
                 break;
             case 3:
                 row=0;
                 column=2;
                 break;
             case 4:
                 row=1;
                 column=0;
                 break;
             case 5:
                 row=1;
                 column=1;
                 break;
             case 6:
                 row=1;
                 column=2;
                 break;
             case 7:
                 row=2;
                 column=0;
                 break;
             case 8:
                 row=2;
                 column=1;
                 break;
             case 9:
                 row=2;
                 column=2;
                 break;
             default :
                 System.out.println("in this number is invaild try again");
                 return OnePlayergame();
                 
             
         }
         if(row<3&&column<3){
            
        }else{
            System.out.println("Your value is invaild so,try again");
            return OnePlayergame();
        }
         if(game[row][column]=="-"){
             game[row][column]=x;
         }else{
             System.out.println("already fill try again");
             return OnePlayergame();
         }
         return 0;
     }
     public int cpu(){
         Random rand=new Random();
         int row=rand.nextInt(3);
         int column=rand.nextInt(3);
                  // check to cpu winning statements
                  if(testing_count==0){
                      if(game[0][2]=="-"){
                          game[0][2]=y;
                      }else{
                          game[0][0]=y;
                      }
                      testing_count=1;
                      return 0;
                  }
                 
             if(game[0][0].equals(y)&&game[0][1].equals(y)||game[2][0].equals(y)&&game[1][1].equals(y)||game[2][2].equals(y)&&game[1][2].equals(y)){
            if(game[0][2]=="-"){
             game[0][2]=y;
             return 0;
             }
            }
         if(game[0][0].equals(y)&&game[0][2].equals(y)||game[2][1].equals(y)&&game[1][1].equals(y)){
            if(game[0][1]=="-"){
             game[0][1]=y;
             return 0;
           }
         }
          if(game[0][1].equals(y)&&game[2][1].equals(y)||game[2][0].equals(y)&&game[0][2].equals(y)||game[0][0].equals(y)&&game[2][2].equals(y)||game[1][0].equals(y)&&game[1][2].equals(y) ){
             if(game[1][1]=="-"){
              game[1][1]=y;
             return 0;
           }
          }
          if(game[0][2].equals(y)&&game[0][1].equals(y)||game[2][0].equals(y)&&game[1][0].equals(y)||game[2][2].equals(y)&&game[1][1].equals(y) ){
            if(game[0][0]=="-"){
              game[0][0]=y;
             return 0;
           }
          }
          if(game[0][0].equals(x)&&game[1][1].equals(x)||game[0][2].equals(y)&&game[1][2].equals(y)||game[2][0].equals(y)&&game[2][1].equals(y) ){
             if(game[2][2]=="-"){
              game[2][2]=y;
             return 0;
             }
          }
          if(game[0][0].equals(y)&&game[1][0].equals(y)||game[2][2].equals(y)&&game[2][1].equals(y)||game[0][2].equals(y)&&game[1][1].equals(y)){
            if(game[2][0]=="-"){
              game[2][0]=y;
             return 0;
            }
          }
          if(game[0][1].equals(y)&&game[1][1].equals(y)||game[2][0].equals(y)&&game[2][2].equals(y)){
              if(game[2][1]=="-"){
             game[2][1]=y;
             return 0;
              }
          }
          if(game[0][0].equals(y)&&game[2][1].equals(y)||game[1][1].equals(y)&&game[1][2].equals(y) ){
            if(game[1][0]=="-"){
              game[1][0]=y;
             return 0;
            }
          }
         
          if(game[0][2].equals(y)&&game[2][2].equals(y)||game[1][1].equals(y)&&game[1][0].equals(y) ){
             if(game[1][2]=="-"){
              game[1][2]=y;
             return 0;
             }
          }
              // check to user winning statemants
         if(game[0][0].equals(x)&&game[0][1].equals(x)||game[2][0].equals(x)&&game[1][1].equals(x)||game[2][2].equals(x)&&game[1][2].equals(x)){
           if(game[0][2]=="-"){
             game[0][2]=y;
             return 0;
           }
         }
         if(game[0][1].equals(x)&&game[0][2].equals(x)||game[2][2].equals(x)&&game[1][1].equals(x)||game[1][0].equals(x)&&game[2][0].equals(x)){
          if(game[0][0]=="-"){
           game[0][0]=y;
           return 0;
          }
         }
         if(game[0][1].equals(x)&&game[2][1].equals(x)||game[2][0].equals(x)&&game[0][2].equals(x)||game[0][0].equals(x)&&game[2][2].equals(x)||game[1][0].equals(x)&&game[1][2].equals(x)){
           if(game[1][1]=="-"){
            game[1][1]=y;
            return 0;
          }
         }
         if(game[0][2].equals(x)&&game[0][0].equals(x)||game[2][1].equals(x)&&game[1][1].equals(x)){
         if(game[0][1]=="-"){
             game[0][1]=y;
             return 0;
          }
         }
         if( game[0][2].equals(x)&&game[1][2].equals(x)||game[2][0].equals(x)&&game[2][1].equals(x)|| game[0][0].equals(x)&&game[1][1].equals(x)){
         if(game[2][2]=="-"){
            game[2][2]=y;
            return 0;
          }
         }
         if(game[0][0].equals(x)&&game[1][0].equals(x)||game[2][2].equals(x)&&game[2][1].equals(x)||game[0][2].equals(x)&&game[1][1].equals(x)){
         if(game[2][0]=="-"){
            game[2][0]=y;
            return 0;
          }
         }
         if( game[0][1].equals(x)&&game[1][1].equals(x)||game[2][0].equals(x)&&game[2][2].equals(x)){
          if(game[2][1]=="-"){
           game[2][1]=y;
           return 0;
          }
         }
         if(game[0][0].equals(x)&&game[2][0].equals(x)||game[1][1].equals(x)&&game[1][2].equals(x)){
         if(game[1][0]=="-"){
            game[1][0]=y;
            return 0;
          }
         }
         if( game[0][2].equals(x)&&game[2][2].equals(x)||game[1][1].equals(x)&&game[1][0].equals(x)){
         if(game[1][2]=="-"){
           game[1][2]=y;
           return 0;
          } 
         }
         
     
         if(game[row][column]=="-"){
             game[row][column]=y;
         }else
             return cpu();
         return 0;        
     }
    public int play1game() {
        System.out.println("player 1 turn enter empty box number:");
       int box=obj.nextInt();
         int row ;
         int column;
         switch(box){
             case 1:
                 row=0;
                 column=0;
                 break;
             case 2:
                 row=0;
                 column=1;
                 break;
             case 3:
                 row=0;
                 column=2;
                 break;
             case 4:
                 row=1;
                 column=0;
                 break;
             case 5:
                 row=1;
                 column=1;
                 break;
             case 6:
                 row=1;
                 column=2;
                 break;
             case 7:
                 row=2;
                 column=0;
                 break;
             case 8:
                 row=2;
                 column=1;
                 break;
             case 9:
                 row=2;
                 column=2;
                 break;
             default :
                 System.out.println("in this number is invaild try again");
                 return play1game();
                 
             
         }
        if(row<3&&column<3){
            
        }else{
            System.out.println("Your value is invaild so,try again");
            return play1game();
        }
        if (game[row][column].equals("-")) {
            game[row][column] = "X";
        } else {
            System.out.println("fill already in the board");
            return play1game();
        }

        playcount++;
        return 0;
    }

    public int play2game() {
        System.out.println("player 2 turn enter empty box number:");
        int box=obj.nextInt();
         int row ;
         int column;
         switch(box){
             case 1:
                 row=0;
                 column=0;
                 break;
             case 2:
                 row=0;
                 column=1;
                 break;
             case 3:
                 row=0;
                 column=2;
                 break;
             case 4:
                 row=1;
                 column=0;
                 break;
             case 5:
                 row=1;
                 column=1;
                 break;
             case 6:
                 row=1;
                 column=2;
                 break;
             case 7:
                 row=2;
                 column=0;
                 break;
             case 8:
                 row=2;
                 column=1;
                 break;
             case 9:
                 row=2;
                 column=2;
                 break;
             default :
                 System.out.println("in this number is invaild try again");
                 return play2game();
                 
             
         }
        if(row<3&&column<3){
            
        }else{
            System.out.println("Your value is invaild so,try again");
            return play2game();
        }
        if (game[row][column].equals("-")) {
            game[row][column] = "O";
        } else {
            System.out.println("fill already in the board");
            return play2game();
        }

        playcount++;

        return 0;
    }

    public void gameresult() {
        System.out.println("start game:");
        //  player();
        System.out.println(play1 + " take X\n" + play2 + " take O");
        while(true) {
            play1game();
            printboart();

            if (game[0][0].equals("X") && game[0][1].equals("X") && game[0][2].equals("X") || game[1][0].equals("X") && game[1][1].equals("X") && game[1][2].equals("X") || game[2][0].equals("X") && game[2][1].equals("X") && game[2][2].equals("X") || game[0][0].equals("X") && game[1][0].equals("X") && game[2][0].equals("X") || game[0][1].equals("X") && game[1][1].equals("X") && game[2][1].equals("X") || game[0][2].equals("X") && game[1][2].equals("X") && game[2][2].equals("X") || game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X") || game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("X")) {
                System.out.println("player 1 is winner");
                break;
            } else if (game[0][0] != "-" && game[0][1] != "-" && game[0][2] != "-" && game[1][0] != "-" && game[1][1] != "-" && game[1][2] != "-" && game[2][0] != "-" && game[2][1] != "-" && game[2][2] != "-") {
                System.out.println("match draw");
                break;
            }
            play2game();
            printboart();
            if (game[0][0].equals("O") && game[0][1].equals("O") && game[0][2].equals("O") || game[1][0].equals("O") && game[1][1].equals("O") && game[1][2].equals("O") || game[2][0].equals("O") && game[2][1].equals("O") && game[2][2].equals("O") || game[0][0].equals("O") && game[1][0].equals("O") && game[2][0].equals("O") || game[0][1].equals("O") && game[1][1].equals("O") && game[2][1].equals("O") || game[0][2].equals("O") && game[1][2].equals("O") && game[2][2].equals("O") || game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O") || game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) {
                System.out.println("player 2 is wnner");
                break;
            } else if (game[0][0] != "-" && game[0][1] != "-" && game[0][2] != "-" && game[1][0] != "-" && game[1][1] != "-" && game[1][2] != "-" && game[2][0] != "-" && game[2][1] != "-" && game[2][2] != "-") {
                System.out.println("match draw");
                break;
            }

        }

    }
    public void CPUgameRule(){
        System.out.println("Start the game");
        while(true){
          
            System.out.println("CPU turn ");
            cpu();
            printboart();
            if (game[0][0].equals(y) && game[0][1].equals(y) && game[0][2].equals(y) || game[1][0].equals(y) && game[1][1].equals(y) && game[1][2].equals(y) || game[2][0].equals(y) && game[2][1].equals(y) && game[2][2].equals(y) || game[0][0].equals(y) && game[1][0].equals(y) && game[2][0].equals(y) || game[0][1].equals(y) && game[1][1].equals(y) && game[2][1].equals(y) || game[0][2].equals(y) && game[1][2].equals(y) && game[2][2].equals(y) || game[0][0].equals(y) && game[1][1].equals(y) && game[2][2].equals(y) || game[0][2].equals(y) && game[1][1].equals(y) && game[2][0].equals(y)) {
                System.out.println("CPU is wnner");
                break;
            } else if (game[0][0] != "-" && game[0][1] != "-" && game[0][2] != "-" && game[1][0] != "-" && game[1][1] != "-" && game[1][2] != "-" && game[2][0] != "-" && game[2][1] != "-" && game[2][2] != "-") {
                System.out.println("match draw");
                break;
            }
              OnePlayergame();
            printboart();
             if (game[0][0].equals(x) && game[0][1].equals(x) && game[0][2].equals(x) || game[1][0].equals(x) && game[1][1].equals(x) && game[1][2].equals(x) || game[2][0].equals(x) && game[2][1].equals(x) && game[2][2].equals(x) || game[0][0].equals(x) && game[1][0].equals(x) && game[2][0].equals(x) || game[0][1].equals(x) && game[1][1].equals(x) && game[2][1].equals(x) || game[0][2].equals(x) && game[1][2].equals(x) && game[2][2].equals(x) || game[0][0].equals(x) && game[1][1].equals(x) && game[2][2].equals(x) || game[0][2].equals(x) && game[1][1].equals(x) && game[2][0].equals(x)) {
                System.out.println(one+" is winner");
                break;
            } else if (game[0][0] != "-" && game[0][1] != "-" && game[0][2] != "-" && game[1][0] != "-" && game[1][1] != "-" && game[1][2] != "-" && game[2][0] != "-" && game[2][1] != "-" && game[2][2] != "-") {
                System.out.println("match draw");
                break;
            }
        }
    }

}


public class XOgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter your option:");
        System.out.println("option 1: single player ");
        System.out.println("option 2: 2 player ");
        int a=obj1.nextInt();
        twoPlayer game = new twoPlayer();
         if(a==2){
            game.boart();
            System.out.println("your plain board");
            game.printboart();
            game.player();
            game.gameresult();

            System.out.println("Final board:");
            game.printboart();
         }else if(a==1){
              game.boart();
            System.out.println("your plane board");
            game.printboart();
             game.OnePlayer();
             game.CPUgameRule();
            System.out.println("Final board:");
            game.printboart();
         }else{
             System.out.println("Sory enter the correct option ");
         }
//      snakeLader game2 =new snakeLader();
//          game2.board();
//          game2.printboard();
      //    game2.dies();
    }
}
/*
class snakeLader{
        Scanner input =new Scanner(System.in);
        int play1,playcount=1;
    static int game[][]=new int[10][10];
    int i,j,n,odd=1;
     int no=100;
    public void board(){
        for(i=0;i<10;i++){
           if(odd==1){
               for(j=0;j<10;j++){
                   game[i][j]=no;
                   no--;
                      }
               no=no-9;
               odd=2;
           }else if(odd==2){
               for(j=0;j<10;j++){
                   game[i][j]=no;
                   no++;
               }
               no=no-11;
               odd=1;
           }
        }
    }
    public void printboard(){
          for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(game[i][j]==100){
                    System.out.print("|"+game[i][j]+" |");
                }else if(game[i][j]>9){
                    System.out.print("| "+game[i][j]+" |");
                }else if(game[i][j]<10){
                    System.out.print("|  "+game[i][j]+" |");
                }
            }
             System.out.println();
        }
      }
    public void dies(){
        Random r=new Random();
        int dies=r.nextInt(1+6)+1;
        System.out.println(dies);    
    }
    public void player(){
        System.out.println("enter player name :");
        play1=input.nextInt();
    }
    public void playgame(){
        
    }
    public void game(){
        System.out.println(play1+"start game");
        for(i=0;i<playcount;i++){
            
        }
    }  
}
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int abc=0;
class board{
    public:
    int a[10][10]={0},Dice,temp1,temp2,status1=0,status2=0,progress1=0;
    char roll;
    void createBoard(){
        int  MAX=100,odd=1;
        for (int i = 0; i < 10; i++){
            if (odd==1)
            {
                for (int j = 0; j < 10; j++)
                {
                    a[i][j]=MAX;
                    MAX--;
                }
                odd=2;
                MAX = MAX-9;
            }
            else if (odd==2)
            {
                for (int j = 0; j < 10; j++){
                    a[i][j]=MAX;
                    MAX++;
                }
                odd=1;
                MAX=MAX-11;
            }
        }
    }

    void printBoard(){
       
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {

                if(a[i][j]==111)
                {
                    cout<<"P1\t";
                    continue;
                }
                cout<<a[i][j]<<"\t";

            }
            cout<<endl;
        }

    }
    void diceRoll(){
        srand(time(0));
        Dice=rand()%6+1;
        cout<<endl<<"Dice Value: "<<Dice<<endl<<endl;
    }
    void playerOne(){
        if(Dice==1&&status1==0){
            status1=1;
            progress1=1;
        }
        if (progress1>100)
        {
            progress1=progress1;

        }
        else if(progress1==100){
            cout<<"\nPlayer 1 Won the Game!\n";

        }

        else if(status1==1){

            //CP1:
            cout<<"Current Progress: "<<progress1<<endl;
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (a[i][j]==progress1)
                    {
                        a[i][j]=111;
                    }

                }

            }
            printBoard();

            cout<<"Enter R to roll: ";
            cin>>roll;
            diceRoll();
            createBoard();
            progress1=progress1+Dice;
        }
    }
};


int main()
{

    cout<<endl<<" Snake and Ladder S & /-/"<<endl<<endl;
    board boardobj;
    boardobj.createBoard();
    boardobj.printBoard();
    boardobj.diceRoll();
    while (boardobj.progress1<=100)
    {
        if(boardobj.status1==1||boardobj.Dice==1){
            boardobj.playerOne();
        }
        else{
            break;
        }
    }


    return 0;
}

*/
