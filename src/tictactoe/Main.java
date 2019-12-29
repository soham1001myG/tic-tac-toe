package tictactoe;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] cells = new char[3][3];
        int i,j,count=0;
        String m,n;
        String result = null;

//        System.out.println("---------");
        for (i = 0; i < 3; i++) {
//            System.out.print("| ");
            for (j = 0; j < 3; j++) {
                cells[i][j] = ' ';
//                System.out.print(cells[i][j] + " ");
                    /*if(cells[i][j]=='O'||cells[i][j]=='o') count++;
                    if(cells[i][j]=='X'||cells[i][j]=='x') count--;*/
            }
//            System.out.println("|");
        }
        int loop=0;
        while(loop!=-1)
        {   if(loop==9) break;
            System.out.println("---------");
            for (i = 0; i < 3; i++) {
                System.out.print("| ");
                for (j = 0; j < 3; j++) {
//                    cells[i][j] = ip.charAt(3 * i + j);
                    System.out.print(cells[i][j] + " ");
                    /*if(cells[i][j]=='O'||cells[i][j]=='o') count++;
                    if(cells[i][j]=='X'||cells[i][j]=='x') count--;*/
                }
                System.out.println("|");
            }

        System.out.println("---------");

           while(true){ System.out.print("Enter the coordinates: ");
            m=sc.next();
            n=sc.next();
            int k=Integer.parseInt(m);
            int l=Integer.parseInt(n);
            if((k >= 1) && (k <= 3) && (l >= 1) && (l <= 3))
            {
                i=3-l;
                j=k-1;
                if((cells[i][j]=='_') || (cells[i][j]==' '))
                {
                    if(loop%2==0)cells[i][j]='X';
                    else cells[i][j]='O';
                    break;

                }
                else
                    System.out.println("This cell is occupied! Choose another one!");
            }
            else if((m.equals("one") || m.equals("two") || m.equals("three"))&&(n.equals("one") || n.equals("two") || n.equals("three"))){
                System.out.println("You should enter numbers!");
            }
            else{
                System.out.println("Coordinates should be from 1 to 3!");
            }}



            {for (i = 0; i<3;i++) {
            if ((cells[i][0] == cells[i][1]) && (cells[i][1] == cells[i][2])&& (cells[i][1] == 'X' || cells[i][1] == 'O' )) {
                result=(cells[i][0] + " wins");
                loop=-2;
            }
            if ((cells[0][i] == cells[1][i]) && (cells[2][i] == cells[1][i])) {
                if(cells[0][i]=='X'||cells[0][i]=='O'){result=(cells[0][i] + " wins");
                loop=-2;}
            }
        }

        if((cells[0][0] == cells[2][2]) && (cells[2][2] == cells[1][1])) {
            if(cells[1][1]=='X'||cells[1][1]=='O'){result=(cells[1][1]+" wins");
            loop=-2;}
        }
        else if((cells[0][2] == cells[2][0]) && (cells[0][2] == cells[1][1])) {
            if(cells[1][1]=='X'||cells[1][1]=='O'){result=(cells[1][1]+" wins");
            loop=-2;}
        }}
        loop++;
    }
        System.out.println("---------");
        for (i = 0; i < 3; i++) {
            System.out.print("| ");
            for (j = 0; j < 3; j++) {
                if(cells[i][j]==' ') cells[i][j]='_';
                System.out.print(cells[i][j] + " ");
            }System.out.println("|");
        }
        System.out.println("---------");
        if(loop==9)
        {System.out.println("Draw");}
        else {
            System.out.println(result);
        }

       /* cells[i][j]='X';
        System.out.println("---------");
        for (i = 0; i < 3; i++) {
            System.out.print("| ");
            for (j = 0; j < 3; j++) {

                System.out.print(cells[i][j] + " ");

            }
            System.out.println("|");
        }
        System.out.println("---------");*/
        // write your code here
    }
}

