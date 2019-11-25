package annotation;

public class NodeRevert {
    public static void main(String[] args) {

    }

    public static void revert(Node node) {
        Node revert = node;
        Node mNode = node;
        Node next = node.next;
        while (next != null) {
            revert.next = next;
            next = next.next;
        }
    }

    public class Node {
        Node next;
    }
}
