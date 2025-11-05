package Pattern15;

import java.util.Scanner;

public class Pattern15 {
    public static void pat15(int n){
        for(int i=1;i<=n;i++){
            for(char ch = 'A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat15(n);
        sc.close();
    }
}
