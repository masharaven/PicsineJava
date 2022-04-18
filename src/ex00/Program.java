public class Program {
    public static void main(String[] args){

        int num =  479598;
        int a, b, c, d, e, f;
        int result;

        a = num / 100000;
        num = num % 100000;
        System.out.println(a);
        b = num / 10000;
        num = num % 10000;
        System.out.println(b);
        c = num / 1000;
        num = num % 1000;
        System.out.println(c);
        d = num / 100;
        num = num % 100;
        System.out.println(d);
        e = num / 10;
        num = num % 10;
        System.out.println(e);
        f = num % 10;
        System.out.println(f);
        result = a + b + c + d + e + f;

        System.out.println(result);
    }
}
