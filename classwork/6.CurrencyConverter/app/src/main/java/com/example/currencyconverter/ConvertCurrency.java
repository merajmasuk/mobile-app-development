package com.example.currencyconverter;

public class ConvertCurrency {
    public static double usdBDT(double usdB){
        usdB=usdB*80;
        return usdB;
    }

    public static double bdtUSD(double BDTu){
        BDTu=BDTu/80;
        return BDTu;
    }

    public static double bdtIND(double bdtI){
        bdtI=bdtI*78;
        return bdtI;
    }
}
