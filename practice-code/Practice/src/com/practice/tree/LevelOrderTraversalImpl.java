package com.practice.tree;


class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	public TreeNode(int data) {
		super();
		this.data = data;
	}
}
public class LevelOrderTraversalImpl {
	TreeNode root;
	
	
public LevelOrderTraversalImpl() {
		super();
		this.root = root;
	}

static void printLevelOrder(TreeNode root){
	int height = height(root);
	System.out.println("Tree Height: "+height);
	System.out.println("Level order traversal of binary tree is ");
	for(int i = 0; i<= height; i++){
		printLevelByLevel(root, i);
	}
}

static void printLevelByLevel(TreeNode root, int level){
	if(root == null){
		return;
	}
	if(level == 1){
		System.out.print(root.data+ " ");
	}
	else if(level>1)
	{
		printLevelByLevel(root.left, level-1);
		printLevelByLevel(root.right, level-1);
	}
}

static int height(TreeNode root){
	
	int lHeight = 0;
	int rHeight = 0;
	if(root == null){
		return 0;
	}
	lHeight = height(root.left);
	rHeight = height(root.right);
	
	if(lHeight>rHeight)
		return lHeight+1;
	else 
		return rHeight+1;
}

public static void main(String[] args)	{

LevelOrderTraversalImpl tree = new LevelOrderTraversalImpl();
tree.root= new TreeNode(1);
tree.root.left= new TreeNode(2);
tree.root.right= new TreeNode(3);
tree.root.left.left= new TreeNode(4);
tree.root.left.right= new TreeNode(5);
tree.root.right.left= new TreeNode(6);
tree.root.right.right= new TreeNode(7);
printLevelOrder(tree.root);
}



}
