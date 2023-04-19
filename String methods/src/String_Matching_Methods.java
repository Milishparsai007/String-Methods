import java.util.Scanner;
public class String_Matching_Methods {
    public static int a=0;
    static void print(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
//        String str = "p";
//        System.out.println(str.matches("."));  // it will return true as there is only one letter.
//
//        String str1="pq";
//        System.out.println(str1.matches(".")); // returns false as there are two letters in string.
//
//        String str2="a";
//        System.out.println(str2.matches("[abc]")); //returns true as there is a single letter in string which matches with
//                                                         //one letter in the pattern [abc].
//        System.out.println(str2.matches("[^abc]"));//returns false as the string contains one of the letters from[abc]
//
//        String str3="ab";
//        System.out.println(str3.matches("[abc]")); //returns false as string contains 2 letters.
//
//        String str4="aq";
//        System.out.println(str4.matches("[abc][pq]")); //returns true as string contains one letter from[abc] and another from[pq].
//
//        String str5 = "a1";
//        System.out.println(str5.matches("[a-z0-9]"));//returns false as there are 2 characters in the string.
//        System.out.println(str5.matches("[a-z][0-9]"));//returns true
//
//        String str6="A";
//        if(str6.matches("A|B" )) //returns true as string contains one of the A or B.
//        {
//            System.out.println("true");
//        }

//
//        String str7="Milish";
//        System.out.println(str7.matches("Milish"));//returns true as the string exactly amcthes the pattern Milish.
//        //#note:- order is important in patterns.
//
//        String st1 = "a";
//        System.out.println(st1.matches("\\d"));  //false as st1 does not contains a digit
//        System.out.println(st1.matches("\\D"));
//        System.out.println(st1.matches("\\s"));
//        System.out.println(st1.matches("\\S"));
//        System.out.println(st1.matches("\\w"));
//        System.out.println(st1.matches("\\W"));

//        String str = "aaaaaaabbccdd";
//        System.out.println(str.matches("[abcd]*")); //true because letters from a-d any no.of times

//        String str = "bcci23";
//        System.out.println(str.matches("[a-z]+")); //false contains number
//        System.out.println(str.matches("[a-z0-9]+")); //true

//        String str = "";
//        System.out.println(str.matches("[abcd]{26}")); //any letter from a to z but exatcly 26 times.
//        System.out.println(str.matches("[abc]{0,7}"));//any letter from abc but within 0-7 times

        //Now we will design a method for checking email id's.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string : ");
//        String str = sc.nextLine();
//        System.out.println(str.matches("[a-zA-Z0-9]+\\S@gmail.com"));
//        System.out.println(str.matches("\\w+\\S@gmail.com"));

//        String s="a";
//        System.out.println(s.matches("a|b"));
//        String_Matching_Methods.a=10;
//        print(a);

        String str="MILISH";
        System.out.println(str.length());;
        System.out.println(str.charAt(0));
    }
}
