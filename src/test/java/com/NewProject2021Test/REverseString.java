package com.NewProject2021Test;

public class REverseString {

	public void reverse() {
		String s ="Keshava";
		
		
		for(int i=s.length()-1;i>0;i--) 
		{
			System.out.print(s.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		REverseString resstr = new REverseString();
		resstr.reverse();
	}
}
