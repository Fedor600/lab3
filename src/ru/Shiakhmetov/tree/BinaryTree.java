package ru.Shiakhmetov.tree;

public class BinaryTree {
    
    private Node root;

    private Node nextNode(Node node, int value){
        if (node == null){
            return node;
        }

        Node temp = node;

        if (temp.data <= value){
            temp = temp.right;
        }
        else{
            temp = temp.left;
        }

        return temp;
    }
    private Node searchNode(int value){
        Node temp = root;
        while (temp != null){
            if (temp.data == value){
                return temp;
            }
            temp = nextNode(temp, value);
        }
        return null;
    }

    public boolean isContains(int value){
        return searchNode(value) != null;
    }

    public void addNode(int value){
        if (root == null){
            root = new Node(value);
            return;
        }

        Node temp = root;

        boolean flag = true;
        while(flag){
            Node next = nextNode(temp, value);
            if (next == null){
                Node newNode = new Node(value);
                newNode.parent = temp;
                if (value > temp.data){
                    temp.right = newNode;
                }
                else{
                    temp.left = newNode;
                }
                flag = false;
            }
            temp = next;
        }
    }

    private void replaceNode(Node oldNode, Node newNode){
        if (oldNode.parent == null){
            root = newNode;
        }
        else if (oldNode.parent.left == oldNode){
            oldNode.parent.left = newNode;
        }
        else{
            oldNode.parent.right = newNode;
        }
        if (newNode != null){
            newNode.parent = oldNode.parent;
        }
    }
    public void removeValue(int value){
        Node node = searchNode(value);
        if (node == null){
            System.out.println("Такого значения нет!");
            return;
        }

        if (node.left == null){
            replaceNode(node, node.right);
        }
        else if (node.right == null){
            replaceNode(node, node.left);
        }
        else{
            Node replacement = node.left;
            while(replacement.right != null){
                replacement = replacement.right;
            }
            node.data = replacement.data;
            replaceNode(replacement, replacement.left);
        }
    }

     private void round(Node node, StringBuilder result) {
        if (node == null) {
            return;
        }
        if (result.length() > 0) {
            result.append(" ");
        }
        result.append(node.data);
        round(node.left, result);
        round(node.right, result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        round(root, result);
        return result.toString();
    }
}
