package Knacksack;

import java.util.Scanner;

public class subsetCount {
    static int countSubset(int arr[],int sum,int n){
        int dp[][] = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
               if(arr[i-1]<=j)
                   dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
               else
                   dp[i][j] = dp[i-1][j];
            }
        }
        return  dp[n][sum];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int sum = sc.nextInt();

            System.out.println(countSubset(arr,sum,n));

        }
    }
}
