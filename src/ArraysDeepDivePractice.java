import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matriks = new int[3][4];

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        matriks[0][0] = 1;
        matriks[0][1] = 2;
        matriks[0][2] = 3;
        matriks[0][3] = 4;
        matriks[1][0] = 5;
        matriks[1][1] = 6;
        matriks[1][2] = 7;
        matriks[1][3] = 8;
        matriks[2][0] = 9;
        matriks[2][1] = 10;
        matriks[2][2] = 11;
        matriks[2][3] = 12;

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] papanCatur = {
                {".",".","."},
                {".",".","."},
                {".",".","."}
        };

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        papanCatur[0][0] = "X";
        papanCatur[1][1] = "X";
        papanCatur[2][2] = "X";
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        papanCatur[0][2] = "O";
        papanCatur[1][0] = "O";
        papanCatur[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        for (int i = 0; i < papanCatur.length; i++) {
            for (int j = 0; j < papanCatur[i].length; j++) {
                System.out.print(papanCatur[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int angka = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = angka++;
            }
        }

        // - Print array jagged dengan menampilkan panjang setiap baris
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Baris " + i + " (panjang " + jaggedArray[i].length + ")");
        }


        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] matriks1 ={
                {4,7,9},
                {2,6,3}
        };

        int[][] matriks2 = {
                {1,5,8},
                {11,10,12}
        };
        System.out.println("Matriks 1:");
        displayMatrix(matriks1);

        System.out.println("Matriks 2:");
        displayMatrix(matriks2);
        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] hasiljumlah = addMatrices(matriks1, matriks2);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] hasilKali = multiplyByScalar(matriks1, 2);

        // - Print hasil operasi
        System.out.println("Hasil Penjumlahan Matriks:");
        displayMatrix(hasiljumlah);
        System.out.println("Matriks 1 dikali scalar 2:");
        displayMatrix(hasilKali);

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array Asli: " + Arrays.toString(numbers));

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        int[] sorted = sortArray(numbers.clone());
        System.out.println("Setelah diurutkan: " + Arrays.toString(sorted));

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        int[] reversed = reverseArray(numbers.clone());
        System.out.println("setelah dibalik: " + Arrays.toString(reversed));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        int[] minMax = findMinMax(numbers);
        System.out.println("Nilai minimum: " + minMax[0] + ", Nilai maksimum: " + minMax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("Array asli: " + Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Setelah urut: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int index = Arrays.binarySearch(data, 8);
        System.out.println("Index angka 8 (setelah diurutkan): " + index);

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        Arrays.fill(data, 7);
        System.out.println("Array fill  7 : " + Arrays.toString(data));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] data2 = {1, 2, 5, 8, 10};
        System.out.println("perbandingan data dan data2 = " + Arrays.equals(data, data2));

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy dengan ukuran 10 : " + Arrays.toString(copy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] treeD = new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        int nilai = 1;
        for (int i = 0; i < treeD.length; i++) {
            for (int j = 0; j < treeD[i].length; j++) {
                for (int k = 0; k < treeD[i][j].length; k++) {
                    treeD[i][j][k] = nilai++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < treeD.length; i++) {
            System.out.println("Lapisan " + i + ":");
            for (int j = 0; j < treeD[i].length; j++) {
                System.out.print("  Baris " + j + ": ");
                for (int k = 0; k < treeD[i][j].length; k++) {
                    System.out.print(treeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] nilaiMahasiswa = new int[5][4];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(nilaiMahasiswa, 60, 100);

        // - Hitung rata-rata per mahasiswa
        double[] rataMhs = new double[5];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.printf("%-15s", namaMahasiswa[i]);
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf("%-15d", nilaiMahasiswa[i][j]);
            }
            rataMhs[i] = calculateAverage(nilaiMahasiswa[i]);
            System.out.printf("%.2f\n", rataMhs[i]);
        }

        // - Hitung rata-rata per mata kuliah
        System.out.println("-".repeat(75));
        System.out.printf("%-15s", "Rata-rata MK");
        for (int j = 0; j < mataKuliah.length; j++) {
            int[] nilaiMK = new int[5];
            for (int i = 0; i < 5; i++) {
                nilaiMK[i] = nilaiMahasiswa[i][j];
            }
            System.out.printf("%-15.2f", calculateAverage(nilaiMK));
        }
        System.out.println();

        // - Tentukan mahasiswa dengan nilai tertinggi
        int maxIndex = 0;
        for (int i = 1; i < rataMhs.length; i++) {
            if (rataMhs[i] > rataMhs[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("\nMahasiswa dengan nilai tertinggi: " + namaMahasiswa[maxIndex] +
                " (rata-rata: " + String.format("%.2f", rataMhs[maxIndex]) + ")");

        // - Print dalam format tabel yang rapi
        System.out.println("TABEL NILAI MAHASISWA");
        System.out.println("=".repeat(75));
        System.out.printf("%-15s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%-15s", mk);
        }
        System.out.println("Rata-rata");
        System.out.println("-".repeat(75));

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] papan = new char[3][3];

        // - Implementasikan method untuk menampilkan papan
        for (int i = 0; i < 3; i++) {
            Arrays.fill(papan[i], '-');
        }

        // - Implementasikan method untuk mengecek apakah ada pemenang
        System.out.println("Papan awal:");
        displayBoard(papan);

        // - Simulasikan beberapa langkah permainan
        papan[0][0] = 'X';
        papan[1][1] = 'X';
        papan[2][2] = 'X';
        papan[0][1] = 'O';
        papan[1][0] = 'O';

        System.out.println("Setelah beberapa langkah (X diagonal):");
        displayBoard(papan);

        if (checkWinner(papan, 'X')) {
            System.out.println("*** X MENANG! ***");
        }
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max};
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;

    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board, char player) {
        // Cek horizontal
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Cek vertikal
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Cek diagonal utama (kiri atas ke kanan bawah)
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        // Cek diagonal sekunder (kanan atas ke kiri bawah)
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}