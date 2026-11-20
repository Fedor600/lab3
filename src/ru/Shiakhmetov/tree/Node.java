

public class Node {
    int data;
    Node parent;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
