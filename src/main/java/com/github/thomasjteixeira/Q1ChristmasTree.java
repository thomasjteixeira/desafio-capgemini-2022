package com.github.thomasjteixeira;

public class Q1ChristmasTree {
    public static String printTree(int n) {
        int aux = n;
        String tree = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < aux - 1){

                    tree+=" ";
                }else{
                    tree+="*";
                }
            }
            aux--;
            tree+= aux != 0 ? "\n" : "";
        }
        return tree;
    }
}
