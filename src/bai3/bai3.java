package bai3;


import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int kiTu = 0 ;
        int so = 0 ;
        int chu = 0  ;
        Scanner Ip =new Scanner(System.in) ;
        String s = Ip.nextLine() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i)  <= 'z' || s.charAt(i) >='A' && s.charAt(i) <= 'Z'){
                chu++;
            }
            else{
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    so++;
                }
                else{
                    kiTu++;
                }
            }
        }
        System.out.println(chu + " " + so + " " + kiTu);
    }
}