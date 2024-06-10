    import java.util.Scanner;
     public class HelloWorld {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            String t[]=new String[x];
            int s=0;
            for(int i=0;i<x;i++)
            {
                String h=in.next();
                String y=in.next();
                String z=in.next();
                t[i]=h+" "+y+" "+z;
                int k=Integer.valueOf(h)+Integer.valueOf(y)+Integer.valueOf(z);
                if(k>1)
                    s++;
            }
        System.out.println(s);
        }
    }
