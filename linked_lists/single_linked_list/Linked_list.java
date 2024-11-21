public class Linked_list {
    private Node Head;

    // methods to add data into linked list
    public void insert(int input) {
        Node node = new Node();
        node.setData(input);
        if (Head == null) {
            Head = node;
        } else {
            // for understanding purpose explantion here
            // the below node is a temporary node to travel between the nodes of the linked
            // list and we are assiging it with head cause its the first node of the linked
            // list and n is the object reference of class Node which traverses between the
            // nodes which are creaed .
            Node n = Head;// temporary node
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }

    }

    public void show() {
        Node n = Head;
        while (n != null) {
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

    public void InsertAtStart(int input) {
        Node n = new Node();
        n.setData(input);
        n.setNext(Head);
        Head = n;
    }

    public void insetAt(int index, int input) {
        Node node = new Node();
        node.setData(input);
        Node n = Head;

        if (index == 0) {
            InsertAtStart(input);
        } else {

            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public void Delete(int index) {
        if (index == 0) {
            Head.setNext(Head);
        } else {

            Node n = Head;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
        }

    }
}
