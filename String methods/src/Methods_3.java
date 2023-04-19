public class Methods_3 {
    public static void main(String[] args) {
        String str1 = "Pyramid";
        String str2 = "Pyramid";
        System.out.println(str1.equals(str2));

        String str3 = "pyramid";
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        String str4 = "milish";
        System.out.println(str4.compareTo(str1));
        System.out.println(str3.compareTo(str1));  //yes because small letter comes after uppercase letters i.e., it returns positive value if str1 is greater than str2.

        System.out.println(str1==str2);  //returns true because refrence is same i.e.,Pyramid.

        String str5 = new String("Pyramid");
        System.out.println(str1==str5); //returns false because str5 will be pointing to the object created in heap whereas str1 will be pointing to the object in tsring pool.

        //references are same as addresses.

        String str = "Great wall of china";
        System.out.println(str.contains("wall")); // will return booelan value.

        String st = "great wall";
        String st1 = "of china";
        System.out.println(st.concat(st1));

    }
}
