package day06;

public class BinaryTreeDFS {
	
	Node root;
	
	class Node{
		int data;//데이터
		Node left, right;//왼쪽 자식, 오른쪽 자식 노드를 참조할 변수
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}/////////////////
	
	public Node makeTree() {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		return root;
	}//----------------------------------
	
	//전위순회: 부모-> 왼쪽 -> 오른쪽
	//1 2 4 5 3 6 7
	public void preorder(Node root) {
		if(root==null) { 
			System.out.println("종료");
			return;
		}
		System.out.print(root.data+"->");
		preorder(root.left);
		preorder(root.right);
	}//----------------------------------
	//중위순회: 왼쪽 -> 부모 -> 오른쪽
	//4 2 5 1 6 3 7
	public void inorder(Node root) {
		if(root==null) {
			System.out.println("종료");
			return;
		}
		inorder(root.left);
		System.out.print(root.data+"->");
		inorder(root.right);
	}//-----------------------------------
	//후위순회: 왼쪽-> 오른쪽 -> 부모
	//4 5 2 6 7 3 1
	public void postorder(Node root) {
		if(root==null) {
			System.out.println("종료");
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+"->");
	}//-----------------------------------

	public static void main(String[] args) {
		BinaryTreeDFS app=new BinaryTreeDFS();
		Node root=app.makeTree();
		//app.preorder(root);//전위순회하는 메서드 호출
//		app.inorder(root);
		app.postorder(root);
	}

}




