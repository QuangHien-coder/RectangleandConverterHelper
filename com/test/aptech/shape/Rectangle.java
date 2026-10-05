package com.test.aptech.shape;
public class Rectangle {
    private int chieuDai;
    private int chieuRong;
    public Rectangle(int chieuDai,int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }
}
