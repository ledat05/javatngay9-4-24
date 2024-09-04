/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt02;

import bt01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois.readObject();
            System.out.println("Ket qua xuat ra duoc");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Doc file that bai");
        }
    }

}
