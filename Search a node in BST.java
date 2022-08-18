class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        while(root!=null && root.data!=x)
        {
            root = x < root.data ? root.left : root.right; 
        }
        
        if(root==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

