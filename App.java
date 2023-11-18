public class App {
    // merupakan fungsi main 
    // dimana berfungsi untuk menjalankan 
    // code yang telah di buat
    public static void main(String[] args) throws Exception {
        // syntax umum untuk clas main
        // biasa disebut psvm
        System.out.println("==== ITEM FIGHTER ====");
        // berfungsi untuk menampilkan pesan "==== ITEM FIGHTER ===="
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        list baru = new list();
        // membuat list baru pada list
        baru.addlast("Demon Hunter Sword", 8, 2180);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Sea Halberd", 6, 1950);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Mafelic Roar", 3,2060);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("haas's Claw", 19, 1810);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Berseker's Furry", 3, 2350);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Endless Battle", 4, 2470);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Windtalker", 12, 1870);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Scarlet Phantom", 16, 2020);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Blade of Despair", 23, 3010);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Hunter Strike", 15, 2010);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Bloodlust Axe", 9, 1970);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Rose Gold Meteor", 17, 2270);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Golden Staff", 27, 2100);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.addlast("Wind of Nature", 25, 1910);
        // memasukan data baru kedalam list baru dengan memanggil method addlast
        baru.display();
        // menampilkan seluruh isi dari list baru
        // dengan cara memanggil method display
        baru.linearsearch(17);
        // mencari data dengan stok = 17
        // dengan cara memanggil method linearsearch
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        System.out.println("setelah diurutkan sesuai stok yang paling sedikit");
        // berfungsi untuk menampilkan pesan "setelah diurutkan sesuai stok yang paling sedikit"
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        baru.bubblesort();
        // mengurutkan data dalam list baru
        // dengan cara memanggil method bubblesort
        // yang akan mengurutkan data dari data yang memiliki stok paling sedikit hingga yang terbanyak
        baru.display();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        System.out.println("==== ITEM MAGE ==== ");
        //berfungsi untuk menampilkan pesan "==== ITEM MAGE ==== "
        list mage = new list();
        // membuat list baru yang bernama mage dalam list
        mage.addlast("Enchanted Talisman", 9, 1870);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Divine Glaive", 11, 1970);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Winter Truncheon", 14, 1910);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Feather of Heaven", 1, 2030);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Holy Crystal", 0, 2180);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Genius Wand", 6, 2000);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Necklace of Durance", 10, 2110);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Concentrated Energy", 12, 2020);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Ice Queen Wand", 18, 2240);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Glowing Wand", 16, 2120);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Calamity Reaper", 15, 1950);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Clock of Destiny", 19, 1950);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Blood Wings", 20, 3000);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Fleeting Time", 21, 2050);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.addlast("Lightning Truncheon", 17, 2250);
        // memasukan data baru kedalam list mage dengan memanggil method addlast
        mage.display();
        // menampilkan seluruh isi list mage
        // dengan cara memanggil method display
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        System.out.println("setelah diurutkan sesuai stok yang paling banyak");
        // berfungsi untuk menampilkan pesan "setelah diurutkan sesuai stok yang paling banyak"
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        mage.selectionsort();
        // mengurutkan data dalam list mage dari yang memiliki stok paling banyak ke yang paling sedikit
        // dengan cara memanggil method selectionsort
        mage.display(); 
        // menampilkan seluruh isi list mage
        // dengan cara memanggil method display
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        System.out.println("mengurutkan sesuai harga paling mahal");
        // berfungsi untuk menampilkan pesan "mengurutkan sesuai harga paling mahal"
        System.out.println();
        // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
        // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
        mage.insertionSort();
        // mengurutkan data yang ada didalam list mage berdasarkan harga yang paling mahal
        // dengan cara memanggil fungsi insertionsort
        mage.display2();
        // menampilkan isi dari seluruh list mage
        // dengan cara memanggil method dispaly2
    }
}
