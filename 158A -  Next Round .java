    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            byte n = in.nextByte();
            byte k = in.nextByte();
            byte[]t=new byte[n];
            for(byte i=0;i<n;i++)
                t[i]= in.nextByte();
            if(t[0]==0)
                System.out.println("0");
            else {
                byte j=0;
                for (byte l = 0; l < n; l++)
                    if (t[l] >= t[k-1] &&t[l]!=0)
                        j++;
                System.out.println(j);
            }
        }
    }
