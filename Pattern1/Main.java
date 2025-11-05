import java.util.Scanner;

class Main {
    static void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] arg) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N=sc.nextInt();
            pattern1(N);
        }
        sc.close();
    }
}