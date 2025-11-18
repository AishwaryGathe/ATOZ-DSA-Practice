package Pattern18;

import java.util.Scanner;

public class Pattern18 {
    public static void pat18(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch + " ");
            }        
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pat18(n);
        sc.close();
    }
}
