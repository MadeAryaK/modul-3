public class list {
    // merupakan deklarasi class list
    // yang berdifat publik atau dapat
    // diakses di semua file
    list curr;
    // membuat variabel curr
    // yang berfungsi sebagai tempat untuk menyimpan nilai saat ini
    Node head;
    // membuat variabel head
    // berfungsi untuk menyimpan data pertama dalam list
    Node tail;
    // membuat variabel tail
    // berfungsi untuk menyimpan data terakhir dalam list

    public void addlast (String nama, int stok, int harga){
    // dekllarasi method addlast yang menerima parameter berupa nama, stok, dan harga
    // berfungsi untuk memasukan data ke pada akhir list
        Node baru = new Node(nama, stok, harga);
        // membuat objek baru 
        // yang berfungsi untuk membuat elemen baru dalam list
        if(head == null){
        // jika list masih kosong, maka
            head = tail = baru;
            // head dan tail bernilai sama yaitu baru
            head.prev = null;
            // mengisi nilai sebelum head adalah kosong
            // dikarenakan baru merupakan data satu satu nya didalam list
            tail.prev = null;
            // mengisi nilai setelah tail adalah kosong
            // dikarenakan baru merupakan satu satu nya data dalam list
        }else{
        // jika liat tidak kosong atau list sudah terisi, maka
            tail.next = baru;
            // baru ditempatkan setelah tail 
            baru.prev = tail;
            // memberikan pointer baru.prev kepada tail 
            tail = baru;
            // memindahkan tail ke data yang paling akhir
            tail.next = null;
            // data setalah tail adalah kosong
            // dikarenakan tail merupakan data terakhir dalam list
        }
    }

    public void display(){
    // deklarasi method display 
    // yang berfungsi untuk menampilkan setiap elemen dalam list
        Node curr = head;
        // menjadikan variabel curr menjadi elemen pertama dalam list
        while(curr != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            System.out.println("id = " + curr);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menampilkan pesan "id" dan curr 
            // yang dimana curr adalah alamat Node saat ini
            System.out.println("nama = " + curr.nama);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menapilkan pesan "nama" yang diikuti dengan nilai nama pada Node saat ini
            System.out.println("stok = " + curr.stok);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menampilkan pesan "stok" yang diikuti  dengan nilai stok padda Node saat ini
            System.out.println();
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
            curr = curr.next;
            // menjadikan curr.next menjadi curr
            // yang berfungsi agar while terus berjalan
        }
    }

    public void bubblesort(){
    // deklarasi method bubblesort
    // yang berfungsi untuk sorting data dari stok yang terkecil hingga yang terbesar
        Node tempA,tempB,tempC;
        // membuat variabel tempA, tempB, dan tempC
        // yang berfungsi menajdi tempat sementara untuk nilai pada saat sorting dilakukan 
        boolean swapped;
        // Deklarasi variabel swapped untuk menentukan apakah ada pertukaran elemen dalam proses sorting
        do{
        // merupakan perulangan do-while
            swapped = false;
            // Set swapped menjadi false pada awal setiap iterasi
            Node curr = head;
            // menjadikan variabel curr menjadi elemen pertama dalam list
            while (curr != null && curr.next != null){
            // melakukan perulangan selama curr tidak kosong
            // dan data setelah cur tidak kosong
            if(curr.stok > curr.next.stok){
            // jika stok pada data saat ini lebih besar dari stok pada data selanjutnya
            // maka,
                tempA = curr.prev;
                // Menyimpan referensi ke elemen sebelum elemen saat ini (curr)
                tempB = curr;
                // Menyimpan referensi ke elemen saat ini (curr).
                tempC = curr.next;
                // Menyimpan referensi ke elemen setelah elemen saat ini (curr).
                if(tempA != null){
                // jika tempA tidak kosong, maka
                    tempA.next = tempC;
                    // mengganti referensi next dari elemen sebelumnya (tempA) menjadi elemen setelahnya (tempC)
                }else{
                // jika kosong, maka
                    head = tempC;
                    // mengupdate head menjadi tempC.
                }
                tempC.prev = tempA;
                // Mengganti referensi prev dari elemen setelahnya (tempC) menjadi elemen sebelumnya (tempA).
                tempB.next = tempC.next;
                // Mengganti referensi prev dari elemen setelahnya (tempC) menjadi elemen sebelumnya (tempA).
                if(tempC.next != null){
                // jika elemen setelah tempC tidak kosong, maka
                    tempC.next.prev = tempB;
                    // Mengganti referensi prev dari elemen setelahnya (tempC) menjadi elemen sebelumnya (tempA).
                }
                tempC.next = tempB;
                // Mengganti referensi next dari elemen setelahnya (tempC) menjadi elemen saat ini (tempB).
                tempB.prev = tempC;
                // Mengganti referensi next dari elemen setelahnya (tempC) menjadi elemen saat ini (tempB).
                swapped = true;
                // Menandakan bahwa ada pertukaran elemen yang terjadi.
            }
            curr = curr.next;
            // menjadikan curr.next menjadi curr
            // yang berfungsi agar while terus berjalan
            }
        }while(swapped);
        // perulangan while
        // yang akan terus berlanjut hingga tidak ada lagi pertukaran elemen yang terjadi
        // menandakan bahwa data sudah terurut.
    }

    public void linearsearch(int cari){
    // deklarasi method linearsearch
    // yang berfungsi untuk mencari data sesuai dengan parameter secara linear
        Node curr = head;
        // menjadikan variabel curr menjadi elemen pertama dalam list
        int hitung = 0;
        // membuat variabel hitung
        // yang berfungsi untuk menyimpan hitung
        // yaitu hitung berapa kali perulangan dilakukan hingga mendapatkan data yang sesuai
        while(curr != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            hitung += 1;
            // menambah 1 nilai pada niali variabel hitung
            if(curr.stok == cari){
                System.out.println("Stock yang ingin dicari = " + cari);
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // akan menampilkan pesan "Stock yang ingin dicari = " dan dilanjutkan dengan nilai dari variabel cari
                System.out.println("senjata dengan stok " + cari + " ditemukan pada posisi ke - " + hitung);
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // akan menampikan senjata dengan stok yang dicari dan ditemukan pada posisi ditemukan
                System.out.println("nama = " + curr.nama);
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // akan menapilkan pesan "nama" yang diikuti dengan nilai nama pada Node saat ini
                System.out.println("stok = " + curr.stok);
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // akan menampilkan pesan "stok" yang diikuti dengan nilai stok padda Node saat ini
                System.out.println("harga = " + curr.harga);
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // akan menampilkan pesan "harga = " yang diikuti dengan nilai harga pada Node saat ini
                System.out.println();
                // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
                // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
            }
            curr = curr.next;
            // menjadikan curr.next menjadi curr
            // yang berfungsi agar while terus berjalan
        }
    }

    public void selectionsort(){
    // deklarasi method selectionsort
    // berfungsi untuk mengurutkan data dari stok terbanyak hingga terdikit
        Node current = head;
        // menjadikan variabel curr menjadi elemen pertama dalam list
        while(current != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            Node max = findmax(current); 
            // Menemukan elemen dengan nilai stok terbesar dari current hingga akhir list
            swap(current, max);
            // Menukar posisi elemen current dengan elemen max
            current = max.next;
            // Memindahkan current ke elemen berikutnya setelah max
        }
    }

    private Node findmax(Node awal){
    // deklarasi Metode findmax 
    // yang berfungsi untuk mencari elemen dengan nilai stok terbesar dari suatu elemen hingga akhir list
        Node max = awal;
        // Inisialisasi max sebagai elemen awal
        Node current = awal.next;
        // Menjadikan current sebagai elemen setelah awal
        while( current != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            if(current.stok > max.stok){
            // jika stok pada data saat ini lebih besar dari sstok pada data selanjutnya, maka
                max = current;
                // Mengganti nilai max menjadi current
            }
            current = current.next;
            // menjadikan curr.next menjadi curr
            // yang berfungsi agar while terus berjalan
        }
        return max;
        // Mengembalikan elemen dengan nilai stok terbesar
    }

    private void swap (Node nodeA, Node nodeB){
    // deklarasi Metode swap 
    // yang berfungsi untuk menukar posisi dua elemen dalam list
        if(nodeA != nodeB){
        // jika Node A tidak sama dengan NodeB, maka
            Node tempPreva = nodeA.prev;
            // Menyimpan referensi ke elemen sebelum nodeA
            Node tempNexta = nodeA.next;
            // Menyimpan referensi ke elemen setelah nodeA
            Node tempPrevb = nodeB.prev;
            // Menyimpan referensi ke elemen sebelum nodeB
            Node tempNextb = nodeB.next;
            // Menyimpan referensi ke elemen setelah nodeB
            if(tempPreva != null){
            // jika tempPrevva tidak kosng, maka
                tempPreva.next = nodeB;
                // Mengganti referensi next dari elemen sebelum nodeA menjadi nodeB
            }else{
            // jika kosong, maka
                head = nodeB;
                // mengupdate head menjadi nodeB
            }
            if(tempPrevb != null){
            // jika temPrevB tidak kosong, maka
                tempPrevb.next = nodeA;
                // Mengganti referensi next dari elemen sebelum nodeB menjadi nodeA
            }else{
            // jika kosong, maka
                head = nodeA;
                // mengupdate head menjadi nodeA
            }
            nodeA.prev = tempPrevb;
            // Mengganti referensi prev dari nodeA 
            // menjadi elemen sebelum nodeB
            nodeA.next = tempNextb;
            // Mengganti referensi next dari nodeA 
            // menjadi elemen setelah nodeB
            nodeB.prev = tempPreva;
            // Mengganti referensi prev dari nodeB 
            // menjadi elemen sebelum nodeA
            nodeB.next = tempNexta;
            // Mengganti referensi prev dari nodeB 
            // menjadi elemen sebelum nodeA
            if(tempNexta != null){
            // jikka tempNexta tidak kosong, maka
                tempNexta.prev = nodeB;
                // mengganti referensi prev dari elemen setelah nodeA menjadi nodeB
            }
            if(tempNextb != null){
            // jika tempNextb tidak kosong, maka
                tempNextb.prev = nodeA;
                // akan mengganti referensi prev dari elemen setelah nodeB menjadi nodeA
            }
        }
    }

    public void insertionSort(){
    // deklarasi method insertionsort
    // yang berfungsi untuk mengurutkan data dari harga terbesar hingga terkeciil
        Node sorted = null;
        // membuat variabel baru yang bernama sorted yang bernilai null atau kosong
        // berfungsi untuk menjadi list hasil pengurutan
        Node curr = head;
        // menjadikan variabel curr menjadi elemen pertama dalam list
        while(curr != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            Node next = curr.next;
            // Menyimpan referensi ke elemen berikutnya dari curr untuk melanjutkan iterasi
            if(sorted == null || sorted.harga <= curr.harga){
            // Jika sorted kosong atau harga pada sorted lebih kecil dari harga pada data saat ini, maka
                curr.next = sorted;
                // Mengganti referensi next dari elemen saat ini  menjadi sorted
                curr.prev = null;
                // Mengganti referensi prev dari elemen saat ini menjadi null 
                // karena elemen saat ini menjadi elemen pertama di list hasil pengurutan
                if (sorted != null){
                // jika sorted tidak kosong, maka
                    sorted.prev = curr;
                    // mengganti referensi prev dari list hasil pengurutan menjadi elemen saat ini (curr)
                }
                sorted = curr;
                // Mengupdate list hasil pengurutan menjadi data saat ini
            }else{
            //Jika harga pada sorted lebih besar dari harga pada data saat in
                Node temp = sorted;
                // Inisialisasi variabel temp sebagai sorted
                while (temp.next != null && temp.next.harga > curr.harga){
                // melakukan perulangan selama temp.next tidak kosong dan harga pada data selanjutnya lebih besar dari harga pada saat ini
                    temp = temp.next;
                    // Memindahkan temp ke elemen berikutnya di list hasil pengurutan
                }
                curr.next = temp.next;
                // Mengganti referensi next dari data saat ini menjadi elemen berikutnya di list hasil pengurutan (temp.next)
                if(temp.next != null){
                // jika elemen berikutnya di list hasil pengurutan tidak kosong, maka
                    temp.next.prev = curr;
                    // mengganti referensi prev dari elemen berikutnya menjadi elemen saat ini (curr)
                }
                temp.next = curr;
                // Mengganti referensi next dari elemen berikutnya di list hasil pengurutan menjadi elemen saat ini (curr)
                curr.prev = temp;
                // Mengganti referensi prev dari elemen saat ini (curr) 
                // menjadi elemen sebelumnya di list hasil pengurutan (temp)
            }
            curr = next;
            // Memindahkan curr ke elemen berikutnya untuk melanjutkan perulangan
        }
        head = sorted;
        // Mengganti head dari list dengan list hasil pengurutan
    }

    public void display2(){
    // deklarasi method display 
    // yang berfungsi untuk menampilkan setiap elemen dalam list
        Node curr = head;
        // menjadikan variabel curr menjadi elemen pertama dalam list
        while(curr != null){
        // melakuakan perulangan while 
        // yang akan terus berjalan selama curr tidak kosong
            System.out.println("id = " + curr);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menampilkan pesan "id" dan curr 
            // yang dimana curr adalah alamat Node saat ini
            System.out.println("nama = " + curr.nama);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menapilkan pesan "nama" yang diikuti dengan nilai nama pada Node saat ini
            System.out.println("harga = " + curr.harga);
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // akan menampilkan pesan "harga = " yang diikuti dengan nilai harga pada Node saat ini
            System.out.println();
            // merupakan fungsi sout yang berfungsi menampilkan data yang ada di dalam parameter nya
            // nilai parameter kosong karena hanya berfungsi mencetak ruang kosong agar data terlihat rapi 
            curr = curr.next;
            // menjadikan curr.next menjadi curr
            // yang berfungsi agar while terus berjalan
        }
    }
}

    
