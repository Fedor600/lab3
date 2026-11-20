package lab3;

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

    private Node searchPrevNode(Node node, int value){
        if (node == null){
            return null;
        }

        Node temp = root;
        while(temp != null || (temp.left.data != value) || temp.right.data != value){
            temp = nextNode(temp, value);
        }

        return temp;
    }

    public void AddNode(int value){
        if (root == null){
            root.data = value;
        }

        Node temp = root;
        while(temp != null){
            temp = nextNode(temp, value);
        }

        Node newNode = new Node(value);
        temp = newNode;
    }

    public void removeValue(int value){
        if (root == null){
            System.out.println("Такого значения нет!");
        }

        Node temp = root;

        Node prevRemoveNode = searchPrevNode(temp, value);

        if (prevRemoveNode == null){
            System.out.println("Такого значения нет!");
            return;
        }

        Node removeNode = nextNode(prevRemoveNode, value);

        temp = removeNode.left;

        while(temp.right.right != null){
            temp = temp.right;
        }

        Node replaceNode = temp.right;

        temp.right = replaceNode.left;
        
        replaceNode.left = removeNode.left;
        
        replaceNode.right = removeNode.right;

        if (prevRemoveNode.right == removeNode){
            prevRemoveNode.right = replaceNode;
        }
        else{
            prevRemoveNode.left = replaceNode;
        }
    }

    


}
