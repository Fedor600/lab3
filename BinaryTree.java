public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    private Node nextNode(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value > node.data) {
            return node.right;
        } else {
            return node.left;
        }
    }

    private Node searchNode(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = nextNode(temp, value);
        }
        return null;
    }

    public boolean contains(int value) {
        return searchNode(value) != null;
    }

    public void AddNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;
        while (true) {
            Node next = nextNode(temp, value);
            if (next == null) {
                newNode.parent = temp;
                if (value > temp.data) {
                    temp.right = newNode;
                } else {
                    temp.left = newNode;
                }
                return;
            }
            temp = next;
        }
    }

    public void removeValue(int value) {
        Node removeNode = searchNode(value);
        if (removeNode == null) {
            System.out.println("Такого значения нет!");
            return;
        }

        if (removeNode.left != null && removeNode.right != null) {
            Node replaceNode = removeNode.left;
            while (replaceNode.right != null) {
                replaceNode = replaceNode.right;
            }
            removeNode.data = replaceNode.data;
            removeNode = replaceNode;
        }

        Node child;
        if (removeNode.left != null) {
            child = removeNode.left;
        } else {
            child = removeNode.right;
        }

        if (child != null) {
            child.parent = removeNode.parent;
        }

        if (removeNode.parent == null) {
            root = child;
        } else if (removeNode.parent.left == removeNode) {
            removeNode.parent.left = child;
        } else {
            removeNode.parent.right = child;
        }
    }

    private void traverse(Node node, StringBuilder result) {
        if (node == null) {
            return;
        }
        if (result.length() > 0) {
            result.append(" ");
        }
        result.append(node.data);
        traverse(node.left, result);
        traverse(node.right, result);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        traverse(root, result);
        return result.toString();
    }
}
