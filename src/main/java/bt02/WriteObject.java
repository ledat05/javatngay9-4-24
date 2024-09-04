/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt02;
import bt01.SanPham;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args){
            ArrayList<SanPham> ds=new ArrayList<>();
            ds.add(new SanPham("SP01","Gao",25000));
            ds.add(new SanPham("SP02","Duong",45000));
            ds.add(new SanPham("SP03","Keo",29000));
            ds.add(new SanPham("SP04","Pesi",10000));
            try{
                FileOutputStream fos=new FileOutputStream("sanpham.bin");
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                
                oos.writeObject(ds);
        
                oos.close();
            }catch(Exception ex){
                System.out.println("Loi xay ra:"+ex.toString());
                System.out.println("Ghi that bai");
            }
    }
}
