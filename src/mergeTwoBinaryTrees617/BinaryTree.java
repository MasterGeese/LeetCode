package mergeTwoBinaryTrees617;

import java.util.Scanner;

public class BinaryTree {

	/*
	 * Specification:
	 * 
	 * BinaryTree: a data structure of the following type: Fields root: integer
	 * containing value at the root of the binary tree. left: Binary tree
	 * containing all values to the left of the root. right: Binary tree
	 * containing all values to the right of the root.
	 * 
	 * Methods: <none>
	 * 
	 * constructSubtree(BinaryTree b1, BinaryTree b2): if (b1.root == null &&
	 * b2.root == null) break; else if (b1.root == null && b2.root != null)
	 * b3.root = b2.root else if (b2.root == null && b1.root != null) b3.root =
	 * b1.root else if (b2.root != null && b1.root != null) b3.root = b1.root +
	 * b2.root left = constructSubtree(b1.left, b2.left) right =
	 * constructSubtree(b1.right, b2.right)
	 * 
	 * Each binary tree can be described by a root node, a left subtree, and a
	 * right subtree. The "position" of each node in the tree can be described
	 * by its path from the root,
	 */

	private int root;
	private BinaryTree left;
	private BinaryTree right;

	public static void main(String[] args) {

		Scanner reader1 = new Scanner(args[0]);
		BinaryTree b1 = parseBinaryTree(reader1);
		Scanner reader2 = new Scanner(args[1]);
		BinaryTree b2 = parseBinaryTree(reader2);

		// scan the args and parse the subtrees.
		constructSubtree();
	}

	/**
	 * Assumes prefix notation
	 * 
	 * @param reader
	 * @return
	 */
	public static BinaryTree parseBinaryTree(Scanner reader) {

		BinaryTree newTree = new BinaryTree();
		newTree.setRoot(reader.nextInt());
		newTree.setLeft(parseBinaryTree(reader));
		newTree.setRight(parseBinaryTree(reader));
		return 
			
		
		
	}

	public static BinaryTree constructSubtree() {

	}

	public int getRoot() {
		return root;
	}

	public void setRoot(int root) {
		this.root = root;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
