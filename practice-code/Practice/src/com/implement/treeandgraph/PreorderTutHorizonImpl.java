package com.implement.treeandgraph;

import java.util.Stack;

public class PreorderTutHorizonImpl {
	public void preOrderRecursive(NodeObj root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}

	public void preorderIteration(NodeObj root) {
		Stack<NodeObj> s = new Stack<NodeObj>();
		while (true) {
			// First print the root node and then add left node
			while (root != null) {
				System.out.print(root.data + " ");
				s.push(root);
				root = root.left;
			}
			// check if Stack is emtpy, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack and go right to the tree
			root = s.pop();
			root = root.right;
		}
	}

	public static void main(String[] args) {
		NodeObj root = new NodeObj(1);
		root.left = new NodeObj(2);
		root.right = new NodeObj(3);
		root.left.left = new NodeObj(4);
		root.left.right = new NodeObj(5);
		root.right.left = new NodeObj(6);
		root.right.right = new NodeObj(7);
		
		PreorderTutHorizonImpl i = new PreorderTutHorizonImpl();
		i.preOrderRecursive(root);
		System.out.println();
		i.preorderIteration(root);
	}

}

class NodeObj {
	int data;
	NodeObj left;
	NodeObj right;

	public NodeObj(int data) {
		this.data = data;
	}
}
