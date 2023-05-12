/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.haui.poly.de3;

/**
 *
 * @author Nguyen Hai Trieu
 */
public class NHANVIEN extends NGUOI implements LUONG{
    private String manv;
    private String nganhNghe;
    private double heSoLuong;
    private double luong;
    private double luongCoBanNV;
    public NHANVIEN(String hoTen, String ngaySinh, String gioiTinh, String cccd,String manv,String nganhNghe,double heSoLuong,double luongCoBan,double luong) {
        super(hoTen, ngaySinh, gioiTinh, cccd);
        this.manv=manv;
        this.nganhNghe=nganhNghe;
        this.heSoLuong=heSoLuong;
        this.luongCoBanNV=luongCoBan;
        this.luong=heSoLuong*luongCoBan;
    }

    @Override
    public void setHeSoLuong(double heSoLuong) {
       this.heSoLuong=heSoLuong;
    }

    @Override
    public double getHeSoLuong(){
        return heSoLuong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public double getLuongCoBanNV() {
        return luongCoBanNV;
    }

    public void setLuongCoBanNV(double luongCoBanNV) {
        this.luongCoBanNV = luongCoBanNV;
    }

   

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    
    
}
