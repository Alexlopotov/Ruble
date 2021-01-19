public class Main {
    public static void main (String[] arg) {
        double balance = 100.55;
        double refill = 1100.20;
        int bonus;
        if (refill > 1000)
        {bonus = 1100 / 100;}
        else
        {bonus = 0;}
        double total = balance + refill + bonus;
        System.out.println(total);
    }
}
