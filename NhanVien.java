/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
 
public abstract class NhanVien {
    private String tenNhanVien;
    private String loaiNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);
     
    public NhanVien() {
        super();
    }
 
    public NhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }
     
    public void xuatThongTin() {
        System.out.print("Xuất tên nhân viên: ");
        tenNhanVien = scanner.nextLine();
    }
     
    public abstract void tinhLuong();
 
    @Override
    public String toString() {
        return "Tên nhân viên: " + this.tenNhanVien + ", lương nhân viên: " + 
            this.luongNhanVien + " VND";
    }
 
}
