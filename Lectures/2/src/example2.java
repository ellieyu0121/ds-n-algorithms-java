public class example2 {
        int a, b;
        public void setData(int c, int d){
            a = c;
            b = d;
        }
        public void showData(){
            System.out.println(a + " " + b);
        }
        public static void main(String [] args){
            example2 s1 = new example2();
            example2 s2 = new example2();
            s1.setData(1,2);
            s2.setData(3,4);
            s1.showData();
            s2.showData();
            //case 1
            example2 s3;
            s3 = s2;
            s3.showData();

            //case 2... s3 is still pointing at the object
            s2 = null;
            s3.showData();

            // case 3... object is no longer reachable
            s3 = null;
            s3.showData();
        }
}
