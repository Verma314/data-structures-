// INITIAL CODE
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.*;
import java.lang.*;
import java.io.*;

// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}



class Reverse_Level_Order_Traversal
{
	int height(Node node)
		{
			if(node==null)
				return 0;
			int l = 1+height(node.left);
			int r = 1+height(node.right);
			if(l>r)
				return l;
			else
				return r;
		}
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;

        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();

            Node root=null;

            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }

                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
		
            GfG g = new GfG();
            g.reversePrint(root);
			System.out.println();
            t--;
			
        }
    }
}
class GfG {
	void reversePrint(Node node)  {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> list = new ArrayList<Integer>(100);
        Node head = node;
        q.add(head);
	Node element;
        while ( !q.isEmpty() ) {
            element = q.peek();
	    //System.out.println(q.peek().data );
            list.add(element.data);
            q.remove();
	    if ( element.left != null )
            	q.add(element.left);
	    if ( element.right !=null )            
		q.add(element.right);
        }    
        Collections.sort(list);
	Collections.reverse(list);
	for ( Integer i : list)
		System.out.print(i+" ");
	System.out.println();  
        

        }
}      
       

