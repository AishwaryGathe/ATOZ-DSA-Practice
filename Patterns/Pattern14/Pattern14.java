package Pattern14;

import java.util.Scanner;

public class Pattern14 {
    public static void pat14(int n){
        for(int i=1;i<=n;i++){
            for(char ch = 'A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat14(n);
        sc.close();
    }
}
