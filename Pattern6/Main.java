import java.io.*;
import java.util.*;

class Main{
    static void pattern6(int n){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n=5;
        pattern6(n);
    }
}