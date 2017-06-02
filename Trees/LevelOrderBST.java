
class LevelOrderBST {
    void levelOrder(Node node)  {
        LinkedList <Node> sax = new LinkedList<Node>();
        sax.add(node);
        Node curr;
        while ( sax.size() > 0 ) {
            curr = sax.get(0);
            sax.remove(0);
            System.out.print(curr.data+" ");
            if ( curr.left != null) sax.add(curr.left);
            if ( curr.right != null) sax.add(curr.right);
        }
    }
}
