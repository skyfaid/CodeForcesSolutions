    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            long n=in.nextLong();
            long m=in.nextLong();
            long a=in.nextLong();
            System.out.println((((n+a-1)/a)*((m+a-1)/a)));
        }
    }
