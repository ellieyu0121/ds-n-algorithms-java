public class example1 {
    public static void main(String[]args){
        String str1 = "hey";
        String str2 = "hey";
        String str3 = new String("hey");
        if (str1 == str2)
            System.out.println("same1");
        if (str1.equals(str2))
            System.out.println("same2");
        if (str1.equals(str3))
            System.out.println("same3");
        if (str1 == str3)
            System.out.println("look same");
        else
            System.out.println("nope");
    }
}
