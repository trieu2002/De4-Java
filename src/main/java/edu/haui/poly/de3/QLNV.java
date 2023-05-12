/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class QLNV {
    private ArrayList<NHANVIEN> list=new ArrayList<>();
    private ArrayList<NHANVIEN> list2=new ArrayList<>();
    Scanner s=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap n :");
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            
            System.out.println("Nhap ho ten :");
            String hoTen=s.nextLine();
            System.out.println("Nhap ngay sinh :");
            String ngaySinh=s.nextLine();
            System.out.println("Nhap gioi tinh :");
            String gioiTinh=s.nextLine();
            System.out.println("Nhap cccd :");
            String cccd=s.nextLine();
            System.out.println("Nhap ma nhan vien :");
            String ma=s.nextLine();
            System.out.println("Nhap nghe nghiep :");
            String nghe=s.nextLine();
            System.out.println("Nhap luong co ban :");
            double luongCoban=s.nextDouble();
            System.out.println("Nhap he so luong :");
            double heSo=s.nextDouble();
            s.nextLine();
            
            NHANVIEN nv=new NHANVIEN(hoTen,ngaySinh,gioiTinh,cccd,ma,nghe,heSo,luongCoban);
            list.add(nv);
        }
    }
    public void xuat(){
    System.out.println("Danh sach sinh vien:");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ho Ten", "Ngay Sinh", "Gioi Tinh", "CCCD", "Ma Sinh Vien", "Nganh Nghe", "He so Luong","Luong Co Ban","Luong");
    for (NHANVIEN nv : list) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20.2f%-20.2f%-20.2f%n",
                nv.getHoTen(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getCccd(),
                nv.getManv(), nv.getNganhNghe(), nv.getHeSoLuong(), nv.getLuongCoBanNV(), nv.getLuong());
    }
}
    public void timKIem(){
        System.out.println("Nhap luong:");
        double luong=s.nextDouble();
        for(NHANVIEN item :list){
            if(item.getLuong()==luong){
                list2.add(item);
            }
        }
    }
    public void xuatTimKiem(){
       System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Ho Ten", "Ngay Sinh", "Gioi Tinh", "CCCD", "Ma Sinh Vien", "Nganh Nghe", "He so Luong","Luong Co Ban","Luong");
    for (NHANVIEN nv : list2) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20.2f%-20.2f%-20.2f%n",
                nv.getHoTen(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getCccd(),
                nv.getManv(), nv.getNganhNghe(), nv.getHeSoLuong(), nv.getLuongCoBanNV(), nv.getLuong());
    }
    }
    public void menu(){
        while(true){
            System.out.println("CHUONG TRINH QUAN LY NHAN VIEN");
            System.out.println("--------------------------------");
            System.out.println("1.Nhap");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim kiem");
            System.out.println("4.Thoat");
            System.out.print("Moi ban nhap lua chon :");
            int luachon=s.nextInt();
            switch(luachon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timKIem();
                    xuatTimKiem();
                break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
