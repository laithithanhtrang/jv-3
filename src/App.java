import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // bài 1
        int n;
        System.out.println("Nhập số n từ bàn phím");
        n = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Nhập các phần từ trong mảng");
        for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + "\t"); // in ra mang
        }
        // tim gia tri lon nhat cua mang
        int maxArray = arr[0];
        for (int i = 0; i < n; i++) {
        if (arr[i] > maxArray) {
        maxArray = arr[i];
        }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + maxArray);
        // tim gia tri nho nhat cua mang
        int minArray = arr[0];
        for (int i = 0; i < n; i++) {
        if (arr[i] < minArray) {
        minArray = arr[i];
        }
        }
        System.out.println("Gia tri nho nhat cua mang la: " + minArray);
        // dem so chan,le trong mang;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
        countEven = countEven + 1;
        } else {
        countOdd = countOdd + 1;
        }
        }
        System.out.println("so chan co trong mang la: " + countEven);
        System.out.println("so le co trong mang la: " + countOdd);

        // tim so nguyen to trong mang
        System.out.println("Các số nguyên tố có trong mảng là: ");
        for (int i = 0; i < n; i++) {
        if (isPrimeNumber(arr[i])) {
        System.out.print(arr[i] + " ");
        }
        }
        // sap xep theo thu tu tang dan
        System.out.println("Mảng đã sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {

        if (arr[i] > arr[j]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

        }
        }
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        // sap xep theo thu tu giam dan
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần là: ");
        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {

        if (arr[i] < arr[j]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

        }
        }
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        // bài 2: Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó

        // bài 3,4,5: ma trận vuông
        int[][] firstdArr;
        firstdArr = new int[n][n];
        System.out.println("Nhập các phần tử trong mảng 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                firstdArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng đã nhập là: ");
        for (int i = 0; i < firstdArr.length; i++) {
            System.out.println("");
            for (int j = 0; j < firstdArr[i].length; j++) {
                System.out.print(firstdArr[i][j] + "\t");
            }
        }
        //
        int[][] secondArray;
        secondArray = new int[n][n];
        System.out.println("Nhập các phần tử trong mảng 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                secondArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng thứ 2 đã nhập là: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("");
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + "\t");
            }
        }
        int[][] thirdArray;
        thirdArray = new int[n][n];
        System.out.println("Tổng của hai ma trận đã nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                thirdArray[i][j] = firstdArr[i][j] + secondArray[i][j];
                System.out.print(thirdArray[i][j] + "\t");
            }
        }
        // tìm ma trận chuyển vị
        System.out.println("Ma trận chuyển vị của ma trận trên là: ");
       findMatrixTransposition(n,thirdArray);
       xuatMang(n, thirdArray);
        
        // tìm tổng các phần tử chia hết cho 5
        sumDivisiblebyFive(thirdArray, n);

        scanner.close();

    }

    // function check so nguyen to
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareNumber = (int) Math.sqrt(n);
        for (int i = 2; i <= squareNumber; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function tìm ma trận chuyển vị
    public static void findMatrixTransposition(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }


    }

    // function tim tong cac phan tu chia het cho 5
    public static void sumDivisiblebyFive(int arr[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 5 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("\nTổng các phần tử trong mảng chia hết cho 5 là: " + sum);

    }

    //functionXuatmang
    public static void xuatMang(int n, int arr[][]){
        for(int i = 0; i < n ; i++){
            System.out.println("");
            for(int j = 0 ; j < n; j ++){
                System.out.print(arr[i][j]+"\t");
            }
        }
    }
}
