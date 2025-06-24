public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000, rate = 5, time = 3;
        double amount = principal * Math.pow(1 + rate / 100, time);
        System.out.println("Compound Interest: " + (amount - principal));
    }
}
