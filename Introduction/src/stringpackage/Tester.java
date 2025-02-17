package stringpackage;

public class Tester {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat(" World");
        System.out.println(str1);  // Hello

        // explicitly assign the values
        str1 = str1.concat(" World");
        System.out.println(str1); // Hello World

        // String literal
        // It will be stored in String Constant pool which is under heap memory
        String s1 = "java";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");

        System.out.println("s1 = " + s1 + " and s2 = " + s2 + " and s3 = "+ s3);

        String str5 = new String("hello");
        String str6 = new String("hello");

        System.out.println("Beforn intern method() = "+ (str5 == str6));

        // to put str5 and str6 in SCP we will be using intern method
        str5 = str5.intern();
        str6 = str6.intern();

        System.out.println("After intern method() = "+ (str5 == str6));


    }
}
