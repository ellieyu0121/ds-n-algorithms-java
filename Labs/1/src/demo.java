import java.util.Arrays;
import java.util.Scanner;
public class demo {
    public  static boolean isAngram(String one, String two){
        char[] strOne = one.toCharArray();
        char[] strTwo = two.toCharArray();

        Arrays.sort(strOne);
        Arrays.sort(strTwo);
        //comparing two arrays
      for (int i=0; i<strOne.length; i++){
          if (strOne[i] != strTwo[i]){
              return false;
          }
      }
      return true;
    }

    public  static boolean isRotation(String one, String two){
        //we need to check for the length, if different lengths, return false
        if (one.length()!=two.length()){
            return false;
        }
        //we check for isAnagram
        if(!isAngram(one,two)){
            return false;
        }
        //check for rotation
        String strFull = one + two;
        if (strFull.contains(two)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //checking for isAngram
        System.out.println("testing isAngram");
        System.out.println("enter the first word");
        String a = scan.nextLine();
        System.out.println("enter the second word");
        String b= scan.nextLine();
        if (isAngram(a,b)){
            System.out.println("The words are Angram!");
        } else {
            System.out.println("Nope!!!");
        }


        //checking isRotation
        System.out.println("Now, we're testing for rotation");
        System.out.println("enter the first word");
        a = scan.nextLine();
        System.out.println("enter the second word");
        b = scan.nextLine();
        if (isRotation(a,b)){
            System.out.println("The words are rotated");
        } else {
            System.out.println("Nope!!! didn't pass");
        }

    }

}
