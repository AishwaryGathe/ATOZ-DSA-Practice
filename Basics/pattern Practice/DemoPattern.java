import java.util.Scanner;

public class DemoPattern{
    public static void pattern(int row, int col){
        for(int i= 0; i< row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the Cols: ");
        int c= sc.nextInt();

        pattern(r, c);
        sc.close();
    }
}