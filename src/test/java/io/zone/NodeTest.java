package io.zone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author p091569 on 21/03/2019
 * @project KataSearchInBinaryTree
 */
class NodeTest {

    @Test
    void should_find_element_in_small_tree() {
        Node zero =large().find(0);
        assertNotNull(zero);
        assertEquals(zero.value, 0);
    }

    @Test
    void should_find_element_in_large_tree() {
        Node eleven = small().find(11);
        assertNotNull(eleven);
        assertEquals(eleven.value, 11);
    }


    private Node large() {
        Node root = new Node();
        Node current = root;
        for(int i = -100_000; i < 0; i++) {
            current.value = i;
            current.right = new Node();
            current = current.right;
        }
        return root;
    }

    private Node small() {
        Node root = new Node(8);
        root.left = new Node(7);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        return root;
    }



}