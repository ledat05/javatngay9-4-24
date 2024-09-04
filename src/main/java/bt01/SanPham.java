/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt01;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SanPham implements Serializable{
    private String maso;
    private String ten;
    private float gia;

    public SanPham(String maso, String ten, float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }
    
}

