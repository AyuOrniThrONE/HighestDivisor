import java.util.Scanner;

public class highestDivisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        if (2<=n && n<=1000) {
            for (int i = n/2; i >=1; i--) {
                if (n%i==0) {
                    arr[i]=i;
                    if (1<=i && i<=10) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }

    }
}
