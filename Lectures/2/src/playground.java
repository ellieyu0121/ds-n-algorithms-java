public class playground {
    public static void reverseArray(int[] array){
        int n = array.length;
        for (int i=0; i<n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
    }

    public static void printArray(int[] array){
        for (int n : array){
            System.out.println(n);
        }
    }

    public static void main(String [] args){
        int A[] = {1,2,3,4,5,6};
        reverseArray(A);
        printArray(A);


    }
}

