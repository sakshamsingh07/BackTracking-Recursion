package backTracking_recursion;


import java.util.Scanner;
public class Nqueens 
{
    public static void Queens(int [][]chess ,String asf,int row)
    {
        if(row==chess.length)
        {
            System.out.println(asf+ " .");
            return;
        }
        for(int col=0;col<chess[0].length;col++)
        {
            if(Safe(row,col,chess))
            {
                chess[row][col]=1;
                Queens(chess,asf+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }
        }
        
    }
    public static boolean Safe(int r ,int c,int [][]chess)
    {
        int n=chess.length;
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++)
        {
            if( chess[i][j]==1)
            {
             return false;
            }
        }
        
        for(int i=r-1,j=c;i>=0;i--)
        {
            if( chess[i][j]==1)
            {
             return false;
            }
        }
       
        for(int i=r-1, j=c-1;i>=0 &&j>=0;i--,j--)
        {
           if( chess[i][j]==1)
           {
            return false;
           }
           
        }
        return true;
        
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int [][]arr= new int [n][n];
        Queens(arr,"",0);
    }
    
}
