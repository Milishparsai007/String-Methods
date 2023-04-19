//To check whether a given :-
//1. Number is in binary form or not.
//2. number is hexadecimal or not.
//3. date is in format dd/mm/yyyy.

import java.util.Scanner;
public class Challenge_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        if(str.matches("[01]+"))
        {
            System.out.println("Entered string is in  binary number form.");
        }
        else if(str.matches("[A-F0-9]+"))
        {
            System.out.println("Given string is in Hexadecimal format.");
        }
        else if(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"))
        {
            System.out.println("Date format.");
        }
        else
        {
            System.out.println("Not matching any format.");
        }
    }
}
