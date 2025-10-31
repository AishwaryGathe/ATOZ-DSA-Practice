import java.util.*;
import java.io.*;

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
        int t;

        for(int i=0;i<t;i++)
    {
        int N ;
        pattern1(N);
    }
}
}