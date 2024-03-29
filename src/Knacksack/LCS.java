package Knacksack;

public class LCS {
    static int dp[][] = new int[1001][1001];
    public static int Lcs(String str1, String str2, int m, int n){
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
    public static void main(String args[]){
        String str1 = "geeksforgeeks";
        String str2 = "geeks";
        int m = str1.length();
        int n = str2.length();
        System.out.println(Lcs(str1,str2,m,n));
    }
}
