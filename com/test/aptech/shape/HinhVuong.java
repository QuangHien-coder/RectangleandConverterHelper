package com.test.aptech.shape;

public class HinhVuong {
    private int canh;
    public HinhVuong(int canh){
        this.canh = canh;
    }
    public double ChuVi(){
        return canh*4;
    }
    public double DienTich(){
        return canh*canh;
    }
}
