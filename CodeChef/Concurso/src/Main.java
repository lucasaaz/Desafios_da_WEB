/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while( T-- > 0){
		    int S = 0;
		    int L = 0;
		    
		    String s = sc.nextLine();
		    
		    if( s.equals("START38")){
		        S++;
		    } else if( s.equals("LTIME108")){
		        L++;
		    }
		    
		    System.out.println(S + " " + L);
		}
	}
}
