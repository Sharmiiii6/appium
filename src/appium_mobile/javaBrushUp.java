package appium_mobile;

import java.util.ArrayList;
import java.util.Arrays;

public class javaBrushUp {

	public static void main(String[] args) {
	
		int myNum=5;
		String website="Sharmi Adhikary";
		char letter='s';
		double dec= 5.99;
		boolean myCard= true;
		
		System.out.println(myNum+"is my variable");
		
		//array
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		int[] array2= {1,2,3,4,5};
		System.out.println(array2[3]);

		//for loop
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		//enhance for loop
		String[] name= {"sharmi","Adhikary"};
		for(String s:name) {
			System.out.println(s);
		}
		
		//print only multiple by 2
		int[] array3= {1,2,3,4,5};
		for(int i=0;i<array3.length;i++) {
			if(array3[i]%2==0)
			{
			System.out.println(array3[i]);
			}
			else
			{
				System.out.println(array3[i]+"is not multiple by 2");	
			}
			}
		
		//array list
		ArrayList<String> a=new ArrayList<String>();//create object of the class -object.method
		a.add("Sharmi");
		a.add("Adhikary");
		System.out.println(a.get(1));
		
		//string is an object
		String s="Java Practice";
		String[] splitedstring=s.split(" ");
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1]);
		
		for(int i=0;i<s.length();i++) {    //print by one letter
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i<s.length();i--) {    //print by last letter
			System.out.println(s.charAt(i));
		}
		
		
		}
	}


