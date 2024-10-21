import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = "";
        for(int i=0;i<=a.length()-1;i++){
            if(a.charAt(i)>='A'&&a.charAt(i)<='Z'){
                s+=(char)(a.charAt(i)+32);
            } else{
                s+=(char)(a.charAt(i)-32);
            }
        }
        System.out.println(s);
    }
}