/*
 * Find the number of combinations possible with the given number of parenthesis.
 * */



import java.util.Scanner;

class Parenthesis
{
	static int count=0;

    static void Result(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
        	 // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
           count++;
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                Result(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                Result(str, pos+1, n, open+1, close);
            }
        }
    }
     
    static void Parenthesis(char str[], int n)
    {
        if(n > 0)
        Result(str, 0, n, 0, 0);
        return;
    }
     
   
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Please enter the number of open/close parenthesis");
        int n = sc.nextInt();
        char[] str = new char[2 * n];
        
        Parenthesis(str, n);
        System.out.println("Possible number of combination:-"+count);
    }
}
