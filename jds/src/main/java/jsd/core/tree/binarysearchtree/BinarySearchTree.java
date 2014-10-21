package jsd.core.tree.binarysearchtree;

import jsd.core.tree.ITree;
import jsd.core.tree.ITreeNode;
import jsd.core.tree.ITreeTraverser;
import jsd.core.tree.TreeNode;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {

    private ITreeNode<T> rootNode = null;

    /** {@inheritDoc} */
    @Override
    public ITreeNode<T> getRootNode() {
        return rootNode;
    }

    /** {@inheritDoc} */
    @Override
    public void addElement(T element) {
        ITreeNode<T> newNode = new TreeNode<T>();
        newNode.setValue(element);
        addElementToTree(newNode, rootNode);
    }

    /**
     * Adds the element to tree.
     * @param node the node
     * @param subTreeRoot the sub tree root
     */
    private void addElementToTree(ITreeNode<T> node, ITreeNode<T> subTreeRoot) {
        if (rootNode == null) {
            rootNode = node;
            return;
        } else {
            if (node.getValue().compareTo(subTreeRoot.getValue()) == 1) {
                if (subTreeRoot.getRight() == null) {
                    subTreeRoot.setRight(node);
                    return;
                }
                addElementToTree(node, subTreeRoot.getRight());
            } else if (node.getValue().compareTo(subTreeRoot.getValue()) == -1) {
                if (subTreeRoot.getLeft() == null) {
                    subTreeRoot.setLeft(node);
                    return;
                }
                addElementToTree(node, subTreeRoot.getLeft());
            }
        }
    }

    /**
     * {@inheritDoc} Using the visitor pattern here . The {@link ITreeTraverser} is a visitor and {@link ITree} is the
     * visitable object.
     */
    @Override
    public void traverseTree(ITreeTraverser<T> treeTraverser) {
        treeTraverser.traverse(rootNode);
    }
}
