package io.zone;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        Node root = new Node();
        Node current = root;
        for(int i = -100_000; i < 0; i++) {
            current.value = i;
            current.right = new Node();
            current = current.right;
        }

        System.out.println("Node that contains 0 is : " + root.find(0));

    }
}
