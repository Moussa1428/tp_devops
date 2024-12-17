package com.moussadev;

public class Factorielle {
    public int fact(int nomb){
        int fcat =1;
        for (int i=1;i<=nomb;i++){
            fcat = fcat*i;
        }
        return fcat;
    }
}
