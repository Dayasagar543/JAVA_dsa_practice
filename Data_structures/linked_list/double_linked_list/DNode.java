package JAVA_dsa_practice.Data_structures.linked_list.double_linked_list;

public class DNode {
    private DNode previous;
    private int data=0;
    private DNode next;

    
    public DNode getPrevious() {
        return previous;
    }
    public void setPrevious(DNode previous) {
        this.previous = previous;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public DNode getNext() {
        return next;
    }
    public void setNext(DNode next) {
        this.next = next;
    }

}
