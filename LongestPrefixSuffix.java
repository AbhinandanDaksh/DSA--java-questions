//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int i=0,j=1;
        while(j<n){
            if(s.charAt(j)==s.charAt(i)){
                i++;
                lps[j]=i;
                j++;
                
            }
            else{
                if(i!=0){
                    i=lps[i-1];
                    
                }
                else{
                    lps[j]=0;
                    j++;
                }
                
            }
            
        }
        return lps[n-1];
        // code here
    }
}
