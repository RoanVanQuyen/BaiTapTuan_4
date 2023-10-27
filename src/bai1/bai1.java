package bai1;

import java.util.Scanner;

public class bai1 {
    public static  void main(String[] args) {
        Scanner Ip = new Scanner(System.in);
        int n = Ip.nextInt();
        int a[] = new int[n];
        int b[] = new int[1000005] ;
        for (int i = 0; i < n; i++) {
            a[i] = Ip.nextInt();
            b[a[i]]++ ;
        }
        int ans = 0 , value = 0;
        for(int i = 0 ; i < 1000005 ; i++){
            if(b[i] > ans){
                ans = b[i] ;
                value = i ;
            }
        }
        System.out.println(value +  " " + ans);
    }
}
