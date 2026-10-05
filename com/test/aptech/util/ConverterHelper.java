package com.test.aptech.util;

public class ConverterHelper {
    private int meters;
    private int inch;
    private int doF;
    public ConverterHelper(int meters,int inch,int doF){
        this.doF = doF;
        this.inch = inch;
        this.meters = meters;
    }
    public double convertFtoC(){
        return (doF-32)*5/9;
    }
    public double convertInchtometers(){
        return inch*0.0254;
    }
    public double convertmeterstoInch(){
        return meters/0.0254;   }
}
