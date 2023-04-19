public class Methods_1 {
    public static void main(String[] args) {
        String str = "Java";
        int l=str.length();
        System.out.println(l);

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        System.out.println(str);
        str= str.trim();
        System.out.println(str);

        String str3 = str.substring(1);
        System.out.println(str3);

        String str4 = str.substring(2,4);
        System.out.println(str4);    //substring starts from the given index and runs till end index-1

        String str5 = str.replace('a','e');
        System.out.println(str5);

    }
}
