import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ex_11();
//        Time start = new Time(2, 15, 20);
//        Time end = new Time(2, 40, 20);
//
//        Time time = new Time();
//        System.out.println(time.difference(start, end).toString());
    }

    public static void ex_1() {
        int x = 17, y = 30;
        int temp;
        System.out.println("Before swap: " + x + " " + y);
        temp = x;
        x = y;
        y = temp;

        System.out.println("After swap: " + x + " " + y);
    }

    public static void ex_2() {
        char ch = 'K';
        System.out.println("The ASCII value of " + ch + " is: " + (int) ch);
        System.out.println("The ASCII value if " + ch + " is: " + (ch - 0));
    }

    public static void ex_3() {
        int alphabetSize = 26;
        int firstLetter = 'A';
        char[] letters = new char[alphabetSize];
        for (int i = 0; i < alphabetSize; i++) {
            letters[i] = (char) (firstLetter + i);
            System.out.println(letters[i] + " has index " + (firstLetter + i));
        }
    }

    public static void ex_4() {
        String l1 = "Hello";
        String l2 = "Helloo";
        System.out.println("Strings are " + (l1.equals(l2) ? "equal" : "different"));
    }

    public static void ex_5() {
        char[] vowels = {'a', 'o', 'e', 'i', 'y', 'u'};
        int cnt = 0;
        String line = "My lineeeee";
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (line.charAt(i) == vowels[j]) {
                    cnt++;
                }
            }
        }
        System.out.println("The number of vowels is: " + cnt);
    }

    public static void ex_6() {
        int far = 41;
        System.out.println("Celsius degree: " + ((far - 32) * 5 / 9));
    }

    public static void ex_8() {
        System.out.println("Enter integer value:");
        Scanner scanner = new Scanner(System.in); // input comes from keyboard
        int num = scanner.nextInt();
        String b = Integer.toBinaryString(num);
        String o = Integer.toOctalString(num);
        String hx = Integer.toHexString(num);

        System.out.println("Binary representation of number " + num + " is: " + b);
        System.out.println("Octal representation of number " + num + " is: " + o);
        System.out.println("Hexadecimal representation of number " + num + " is: " + hx);
    }

    public static void ex_9() {
        int[] num = new int[]{2, 4, 6};
        float avg = 0;
        for (int i = 0; i < num.length; i++) {
            avg += num[i];
        }
        avg /= num.length;
        System.out.println("Average value is: " + avg);
    }

    public static void ex_10() {
        int[] int_arr = new int[]{1, 3, 5, 7, 9};
        int index;
        int replace;

        System.out.println("Array before:" + Arrays.toString(int_arr));
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter index in the array to insert number from 0 to %d: \n", (int_arr.length - 1));
        index = scanner.nextInt();

        while (index >= int_arr.length || index < 0) {
            System.out.printf("Wrong index, try one more time\n");
            index = scanner.nextInt();
        }

        System.out.printf("Enter integer number to insert: ");
        replace = scanner.nextInt();

        int_arr[index] = replace;
        System.out.println("Array after:" + Arrays.toString(int_arr));
    }


    public static void ex_11() {
        int[] my_arr = new int[]{1, 2, 6, 3, 8};
        int len = my_arr.length;
        int flag = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (my_arr[j] == my_arr[i]) {
                    System.out.printf("Duplicate value: %d\n", my_arr[i]);
                    flag++;
                }
            }
        }
        if (flag == 0)
            System.out.println("Duplicates are not found");
    }
}