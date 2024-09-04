/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt01;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
        public static void main(String[] args){
            ArrayList<SanPham> ds=new ArrayList<>();
            ds.add(new SanPham("SP01","Gao",25000));
            ds.add(new SanPham("SP02","Duong",45000));
            ds.add(new SanPham("SP03","Keo",29000));
            try{
                FileWriter fw=new FileWriter("sanpham.txt");
                for(SanPham sp:ds)
                {
                    fw.write(sp.getMaso()+";"+sp.getTen()+";"+sp.getGia()+"\n");
                }
                fw.close();
            }catch(Exception ex){
                System.out.println("Loi xay ra:"+ex.toString());
                System.out.println("Ghi file that bai");
            }
            
        }

}
