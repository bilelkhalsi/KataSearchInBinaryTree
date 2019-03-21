package io.zone;

/**
 * @author p091569 on 21/03/2019
 * @project KataSearchInBinaryTree
 */
public class Node {

    int value;
    Node left, right;


    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node find(int v) {
        Node current = this;
        while (true) {
            if (v == current.value) {
                return current;
            }
            if (v > current.value && null != current.right) {
                current = current.right;
            } else if (v < current.value && null != current.left) {
                current = current.left;
            } else {
                return null;
            }
        }
    }
}
