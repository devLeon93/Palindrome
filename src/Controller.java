import java.util.Scanner;

public class Controller {

    public void checkNumberIsPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for check:");
        int num = scanner.nextInt();
        int r, sum = 0, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.print("Palindrome");
        } else System.out.print("is Not Palindrome");
    }

    public void checkStrIsPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter world for check:");
        String str = scanner.nextLine();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println(str + " not palindrome");
            } else
                System.out.println(str + " is palindrome");

        }
    }

    public void printMenu() {
        System.out.println("This is my Palindrome Check Program");
        System.out.println("Chose one of option of check:");
        System.out.println("Check number [1]");
        System.out.println("Check string [2]");
        System.out.print(">>>");


    }

    public void startProgram() {
        Scanner sc = new Scanner(System.in);
        printMenu();
        char option = sc.next().charAt(0);
        switch (option) {
            case '1':
                checkNumberIsPalindrome();
                break;
            case '2':
                checkStrIsPalindrome();
                break;
            default:
                System.out.println("Unknown option");
        }
    }

}
