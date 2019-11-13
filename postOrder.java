public class PostOrder {
	class Node{
		int key;
		Node left,right;
		Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
	PostOrder()
	{
		root=null;
	}
	
	Node insertRec(Node root,int key)
	{
		if(root==null) {
			root=new Node(key);
		//return root;
		}
		if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
	}
	int height(Node node)
	{
		if (node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}

	void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
	public static void main(String[] args) {
		PostOrder tree = new PostOrder();
        tree.root = tree.insertRec(tree.root, 50);
        tree.root = tree.insertRec(tree.root, 30);
        tree.root = tree.insertRec(tree.root, 20);
        tree.root = tree.insertRec(tree.root, 40);
        tree.root = tree.insertRec(tree.root, 70);
        tree.root = tree.insertRec(tree.root, 60);
        tree.root = tree.insertRec(tree.root, 80);


        tree.postOrderTraversal(tree.root);
        System.out.println();
        
        System.out.println("height of tree: "+tree.height(tree.root));
        
		// TODO Auto-generated method stub

	}
	}