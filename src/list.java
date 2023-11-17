public class list {
    list curr;
    Node head;
    Node tail;
    Node temp;

    public void addlast (String nama, int stok, int harga){
        Node baru = new Node(nama, stok, harga);

        if(head == null){
            head = tail = baru;
            head.prev = null;
            tail.prev = null;
        }else{
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
            tail.next = null;
        }
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.println("id = " + curr);
            System.out.println("nama = " + curr.nama);
            System.out.println("stok = " + curr.stok);
            System.out.println();
            curr = curr.next;
        }
    }

    public void bubblesort(){
        Node curr = head;
        while (curr != null){
            if(curr.next != null && curr.stok > curr.next.stok){
                temp = curr.next;
                curr.next = temp.next;
                temp.next = curr;
                curr = temp;
                curr.prev = curr.prev.prev;
            }
            curr = curr.next;
        }
    }
}
