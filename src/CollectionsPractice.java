import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arraytetap = new int[3];
        arraytetap[0] = 10;
        arraytetap[1] = 20;
        arraytetap[2] = 30;

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrayDinamis = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        arrayDinamis.add(10);
        arrayDinamis.add(20);
        arrayDinamis.add(30);
        arrayDinamis.add(40);
        arrayDinamis.add(50);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran array: " + arraytetap.length);
        System.out.println("Ukuran Arraylist: " + arrayDinamis);
        //array mempunyai ukuran yang tetap yaitu 3, berarti tidak bisa ditambahkan lagi
        //arraylist dinamis berbeda dimana dia bsa menampung lebih banyak elemen

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        @SuppressWarnings("rawtype")
        ArrayList rawlist = new ArrayList();
        rawlist.add("String");
        rawlist.add(321);
        rawlist.add(46.57);
        System.out.println("Raw list: " + rawlist);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("benhz");
        stringList.add("king");
        stringList.add("josef");
        System.out.println("String List: " + stringList);

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.41);
        doubleList.add(3.74);
        doubleList.add(5.41);
        System.out.println("Double List: " + doubleList);


        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        dataMahasiswa.add("Benhz");
        dataMahasiswa.add("josef");
        dataMahasiswa.add("royen");
        dataMahasiswa.add("piter");
        dataMahasiswa.add("saroha");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        dataMahasiswa.add(3, "Benhz");

        // - Print daftar mahasiswa
        printArrayList(dataMahasiswa, "daftar mahasiswa");

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        String namaPertama = dataMahasiswa.get(0);

        // - Baca mahasiswa terakhir
        String namaterakhir = dataMahasiswa.get(dataMahasiswa.size() - 1);

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        boolean adamahasiswa = dataMahasiswa.contains("josef");


        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        int indexmahasiswa = dataMahasiswa.indexOf("king");
        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Mahasiswa pertama: " + namaPertama);
        System.out.println("Mahasiswa terakir: " + namaterakhir);
        System.out.println("ada mahasiswa? " + adamahasiswa);
        System.out.println("index mahasiswa: " + indexmahasiswa);

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        dataMahasiswa.set(3, "king");


        // - Print daftar setelah update
        System.out.println("setelah update: " + dataMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        dataMahasiswa.remove(3);
        System.out.println("hapus index 3: " + dataMahasiswa);


        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        dataMahasiswa.remove("saroha");
        System.out.println("Hapus saroha: " + dataMahasiswa);

        // - Hapus semua mahasiswa menggunakan clear()
        dataMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Kosong? " + dataMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        // - Iterasi menggunakan traditional for loop
        System.out.println("Tradiotional for loop: ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println("Index " + i + ": " + angka.get(i));
        }

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.println("\nFor-each loop: ");
        for (Integer nilai : angka) {
            System.out.println(nilai);
        }


        // - Iterasi menggunakan while loop
        System.out.println("\nWhile loop");
        int i = 0;
        while (i < angka.size()) {
            System.out.println(angka.get(i));
            i++;
        }

        // - Iterasi menggunakan Iterator

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        AtomicReference<ArrayList<String[]>> data = new AtomicReference<>(new ArrayList<>());


        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        data.get().add(new String[]{"Benhz", "2481014", "teknik informatika"});
        data.get().add(new String[]{"Josef", "2481041", "teknik informatika"});
        data.get().add(new String[]{"billy", "2481011", "teknik informatika"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("Nama\tNIM\tJurusan");
        for (String[] mhs : data.get()) {
            System.out.println(mhs[0] + "\t" + mhs[1] + "\t" + mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);
        System.out.println("List angka: " + numbers);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("Angka setelah sort: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("Angka setelah reverse: ");

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("Angka setelah shuffle: ");

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        System.out.println("Nilai Maksimal: " + Collections.max(numbers));
        System.out.println("Nilai Minimal: " + Collections.min(numbers));


        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        numbers.add(20);
        System.out.println("Frequency 20: " + Collections.frequency(numbers, 20));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Pisang");
        buah.add("Anggur");

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("Setelah sort: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        int index = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search 'Mangga': " + index);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        ArrayList<String> buahUnsorted = new ArrayList<>();
        buahUnsorted.add("Pisang");
        buahUnsorted.add("Apel");
        buahUnsorted.add("Jeruk");
        int linearIdx = linearSearch(buahUnsorted, "Apel");
        System.out.println("Linear search 'Apel': " + linearIdx);


        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        ArrayList<Integer> row1 = new ArrayList<>();
        Collections.addAll(row1, 1, 2, 3);
        ArrayList<Integer> row2 = new ArrayList<>();
        Collections.addAll(row2, 4, 5);
        ArrayList<Integer> row3 = new ArrayList<>();
        Collections.addAll(row3, 6, 7, 8, 9);

        matrix2D.add(row1);
        matrix2D.add(row2);
        matrix2D.add(row3);

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix
        System.out.println("Matriks 2D Dinamis (Jagged Array):");
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"10 Dosa besar Soeharto", "Benhz", "2025", "tersedia"});
        daftarBuku.add(new String[]{"cara menjadi kaya", "Josef", "2021", "tersedia"});
        daftarBuku.add(new String[]{"menjadi lebih baik", "Royen", "2025", "dipinjam"});
        daftarBuku.add(new String[]{"hidup sehat", "king", "2022", "tersedia"});
        daftarBuku.add(new String[]{"hidup hemat", "saroha", "2020", "tersedia"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        pinjamBuku(daftarBuku, "10 Dosa besar Soeharto");


        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        kembalikanBuku(daftarBuku, "menjadi lebih baik");

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        String[] buku = cariBuku(daftarBuku, "cara menjadi kaya");
        if (buku != null) {
            System.out.println("Buku ditemukan: " + buku[0]);
        }

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        System.out.println("\nBuku tersedia:");
        for (String[] b : daftarBuku) {
            if (b[3].equals("tersedia")) {
                System.out.println(b[0] + " - " + b[1]);
            }
        }

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        ArrayList<Integer> nilaiList = new ArrayList<>();
        nilaiList.add(80);
        nilaiList.add(90);
        nilaiList.add(75);
        nilaiList.add(85);
        System.out.println("\nRata-rata nilai: " + hitungRataRata(nilaiList));

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        int size = 10000;

        long start = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            list.add(j);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList time: " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = j;
        }
        end = System.nanoTime();
        System.out.println("Array time: " + (end - start) / 1000000.0 + " ms");
    }


    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        // TODO: Print ArrayList dengan title
        System.out.println(title + ": " + list);
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        // TODO: Implementasi linear search
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        // TODO: Print 2D ArrayList matrix
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi pinjam buku
        for (String[] buku : daftarBuku) {
            if (buku[0].equals(judul) && buku[3].equals("tersedia")) {
                buku[3] = "dipinjam";
                return true;
            }
        }
        return false;
    }


    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi kembalikan buku
        for (String[] buku : daftarBuku) {
            if (buku[0].equals(judul) && buku[3].equals("dipinjam")) {
                buku[3] = "tersedia";
                return true;
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi cari buku
        for (String[] buku : daftarBuku) {
            if (buku[0].equals(judul)) {
                return buku;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        // TODO: Hitung rata-rata
        if (values.isEmpty()) return 0.0;
        int sum = 0;
        for (Integer val : values) {
            sum += val;
        }
        return (double) sum / values.size();
    }
}