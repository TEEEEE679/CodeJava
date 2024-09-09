package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        //ให้นับเลขคู่เลขคี่ ใน Array ด้านล่าง
        int[] numbers = {2, 4, 5, 7, 9, 10, 56, 25, 41, 78, 96, 36, 45, 21, 23, 27};
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " , ");
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\nAmount of all Number : " + numbers.length);
        System.out.println("\nAmount of Odd Number : " + countOdd);
        System.out.println("\nAmount of Even Number : " + countEven);
    }
}
