package com.epam.task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int tot=0,total_of_childrens=0;
		System.out.println("New Years gift");
		System.out.println("Enter no.of Children");
		total_of_childrens=in.nextInt();
		ChocolatesAndSweets chsw;
		while(total_of_childrens!=0){
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Dairy Milk");
				chsw=new DairyMilk();
				tot = chsw.totalWeigth(20);
				System.out.println("Total DairyMilk weight is:"+tot);
				break;
				case 2:System.out.println("5-Star");
				chsw=new FiveStar();
				tot=chsw.totalWeigth(10);
				System.out.println("Total 5-Star weight is:"+tot);
				break;
				case 3:System.out.println("Melodies");
				chsw=new Melodies();
				tot=chsw.totalWeigth(10);
				System.out.println("Total Melodies weight is"+tot);
				break;
				case 4:System.out.println("Kheer");
				chsw=new Kheer();
				tot=chsw.totalWeigth(100);
				System.out.println("Total Weight of Kheer is"+tot);
				break;
				case 5:System.out.println("Gulab jammun");
				chsw=new GulabJaamun();
				tot=chsw.totalWeigth(100);
				System.out.println("Total Weight of Gulab Jaamun is"+tot);
				break;
				case 6:System.out.println("Name\t\t\t\tPrice\t\t\tTotalQuantity\t\t\tTotal Price");
				System.out.println("DairyMilk\t\t\t"+DairyMilk.price+"\t\t\t"+DairyMilk.quantity+"\t\t\t\t"+DairyMilk.totalprice);
				System.out.println("5-Star\t\t\t\t"+FiveStar.price+"\t\t\t"+FiveStar.quantity+"\t\t\t\t"+FiveStar.totalprice);
				System.out.println("Melodies\t\t\t"+Melodies.price+"\t\t\t"+Melodies.quantity+"\t\t\t\t"+Melodies.totalprice);
				System.out.println("Kheer\t\t\t\t"+Kheer.price+"\t\t\t"+Kheer.quantity+"\t\t\t\t"+Kheer.totalprice);
				System.out.println("Gulab Jaamun\t\t\t"+GulabJaamun.price+"\t\t\t"+GulabJaamun.quantity+"\t\t\t\t"+GulabJaamun.totalprice);
				
				
			}
			total_of_childrens--;
			
		}
		int total_spent_on_gifts=DairyMilk.totalprice+FiveStar.totalprice+Melodies.totalprice+Kheer.totalprice+GulabJaamun.totalprice;
		System.out.println("Total Money Spent on Chocolates and Sweets are:"+total_spent_on_gifts);
		
		
		
		
			
			


	}

}
