import java.util.Scanner;
public class Challenge_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();


        System.out.println(str.matches("\\w+\\S@gmail.com"));
        System.out.println("Username of email address is : ");
//        for(int i=0;i<str.indexOf("@");i++)
//        {
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }
        System.out.println(str.substring(0,str.indexOf("@")));

        System.out.println("Domain of email address is : ");
//        for(int i=str.indexOf("@")+1;i<str.length();i++)
//        {
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }

        System.out.println(str.substring(str.indexOf("gmail"),str.lastIndexOf("m")+1));
    }
}
