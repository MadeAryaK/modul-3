public class Node {
//class Node adalah objek yang berfungsi
//mengirimkan data dan informasi dengan memanfaatkan 
//media titik-titik yang terhubung dalam satuserupa objek 
    String nama;
    // Tipe data string adalah tipe data
    // yang digunakan untuk menyimpan barisan karakter
    // dengan nama variabel nama
    int stok,harga;
    // salah satu jenis tipe data primitif yang secara standar sudah terdefinisi
    // pada suatu bahasa pemrograman.
    // Biasanya, tipe data tersebut sering dinamakan tipe data dasar.
    // int pada umumnya berupa angka
    Node prev,next;
    // ADT Node adalah objek yang berfungsi
    // mengirimkan data dan informasi dengan memanfaatkan
    // media titik-titik yang terhubung dalam satu objek serupa
    public Node(String nama, int stok, int harga){
    // method spesial yang berfungsi untuk inisialisasi ketika pembuatan obyek.
    // Konstruktor dipanggil segera setelah obyek baru dibuat.
    // Ciri dari konstruktor adalah nama method sama persis dengan nama kelasnya.
        this.nama = nama;
        // this digunakan sebagai referensi dari class itu sendiri.
        // dan referensinya saat ini adalah nama
        // sehingga ini mengisi dirinya sendiri
        this.stok = stok;
        // this digunakan sebagai referensi dari class itu sendiri.
        // dan referensinya saat ini adalah stok
        // sehingga ini mengisi dirinya sendiri
        this.harga = harga;
        // this digunakan sebagai referensi dari class itu sendiri.
        // dan referensinya saat ini adalah harga
        // sehingga ini mengisi dirinya sendiri
        Node prev = null;
        // Menginisialisasi atribut prev dengan null pada awalnya
        // digunakan agar data sebelumnya kosong
        Node next = null;
        // Menginisialisasi atribut next dengan null pada awalnya
        // digunakan agar data selanjut kosong
    }
}
