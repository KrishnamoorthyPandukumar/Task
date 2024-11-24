package com.sample;

public class FindGivenCharReturnIndex {

    public static void main(String[] args) {
        System.out.println(findCharIndex("kriisdfsi",'i'));
    }
    public static  int findCharIndex (String s,char c){
        int index=0;
        for(int i=index;i<s.length();i++){
            if(s.charAt(i)==c){
                index=i;
            }
        }
        return index+1;
    }

}
