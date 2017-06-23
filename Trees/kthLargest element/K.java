/*Complete the function below
The Node is as follows 
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
*/
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
class K{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			Node root=new Node(sc.nextInt());
			for(int i=0;i<n-1;i++)
				insert(root,sc.nextInt());
			int k=sc.nextInt();
			GfG g = new GfG();
			g.kthLargest(root,k);
		}
	}
	public static Node insert(Node root,int n){
		if(root==null)
			return new Node(n);
		if(n<root.data)
			root.left=insert(root.left,n);
		if(n>root.data)
			root.right=insert(root.right,n);
		return root;
	}
}
class GfG
{
    static ArrayList<Integer> list;
        
    static void inorder(Node root) {
        if ( root != null) {
            inorder(root.left);
            list.add(root.data);
            inorder( root.right);
            }
    }        
        
    
    public void kthLargest(Node root,int k)
    {
        list = new ArrayList<Integer>();
        inorder(root);
        System.out.println(list.get(list.size()-k));
    }
}
