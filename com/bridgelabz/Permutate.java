package com.bridgelabz;

public class Permutate {

	 public static String swapString(String a, int i, int j) {
	        char[] b =a.toCharArray();
	        char ch;
	        ch = b[i];
	        b[i] = b[j];
	        b[j] = ch;
	        return String.valueOf(b);
	    }

	    public static void main(String[] args) {

	        String str = "LAVA";
	        int len = str.length();
	        System.out.println(" The permutations string are: ");
	        generatePermutation(str, 0, len);
	    }

	    //Function for generating different permutations of the string
	    public static void generatePermutation(String str, int start, int end)
	    {
	        //Prints the permutations
	        if (start == end-1)
	            System.out.println(str);
	        else
	        {
	            for (int i = start; i < end; i++)
	            {
	                str = swapString(str,start,i);
	                generatePermutation(str,start+1,end);
	                str = swapString(str,start,i);
	            }
	        }
	    }
}
