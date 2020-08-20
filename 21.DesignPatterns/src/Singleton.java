public class Test {

    int i = 0;


    private Test(){}

    private void tinhcong(){
        System.out.println(++i);
    }

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new  Test();
        a.tinhcong();
        a.tinhcong();
        b.tinhcong();

    }
}
