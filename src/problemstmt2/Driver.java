package problemstmt2;

public class Driver extends Transformation {
	
	   public static void main (String[] args)
	   {
		   
		   System.out.println("Output:");
	     Transformation tree = new Transformation();
	        tree.node = new Node(50);
	        
	        tree.node.left = new Node(30);
	        tree.node.right = new Node(60);
	        tree.node.left.left = new Node(10);
	        tree.node.left.right= new Node(40);
	     
	        tree.convertToSkewed(node);
	        
	        tree.traverseRightSkewed(headNode);
	        }
}

