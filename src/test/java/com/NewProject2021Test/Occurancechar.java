package com.NewProject2021Test;

public class Occurancechar {

	public void occurancechar() {

		String s="aaaaabbbbccc";

		for(int i=0;i<=s.length()-1;i++)
		{
			int count=0;
			char ch=s.charAt(i);
			for(int j=0;j<=s.length()-1;j++)
			{
				char ch1=s.charAt(j);
				
				if(ch==ch1 && i>j)
				{
					break;
				}
				if(ch==ch1) 
				{
					count++;
				}
			}
			if(count>0) 
			{
				System.out.print(ch+""+count);
				System.out.print("hi");
			}
		}
// a5b3c3
	}
	public static void main(String[] args) {
		Occurancechar occ=new Occurancechar();
		occ.occurancechar();
	}
}
