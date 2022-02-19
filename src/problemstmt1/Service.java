package problemstmt1;

import java.util.PriorityQueue;

public class Service {
	public void print(int floor[],int num) {
		
		System.out.println("The order of construction is as follows");
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempArray = new int[num];

		int max = num;

		System.out.println();
		for (int i = 0; i < num; i++) {

			System.out.println("Day: "+(i+1));
			
			
			tempArray[i] = floor[i];

			queue.add(tempArray[i]);


			while (!queue.isEmpty() && queue.peek() == max) {

				System.out.print(queue.poll() + " ");

				max--;

			}

			System.out.println();

		}

	  }
}
