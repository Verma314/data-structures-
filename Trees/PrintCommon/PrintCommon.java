import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node (int d){
		data=d;
		left=right=null;
	}
}
class PrintCommon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n1=sc.nextInt();
			Node root1=null;
			Node root2=null;
			for(int i=0;i<n1;i++){
				int a=sc.nextInt();
				if(root1==null)
					root1=new Node(a);
				else{
					insert(root1,a);
				}
			}
			int n2=sc.nextInt();
			for(int i=0;i<n2;i++){
				int a=sc.nextInt();
				if(root2==null)
					root2=new Node(a);
				else{
					insert(root2,a);
				}
			}
			GfG g=new GfG();
			g.printCommon(root1,root2);
			System.out.println();
		}
	}
	public static Node insert(Node root,int a){
		if(root==null)
			return new Node(a);
		if(root.data>a){
			root.left=insert(root.left,a);
		}
		if(root.data<a)
			root.right=insert(root.right,a);
		return root;
	}
}
class GfG {
    static int A[] = new int[100];
    static int B[] = new int[100];

    static int ans[] = new int[100];

    static int a_pos = 0;
    static int b_pos = 0;
    static int ans_pos = 0;
    
    static void preorderA(Node root) {
        if ( root != null ) {
            A[a_pos] = root.data;
            a_pos++;
            preorderA(root.left);
            preorderA(root.right);
        }
    }
    static void preorderB(Node root) {
        if ( root != null ) {
            B[b_pos] = root.data;
            b_pos++;
            preorderB(root.left);
            preorderB(root.right);
        }
    }
    
    public void printCommon(Node root1,Node root2) {
        

        preorderA(root1);
        preorderB(root2);

	Arrays.sort(A,0,a_pos);
	Arrays.sort(B,0,b_pos);
        

	//for ( int i = 0; i < a_pos; i++ ) 
	//	System.out.println(A[i] );


	for ( int i = 0; i < a_pos; i++ ) {
            int query = A[i];
	    int retval = Arrays.binarySearch(B,0,b_pos,query);
	    if ( retval >= 0 && retval < b_pos ) 
		System.out.print(query+" ");

	}

	for ( int l = 0; l < ans_pos; l++ ) 
		System.out.print(ans[l]+" ");
	
    }
}















































