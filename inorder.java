  
public class InOrder {
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
	InOrder ()
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

	void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }
	

	public static void main(String[] args) {
		InOrder  tree = new InOrder();
        tree.root = tree.insertRec(tree.root, 50);
        tree.root = tree.insertRec(tree.root, 30);
        tree.root = tree.insertRec(tree.root, 20);
        tree.root = tree.insertRec(tree.root, 40);
        tree.root = tree.insertRec(tree.root, 70);
        tree.root = tree.insertRec(tree.root, 60);
        tree.root = tree.insertRec(tree.root, 80);

        tree.inOrderTraversal(tree.root);
        System.out.println();

	}
	}