public class Test {

    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static public int Test(int[] list, int X){
        int lo = 0;
        int hi = list.length-1;

        while (hi >= lo){
            double mid = lo + ((hi-lo)*(X - list[lo])/(list[hi]-list[lo]));
            int position = (int) mid;
            if (X < list[position]){
                hi = position - 1;
            }else if (X==list[position]){
                return position;
            }else lo = position + 1;
        }return -1;
    }

    public static void main(String[] args) {

        System.out.println(Test(list,60));
    }
}
