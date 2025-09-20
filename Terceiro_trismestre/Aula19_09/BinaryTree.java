package tree;

public class Binarytree {
	private Node root;
	
	
	
	public void add(int value) {
		root = add(root, value);
		
	}
	
	private Node add(Node node, int value) {
		if(node == null) {
			node = new Node(value);
		}else if(value < node.value){
			node.left = add(node.left, value); // ele passa um novo Node diferente do primeiro sendo assim ele "anda"
		} else {
			node.right = add(node.right, value);
		}
		 return node;
		
	}
	
	
	public void printOrder() {
		printOrder(root);
	}
	
	
	private void printOrder(Node node) {
		if(node == null) {
			return;
		} else {
			printOrder(node.left);
			System.out.println(node.value);
			printOrder(node.right);
		}
	}
	
	public void printInReverseOrder() {
		printInReverseOrder(root);
	}
	
	
	private void printInReverseOrder(Node node) {
		if(node == null) {
			return;
		} else {
			printInReverseOrder(node.right);
			System.out.println(node.value);
			printInReverseOrder(node.left);
		}
	}
	
	
	
	public void printPreOrder() {
		printPreOrder(root);
	}
	
	private void printPreOrder(Node node) {
		if(node == null) {
			return;
		} else {
			System.out.println(node.value);
			printPreOrder(node.left);
			printPreOrder(node.right);
			
		}
	}
	
	
	public void printPostOrder() {
		printPostOrder(root);
	} 
	
	
	private void printPostOrder(Node node) {
		if(node == null) {
			return;
		} else {
			
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.println(node.value);
			
		}
	}
	
	
	
	

	
	private static class Node{
		int value;
		Node left;
		Node right;
		
		
		
		
		public Node(int value) {
			this.value = value;
		}
		
	}

}
