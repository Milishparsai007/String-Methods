public class Main{
    public static void main(String[] args) {
        //string methods
        String str1="Java program";
        System.out.println(str1);

        String str2=new String("Java");
        System.out.println(str2);

        char c[] = {'h','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);

        char c1[] = {'h','e','l','l','o'};
        String str6 = new String(c1,1,3);
        System.out.println(str6);

        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        System.out.println(str4);

        byte b1[] = {65,66,67,68};
        String str5 = new String(b1,2,2);
        System.out.println(str5);

        String str = "Java program";
        System.out.println(str1==str); //it indicates that str1 and str have same reference for the string literal "Java program".
                                       // and it is created in string pool of constants.

        String str7 = new String("java program");
        System.out.println(str7==str); //it will return false because str7 will have reference of object java program which is created in heap.
    }
}