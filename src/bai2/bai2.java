package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner Ip = new Scanner(System.in) ;
        int n = Ip.nextInt() ;
        int a[] = new int[n + 1] ;
        int Sum[] = new int[n+2] ;
        Sum[0] = 0 ;
        for(int i = 1 ; i <= n ; i++){
            a[i] = Ip.nextInt() ;
            Sum[i] = Sum[i-1] + a[i] ;
        }
        int t = Ip.nextInt() ;
        while(t --> 0){
            int l  = Ip.nextInt() ;
            int r = Ip.nextInt() ;
            System.out.println(Sum[r] - Sum[l-1]);
        }
    }
}
