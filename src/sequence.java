import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value matee");
        int n = sc.nextInt();
        int c = 0;
        boolean stopped = false;
        for (int i = 1; (i <= n) && !stopped; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(i+ " ");
                c++ ;
                if (c >= n){
                    break;
                }

            }
            if(c >= n){
                stopped = true;
            }
        }

    }
}
