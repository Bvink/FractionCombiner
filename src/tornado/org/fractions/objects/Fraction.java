package tornado.org.fractions.objects;

public class Fraction {
    private int num;
    private int denom;

    public Fraction( int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int[] getFraction() {
        int[] f = {num, denom};
        return f;
    }

    public Fraction add(Fraction f)
    {
        int newNumerator = ((f.num*denom) +
                (num*f.denom));
        int newDenominator = denom*f.denom;
        Fraction g = new Fraction (newNumerator, newDenominator);
        return simplify(g);
    }

    public Fraction simplify(Fraction f) {
        int[] arr = f.getFraction();
        int gcd = findGreatestCommonDivisor(arr[0], arr[1]);
        int i = arr[0] /= gcd;
        int j = arr[1] /= gcd;
        Fraction g = new Fraction(i, j);
        return g;
    }

    int findGreatestCommonDivisor(int i, int j)
    { int temp;
        while(j != 0)
        {
            temp = j;
            j = i % j;
            i = temp;
        }
        return i;
    }
}
