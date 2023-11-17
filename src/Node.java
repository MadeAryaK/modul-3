public class Node {
    String nama;
    int stok,harga;
    Node prev,next;

    public Node(String nama, int stok, int harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        Node prev = null;
        Node next = null;
    }
}
