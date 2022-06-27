package trees;

import java.util.List;

public class ConsTree<T> extends BinaryTree<T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public ConsTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
		this.data = data;
		this.leftChild = left;
		this.rightChild = right;
	}

	public ConsTree(T data) {
		this(data, new EmptyTree<T>(), new EmptyTree<T>());
	}
	
    @Override
    public T data() {
        return this.data;
    }

    @Override
    public BinaryTree<T> leftChild() {
        return this.leftChild;
    }

    @Override
    public BinaryTree<T> rightChild() {
        return this.rightChild;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int height() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int diameter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int nodeCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int leafCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int levelCount(int level) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public BinaryTree<T> mirrorImage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTree<T> pare() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BinaryTree<T> cutLeaves() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int weightBalanceFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void preOrderElements(List<T> list) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postOrderElements(List<T> list) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void inOrderElements(List<T> list) {
        // TODO Auto-generated method stub
        
    }
}
