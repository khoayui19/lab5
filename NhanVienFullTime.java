/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Admin
 */
public class NhanVienFullTime extends NhanVien {
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static long LUONG_NHAN_VIEN_LA_SEP = 20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static long LUONG_LAM_THEM = 800000;
     
    public NhanVienFullTime() {
        super();
    }
 
    public NhanVienFullTime(int soNgayLamThem, String loaiNhanVien) {
        super();
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }
 
    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }
 
    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }
 
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }
 
    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }   
     
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.print("Nhập số ngày làm thêm: ");
        soNgayLamThem = scanner.nextInt();
        System.out.print("Nhập loại nhân viên (1 - bình thường, 2 - sếp): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1 -> loaiNhanVien = "Nhân viên bình thường";
            case 2 -> loaiNhanVien = "Sếp";
            default -> System.out.println("Nhập loại nhân viên không đúng!");
        }
    }
     
    @Override
    public void tinhLuong() {
        if (loaiNhanVien.equals("Nhân viên bình thường")) {
            luongNhanVien = LUONG_NHAN_VIEN_BINH_THUONG + this.soNgayLamThem * LUONG_LAM_THEM;
        } else if (loaiNhanVien.equals("Sếp")) {
            luongNhanVien = LUONG_NHAN_VIEN_LA_SEP + this.soNgayLamThem * LUONG_LAM_THEM;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", loại nhân viên: " + this.loaiNhanVien + 
            ", số ngày làm thêm: " + this.soNgayLamThem;
    }
}
