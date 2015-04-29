package tornado.org.fractions;

import tornado.org.fractions.objects.Fraction;

class Calc {

    public void start(String[] args) {
        Fraction x = new Fraction(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Fraction y = new Fraction(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

        Fraction z = x.add(y);
        int[] arr = z.getFraction();
        System.out.println(arr[0] + " " + arr[1]);
    }
}
