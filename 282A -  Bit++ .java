    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            int x = 0;
            
            while (n > 0) {
                String statement = scanner.nextLine();
                if (statement.equals("++X") || statement.equals("X++")) {
                    x++;
                } else {
                    x--;
                }
                n--;
            }
            
            System.out.println(x);
        }
    }
