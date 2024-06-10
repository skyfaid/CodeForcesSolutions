    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            String t[]=new String[x];
            for(byte i=0;i<x;i++)
                t[i]=in.next();
            for(byte i=0;i<x;i++)
            {
                    int n=t[i].length();
                if(n>10)
                    System.out.println(t[i].charAt(0)+Integer.toString(n-2)+t[i].charAt(n-1));
                else
                    System.out.println(t[i]);
            }
        }
    }
