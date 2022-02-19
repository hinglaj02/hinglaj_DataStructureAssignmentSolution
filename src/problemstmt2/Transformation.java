package problemstmt2;

	class Node{
	    int val;
	   public Node left;
	public Node right;
	   public static Node node;
	    Node(int item){
	        val = item;
	        left = right = null;
	    }
	}

public class Transformation {
	
	    public static Node prevNode = null;
	  public  static Node headNode = null;
	public static Node node;
	   
	  public void convertToSkewed(Node root){
	       
	        
	        if(root == null){
	            return;
	        }
	       
	        convertToSkewed(root.left);
	        
	        Node rightNode = root.right;
	       
	        if(headNode == null){
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else{
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	        convertToSkewed(rightNode);
	        
	    }
	   
	 

		public void traverseRightSkewed(Node root){
	        if(root == null){
	            return;
	        }
	        System.out.print(root.val + " ");
	        traverseRightSkewed(root.right);       
	    }
	   
	   
	 
	   
	}

