public class Methods_2 {
    public static void main(String[] args) {
        String str = "Helloworld";
        boolean b1 = str.startsWith("Hel");
        System.out.println(b1);

        boolean b2 = str.endsWith("ld");
        System.out.println(b2);

        char c1 = str.charAt(3);
        System.out.println(c1);

        int i = str.indexOf("lo");
        System.out.println(i);

        int i1 = str.indexOf("o",5);
        System.out.println(i1);

        int i2 = str.lastIndexOf("lo");
        System.out.println(i2);

        int i3 = str.lastIndexOf("o",5);
    }
}
