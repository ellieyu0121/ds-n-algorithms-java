public class demo2 {

    demo d1 = new demo();

    public  boolean isRotation(String one, String two){
        //break them into an array of char
        char[] str1 = one.toCharArray();
        char[] str2 = two.toCharArray();

        //we need to check for the length, if different lengths, return false
        if (str1.length!=str2.length){
            return false;
        }

        //we check for isAnagram
        if(!d1.isAngram(one,two)){
         return false;
        }

        //check for rotation



    }

}

