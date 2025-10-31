package Pattern4;
import java.io.*;
import java.util.*;


public class Main {

    static void pattern4(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        int n=5;
        pattern4(n);
    }
    
}
