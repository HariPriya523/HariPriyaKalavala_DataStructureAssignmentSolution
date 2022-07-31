package com.greatlearning.bst.driver;

import com.greatlearning.bst.node.Node;

public class BSTtoRightSkewedTree {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewed(Node root, int order) {
		if (root == null) {
			return;
		}
		if (order > 0) {
			BSTToSkewed(root.right, order);
		} else {
			BSTToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		if (order > 0) {
			BSTToSkewed(leftNode, order);
		} else {
			BSTToSkewed(rightNode, order);
		}
	}

	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String[] args) {
		BSTtoRightSkewedTree.node = new Node(50);
		BSTtoRightSkewedTree.node.left = new Node(30);
		BSTtoRightSkewedTree.node.right = new Node(60);
		BSTtoRightSkewedTree.node.left.left = new Node(10);
		BSTtoRightSkewedTree.node.right.left= new Node(55);
		int order = 0;
		BSTToSkewed(node, order);
		traverseRightSkewed(headNode);
	}
}
