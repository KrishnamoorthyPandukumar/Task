package com.sample;

public class MySubs {
    public static void main(String[] args) {
    System.out.println(desiredOut(12,4,"My name is Ramachandran."));
    }

    public static String desiredOut(int start, int end, String str) {
        String s = "";
        int s1=start+end;
       /* while(start<s1){
            s=s+str.charAt(start-1);
            start++;
        }*/
        for(int i=0;i<end;i++){
            s=s+str.charAt(start-1);
            start++;
        }
        return s;
    }
}
