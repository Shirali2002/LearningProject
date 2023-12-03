package src.lesson7;

public class Lesson7CodesFromPresentation {

    public static void main(String[] args) {
//        mesele1();
//        mesele2();
//        mesele3();
//        mesele4();
        mesele5();
//        mesele6();
//        mesele7();
    }

    public static void mesele1() {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static void mesele2() {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        int len = array1.length; //5

        for (int i = 0; i < len; i++) {
            //     0            5  - 0 - 1 = 4
            //     1            5  - 1 - 1 = 3
            //     2            5  - 2 - 1 = 2
            //     3            5  - 3 - 1 = 1
            //     4            5  - 4 - 1 = 0
            array2[i] = array1[len - i - 1];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static void mesele3() {
        int[] arr = new int[]{23, 24, 35, 2, 15};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.printf("Massivin en boyuk elementi: %d", max);
    }

    public static void mesele4() {
        int[] arr = new int[]{1, 2, 3, 4};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("Massivin elementlerinin cemi: %d", sum);
    }

    public static void mesele5() {
        int[] arr = new int[]{3, 5, 1, 2, 4};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mesele6() {
        int[][] matrix1 = {
                {1, 2, 3}, // 0 index
                {4, 5, 6}, // 1 index
                {7, 8, 9}  // 2 index
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int setirler = matrix1.length;
        int sutunlar = matrix1[0].length;

        int[][] sum = new int[3][3];

        for (int i = 0; i < setirler; i++) {
            for (int j = 0; j < sutunlar; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < setirler; i++) {
            for (int j = 0; j < sutunlar; j++) {
                System.out.print(sum[i][j] + " ");;
            }
            System.out.println();
        }
    }

    public static void mesele7() {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] cevrilmis = new int[3][3];

        System.out.println("cevrilmeden evvel");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                System.out.print(original[i][j] + " ");;
            }
            System.out.println();
        }

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                cevrilmis[i][j] = original[j][i];
            }
        }

        System.out.println("cevrilmeden sonra");
        for (int i = 0; i < cevrilmis.length; i++) {
            for (int j = 0; j < cevrilmis[0].length; j++) {
                System.out.print(cevrilmis[i][j] + " ");;
            }
            System.out.println();
        }
    }

}
