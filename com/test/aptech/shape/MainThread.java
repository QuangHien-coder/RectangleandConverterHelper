package com.test.aptech.shape;

import java.util.Scanner;

import com.test.aptech.util.ConverterHelper;

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai cua hinh chu nhat:");
        int cd = sc.nextInt();
        System.out.println("Nhap chieu rong cua hinh chu nhat:");
        int cr =  sc.nextInt();
        Rectangle hcn1 = new Rectangle(cd, cr);
        System.out.println("Chu vi hcn la:"+hcn1.chuVi());
        System.out.println("Dien tich hcn la:"+hcn1.dienTich());
        HinhVuong hv1 = new HinhVuong(4);
        System.out.println("Chu vi hinh vuong la:"+hv1.ChuVi());
        System.out.println("Dien tich hinh vuong la:"+hv1.DienTich());
        ConverterHelper chuyendoi1 = new ConverterHelper(349, 298, 139);
        System.out.println("Do F sang do C la:"+chuyendoi1.convertFtoC());
        System.out.println("Inch sang met la:"+chuyendoi1.convertInchtometers());
        System.out.println("Met sang Inch la:"+chuyendoi1.convertmeterstoInch());
    }
}
