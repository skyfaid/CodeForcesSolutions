    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            if(x%2!=0 || x==2)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
