package functionss;

import java.util.Scanner;

public class Function {
    public static int findmax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int fnum = sc.nextInt();
        System.out.print("Enter Last Number: ");
        int lnum = sc.nextInt();

        int max = findmax(fnum, lnum);
        System.out.println("The Larger number is: "+max);
        sc.close();
    }
}
