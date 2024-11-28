public class ex3Strings {
    public static void main(String[] args) {
        // functions of String
        // 1) concatenate
        String name1 = "chinmay";
        String name2 = "inchal";
        String name3 = name1 + "  and  " + name2;

        System.out.println(name3);
        // 2)charAt
        System.out.println(name1.charAt(4));
        // 3)lenghth
        System.out.println(name1.length());
        // replace
        String namer = name1.replace('a', 'b');
        System.out.println(namer);
        // substring
        System.out.println(name1.substring(0, 4));
    }

}
