package problemstmt1;

import java.io.IOException;
import java.util.Scanner;

import problemstmt1.*;

public class main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int num = sc.nextInt();

	    int[] floor = new int[num];
		
	   
		for(int i=0; i<num; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floor[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		Service service = new Service();
		service.print(floor, num);
	}
}
