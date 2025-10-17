import java.util.Arrays;
import java.util.HashSet;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1: Memahami komponen method signature
        // - Panggil method dengan signature berbeda untuk melihat perbedaannya
        // - Gunakan method overloading untuk mendemonstrasikan signature

        // Contoh pemanggilan method calculate dengan signature berbeda
        int resultInt = calculate(5, 3);
        System.out.println("Calculate(int, int): " + resultInt);

        double resultDouble = calculate(5.5, 3.2);
        System.out.println("Calculate(double, double): " + resultDouble);

        // ===== METHOD OVERLOADING =====
        System.out.println("\\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        // - Panggil semua variasi method calculate yang di-overload
        System.out.println("Calculate 2 int: " + calculate(10, 20));
        System.out.println("Calculate 2 double: " + calculate(10.5, 20.5));
        System.out.println("Calculate 3 int: " + calculate(10, 20, 30));
        System.out.println("Calculate 2 string: " + calculate("Hello", "World"));

        // - Panggil semua variasi method print yang di-overload
        print(42);
        print(3.14);
        print("Hello Java");
        print(new int[]{1, 2, 3, 4, 5});

        // - Demonstrasikan bagaimana compiler memilih method yang tepat

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object
        System.out.println("Counter awal: " + getCounter());
        incrementCounter();
        incrementCounter();
        System.out.println("Counter setelah increment: " + getCounter());

        // - Buat instance object dan panggil instance method
        MethodsAdvancedPractice object1 = new MethodsAdvancedPractice("Object1");
        MethodsAdvancedPractice object2 = new MethodsAdvancedPractice("Object2");

        // - Demonstrasikan akses ke static vs instance variables

        // - Coba akses instance method dari static context (akan error)
        object1.displayInfo();
        object2.displayInfo();
        object1.setInstanceName("Update Object 1");
        object2.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;

        // - Panggil method modifyPrimitive dengan originalNumber

        // - Print originalNumber sebelum dan sesudah method call
        System.out.println("Sebelum modifyPrimitive: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("Setelah modifyPrimitive: " + originalNumber);
        System.out.println("Nilai tidak berubah karena primitive pass by value (copy)");

        // - Jelaskan mengapa nilai tidak berubah


        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification

        // - Panggil method modifyArray dengan originalArray

        // - Print array setelah modification

        // - Jelaskan mengapa isi array berubah tetapi reference tidak

        System.out.println("Array sebelum modifyArray: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("Array setelah modifyArray: " + Arrays.toString(originalArray));
        System.out.println("Isi array berubah karena reference dikirim, bukan copy array");


        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment

        // - Panggil method reassignArray dengan anotherArray

        // - Print array setelah method call

        System.out.println("\nArray sebelum reassignArray: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("Array setelah reassignArray: " + Arrays.toString(anotherArray));
        System.out.println("Reference asli tidak berubah karena reassignment hanya di local scope");

        // - Jelaskan mengapa reference asli tidak berubah

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method yang mengembalikan copy array yang diurutkan

        // - Panggil method yang mengembalikan statistik array (min, max, avg)

        // - Panggil method yang merge dua array
        System.out.println("Original array: " + Arrays.toString(numbers));
        int[] sortedCopy = sortArrayCopy(numbers);
        System.out.println("Sorted copy: " + Arrays.toString(sortedCopy));
        System.out.println("Original tetap: " + Arrays.toString(numbers));
        double[] stats = getArrayStats(numbers);
        System.out.println("Min: " + stats[0] + ", Max: " + stats[1] + ", Average: " + stats[2]);

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] merged = mergeArrays(array1, array2);
        System.out.println("Merged array: " + Arrays.toString(merged));


        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda

        // - Panggil method printInfo dengan berbagai kombinasi parameter
        System.out.println("Sum of 1,2,3: " + sum(1, 2, 3));
        System.out.println("Sum of 10,20,30,40,50: " + sum(10, 20, 30, 40, 50));
        System.out.println("Sum of no arguments: " + sum());

        printInfo("Test Scores", 85, 90, 78, 92, 88);
        printInfo("Single Value", 100);

        // ===== METHOD CHAINING =====
        System.out.println("\\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan
        Calculator calc = new Calculator(10);
        double result = calc.add(5).multiply(2).subtract(3).getResult();
        System.out.println("Result with chaining: " + result);
        // ===== RECURSIVE METHODS =====
        System.out.println("\\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion

        // - Hitung fibonacci menggunakan recursion

        // - Implementasikan binary search recursive
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 10: " + factorial(10));

        System.out.println("Fibonacci of 7: " + fibonacci(7));
        System.out.println("Fibonacci of 10: " + fibonacci(10));

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Binary search for " + target + ": found at index " + index);


        // ===== UTILITY STATIC METHODS =====
        System.out.println("\\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika

        // - Gunakan StringUtils untuk manipulasi string

        // - Gunakan ArrayUtils untuk operasi array
        System.out.println("2^10 = " + MathUtils.power(2, 10));
        System.out.println("Is 17 prime? " + MathUtils.isPrime(17));
        System.out.println("Is 20 prime? " + MathUtils.isPrime(20));
        System.out.println("GCD of 48 and 18: " + MathUtils.gcd(48, 18));

        System.out.println("Reverse of 'Hello': " + StringUtils.reverse("Hello"));
        System.out.println("Is 'madam' palindrome? " + StringUtils.isPalindrome("madam"));
        System.out.println("Is 'hello' palindrome? " + StringUtils.isPalindrome("hello"));
        System.out.println("Word count in 'Hello World Java': " + StringUtils.countWords("Hello World Java"));

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix:");
        ArrayUtils.printMatrix(matrix);

        int[] arrayWithDuplicates = {1, 2, 3, 2, 4, 5, 3, 6};
        System.out.println("Duplicates: " + Arrays.toString(ArrayUtils.findDuplicates(arrayWithDuplicates)));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("arr1 equals arr2? " + ArrayUtils.areEqual(arr1, arr2));
        System.out.println("arr1 equals arr3? " + ArrayUtils.areEqual(arr1, arr3));


        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi

        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return a+b; //
        // Ganti dengan implementasi
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return a+b; // Ganti dengan implementasi
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return a+b+c; // Ganti dengan implementasi
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return a+b; // Ganti dengan implementasi
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        // Print integer dengan format khusus
        System.out.println("Integer: "+ value);
    }

    public static void print(double value) {
        // Print double dengan format khusus
        System.out.printf("Double: %.2f%n", value);
    }

    public static void print(String value) {
        // Print string dengan format khusus
        System.out.println("String: \"" + value + "\"");
    }

    public static void print(int[] array) {
        // Print array dengan format khusus
        System.out.println("Array: " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // TODO: Return nilai counter static
        return counter;
    }

    public static void incrementCounter() {
        // TODO: Increment counter static
        counter++;
    }

    public String getInstanceName() {
        // TODO: Return instance name
        return instanceName;
    }

    public void setInstanceName(String name) {
        // TODO: Set instance name
        this.instanceName=name;
    }

    public void displayInfo() {
        // TODO: Display instance dan static information
        System.out.println("Instance Name: " + instanceName + ", Static Counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // TODO: Modify parameter dan print perubahan
        number=1000;
        System.out.println("Inside method, number changed to: " + number);
    }


    public static void modifyArray(int[] array) {
        // TODO: Modify isi array
        if (array.length > 0) {
            array[0] = 1000;
        }
        System.out.println("Inside method, array modified: " + Arrays.toString(array));
    }

    public static void reassignArray(int[] array) {
        // TODO: Reassign reference array
        array=new int[] {100,200,300};
        System.out.println("Inside method, array reassigned: " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // TODO: Return sorted copy tanpa mengubah original
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }

    public static double[] getArrayStats(int[] array) {
        // TODO: Return array [min, max, average]
        if (array.length == 0) {
            return new double[]{0, 0, 0}; // Ganti dengan implementasi
        }
        int min = array[0];

        int max = array[0];
        int sum = 0;
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double average = (double) sum / array.length;
        return new double[]{min, max, average};
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Merge dua array dan return hasil
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // TODO: Hitung sum dari varargs
        int total =0;
        for ( int num : numbers) {
            total += num;
        }
        return total; // Ganti dengan implementasi
    }

    public static void printInfo(String title, int... values) {
        // TODO: Print title dan semua values
        System.out.print(title + ": ");
        if (values.length == 0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                if (i < values.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // TODO: Implementasi factorial recursive
        if (n <= 1) {
            return 1; // Ganti dengan implementasi
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        // TODO: Implementasi fibonacci recursive
        if (n <= 1) {
            return n; // Ganti dengan implementasi
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // TODO: Implementasi binary search recursive
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // TODO: Implementasi power function
            double result = 1;
            int absExponent = Math.abs(exponent);

            for (int i = 0; i < absExponent; i++) {
                result *= base;
            }

            return exponent < 0 ? 1 / result : result;
        }

        public static boolean isPrime(int number) {
            // TODO: Check apakah number adalah prime
            if (number <= 1) {
                return false;
            }
            if (number == 2) {
                return true;
            }
            if (number % 2 == 0) {
                return false;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int gcd(int a, int b) {
            // TODO: Greatest Common Divisor
            a = Math.abs(a);
            b = Math.abs(b);

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // TODO: Reverse string
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            // TODO: Check palindrome
            String cleaned = str.replaceAll("\\s+", "").toLowerCase();
            return cleaned.equals(reverse(cleaned));
        }

        public static int countWords(String str) {
            // TODO: Count words in string
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            String[] words = str.trim().split("\\s+");
            return words.length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // TODO: Print 2D array dengan format rapi
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.printf("%4d", value);
                }
                System.out.println();
            }
        }

        public static int[] findDuplicates(int[] array) {
            // TODO: Find duplicate elements
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int num : array) {
                if (seen.contains(num)) {
                    duplicates.add(num);
                } else {
                    seen.add(num);
                }
            }

            int[] result = new int[duplicates.size()];
            int index = 0;
            for (int num : duplicates) {
                result[index++] = num;
            }
            return result;
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // TODO: Compare dua array
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            // TODO: Add dan return this untuk chaining
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            // TODO: Multiply dan return this untuk chaining
            this.value*=n;
            return this;
        }

        public Calculator subtract(double n) {
            // TODO: Subtract dan return this untuk chaining
            this.value-=n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}