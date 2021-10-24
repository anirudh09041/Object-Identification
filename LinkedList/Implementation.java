package LinkedList;

public class Implementation {
    Node head = null;

    public void insertList(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if (head == null) {
            head = n;

        } else {
            Node temp = head;
            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public void display()
    {
        Node ptr=head;
        while(ptr.next!=null)
        {
            System.out.print(ptr.data +"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }

}
