//Remove:
//1.Special characters from string
//2.extra spaces from string.
//3.count number of words

import java.util.Scanner;
public class Challenge_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        int l=str.length();
//        do {
//            int i=str.indexOf("\\W");
//            str=str.replace(str.charAt(i),"");
//
//        }while(str.matches("\\w\\S+"));

        System.out.print("Removed special characters : ");
        str=str.replaceAll("[^a-zA-Z0-9\\s]","");
        System.out.println(str);
        System.out.print("Removed extra spaces : ");
        str=str.replaceAll("\\s+"," ").trim();
        System.out.println(str);

        String words[] = str.split("\\s");
        System.out.println("total number of words : "+words.length);
    }
}
