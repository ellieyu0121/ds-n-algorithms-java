import java.util.Arrays;
import java.util.Scanner;
public class demo {
    public  boolean isAngram(String one, String two){
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


    /*public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input the first word");
        String a = scan.nextLine();
        System.out.println("input the second word");
        String b= scan.nextLine();
        System.out.println(isAngram(a,b));


    }
    */
}
