import java.util.Scanner;
public class W05_01_IfElse_OddEvenNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number: ");

    
        int number = kb.nextInt();
        int result = number % 2;

        // case 1
        if(result==0) {
            System.out.println(number + " is an even number. ");
        } else {
            System.out.println(number + " is an odd number. ");
        }

        //case 2
        if(result!=0) {
            System.out.println(number + " is an odd number ");
        } else {
            System.out.println(number + " is an even number. ");
        }

        //case 3
        if(result==1) {
            System.out.println(number + " is an odd number ");
        } else {
            System.out.println(number + " is an even number. ");
        }

        //case 4 
        if(result!=1) {
            System.out.println(number + " is an even number. ");
        } else {
            System.out.println(number + " is an odd number. ");
        }
    }

}