import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào 3 cạnh của tam giác");
        System.out.println("nhập a: ");
        double a = input.nextDouble();
        System.out.println("nhập b: ");
        double b = input.nextDouble();
        System.out.println("nhập c: ");
        double c = input.nextDouble();

        try {
            checkTri(a, b ,c);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void checkTri(double a, double b, double c) throws ExpException{
        if (a <= 0 || b <= 0 || c <= 0) throw new ExpException();
        if (a +b < c || a + c < b || c + b < a) throw new ExpException();
    }

}
