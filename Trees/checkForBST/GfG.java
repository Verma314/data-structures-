/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
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
        
    
    int isBST(Node root)  {
        list = new ArrayList<Integer>();
        inorder(root);
        
        //System.out.println(list);
        ArrayList<Integer> copy = new ArrayList<Integer>();
        copy.addAll(list);
        Collections.sort(copy);
        //System.out.println(list);
        if ( list.equals(copy) )
            return 1;
        else
            return 0;
        
    }
    
    
}
