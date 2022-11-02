import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        int t;
        Scanner tgr = new Scanner(System.in);
        System.out.print("int değeri girin : ");
        t = tgr.nextInt();

        String kosul = (t >= -128)&&(t <= 127) ? "t can be fitted in byte" : "t can't be fitted in byte";
        String kosul2 = (t >= 32.767)&&(t <= -32.768) ? "t can be fitted in short" : "t can't be fitted in short";
        String kosul3 = (t >= Math.pow(-2,31))&&(t <= Math.pow(2,31) -1) ? "T can be fitted in int" : "T can't be fitted in int";
        String kosul4 = (t <= Math.pow(2,63) - 1)&&(t >= Math.pow(-2, 63)) ? "T can be fitted in long" : "T can't be fitted anywhere.";

        System.out.println(kosul);
        System.out.println(kosul2);
        System.out.println(kosul3);
        System.out.println(kosul4);
    }
}
