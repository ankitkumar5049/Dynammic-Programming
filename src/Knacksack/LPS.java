package Knacksack;

import java.util.Scanner;


public class LPS {
        static int dp[][] = new int[1001][1001];
        public static int Lcs(StringBuilder str1, StringBuilder str2, int m, int n){
            for(int i=0;i<m+1;i++){
                for(int j=0;j<n+1;j++){
                    if(i==0 || j==0)
                        dp[i][j]=0;
                }
            }
            for(int i=1;i<m+1;i++){
                for(int j=1;j<n+1;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1))
                        dp[i][j] = 1+dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            return dp[m][n];
        }
        public static int Lps(StringBuilder str1, StringBuilder str2){
            int n = str1.length();
            int m = str2.length();
            return n-Lcs(str1,str2,m,m);
        }
        public static void main (String[] args) {
            //code
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                StringBuilder str1 = new StringBuilder(sc.next());
                StringBuilder str2 = new StringBuilder();
                str2.append(str1);
                str2.reverse();
                System.out.println();
            }
        }
}
