import java.util.Scanner;
public class Challenge_01_improved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
//        System.out.println(str.matches("\\w+@"));
        if(str.matches("\\w+@")) {
            int i = str.indexOf("@");
            int j = str.length();
            String username = str.substring(0,i);
            String domain = str.substring(i+1,j);


            System.out.println(username);
            System.out.println(domain);
        }
        else
        {
            System.out.println("Not a gmail id");
        }

    }
}
