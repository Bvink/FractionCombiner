package tornado.org.fractions;

import tornado.org.fractions.constants.Constants;

public class Main {

    public static void main(String[] args) {
        if (args.length == 6) {
            Calc c = new Calc();
            c.start(args);
        } else {
            for (String s : Constants.STARTUP_ERROR) {
                System.out.println(s);
            }
        }
    }
}
