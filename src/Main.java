
public class Main {
    public static void main(String[] args) {
        Maths maths = new Maths();
        System.out.println(maths.multiply(7, 4));
        System.out.println(maths.divide(maths.multiply(7, 4), 4));
    }
}