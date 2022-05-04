package mycontainers;

public class Node {

	String value;
	Node left, right;
	
	public Node(String s) {
		value = s;
		left = null;
		right = null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String getValue() {
		return value;
	}
	
	public String toString()
	{
		String s = "Nodo " + value;
		
		if (left == null)
		{
			s += " - ";
		}
		else
		{
			s += " + ";
		}
		
		s+= (left == null ? " - " : " + ");
		s+= (right == null ? " - " : " + ");
		
		return s;
	}
	
}
