/*
 * There are three concentration Hafniuum(H) Silicon(S) Lithium (L). These concentration are
 *  always mixed in the order they are given HSL. Find out how many such combination 
 *  can be made from the given concentration

Example: 
Input: HHSL
Output: 2
Explanation: 

1st combination-H at position 1 - followed by S at position 3 followed by L at position 4
2nd combination-H at position 2 followed by S at position 3 followed by L at position 4.

Example 2:
INPUT:SHL
OUTPUT: 0

As a combination of H-S-L cannot be made the output is 0
 * */






import java.util.*;
public class TripletKai {
	
	static int j=0;
	static int count=0;
	static int count2=0;
	public static final Scanner sc=new Scanner(System.in);
	
	public static void triplet(char[]ch,char[]ch2,int pos)
	{
		if(j==3)
		{
			count++;
			j=0;
			return;
		}
		
		for(int i=pos;i<ch.length;i++)
		{
			if(ch[i]==ch2[j])
			{
				j++;
				triplet(ch,ch2,pos+1);
			}
		}
	}
	
	public static void triplet2(char[] ch)
	{
		for(int k=0;k<ch.length;k++){
			if(ch[k]=='H') {
			for(int i=k+1;i<ch.length;i++)
			{
				if(ch[i]=='S')
				{
					for(int m=i+1;m<ch.length;m++)
					{
						if(ch[m]=='L')
						{
							count2++;
						}
					}
				}
			}
		}
			
	}
		
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		String str="";
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		int pos=0;
		
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]=='H')
			{
				arr.add(j);
			}
		}
		char ch1[]=new char[3];
		ch1[0]='H';
		ch1[1]='S';
		ch1[2]='L';
		triplet(ch,ch1,pos);
		triplet2(ch);
		System.out.println("the combination "+count);
		System.out.println("the combination "+count2);
		
		
	}

}
