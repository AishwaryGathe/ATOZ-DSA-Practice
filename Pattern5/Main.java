package Pattern5;

public class Main {
    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n=5;
        pattern5(n);
    }
}
