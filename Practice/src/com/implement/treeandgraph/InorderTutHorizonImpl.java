package com.implement.treeandgraph;

import java.util.Stack;
public class InorderTutHorizonImpl {

	public void inorderRecursive(NodeDomObj root) {
		if (root != null) {
			inorderRecursive(root.left);
			System.out.print(root.data + " ");
			inorderRecursive(root.right);
		}
	}

	public void inorderIteration(NodeDomObj root) {
		Stack<NodeDomObj> s = new Stack<NodeDomObj>();
		while (true) {
			// Go to the left extreme insert all the elements to stack
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			// check if Stack is empty, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack , print it and add the nodes at
			// the right to the Stack
			root =s.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}

	public static void main(String[] args) {
		NodeDomObj root = new NodeDomObj(1);
		root.left = new NodeDomObj(2);
		root.right = new NodeDomObj(3);
		root.left.left = new NodeDomObj(4);
		root.left.right = new NodeDomObj(5);
		root.right.left = new NodeDomObj(6);
		root.right.right = new NodeDomObj(7);

		InorderTutHorizonImpl i = new InorderTutHorizonImpl();
		i.inorderRecursive(root);
		System.out.println();
		i.inorderIteration(root);
	}

}

class NodeDomObj 
{
	int data;
	NodeDomObj left;
	NodeDomObj right;

	public NodeDomObj(int data) {
		this.data = data;
	}
}
