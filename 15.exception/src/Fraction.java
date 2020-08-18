public class Fraction extends Exception {
    private  int numerator, demoninator;

    public Fraction(int n, int d) throws ExpException {
        if (d==0) throw new ExpException();

        numerator = n;
        demoninator = d;
    }

    public static void main(String[] args) {
        try {
            Fraction f = new Fraction(2,0);
        }
        catch (Exception e){
          e.printStackTrace();
        }
        System.out.println("hahaha");
    }
}
