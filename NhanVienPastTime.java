/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Admin
 */
public class NhanVienPastTime extends NhanVien {
    private int gioLamViec;
    private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO = 100000;
     
    public NhanVienPastTime() {
        super();
    }
 
    public NhanVienPastTime(int gioLamViec) {
        super();
        this.gioLamViec = gioLamViec;
    }
     
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.print("Nhập số giờ làm việc: ");
        gioLamViec = scanner.nextInt();
    }
     
    @Override
    public void tinhLuong() {
        luongNhanVien = LUONG_NHAN_VIEN_THOI_VU_MOT_GIO * this.gioLamViec;
    }
     
    @Override
    public String toString() {
        return super.toString() + ", giờ làm việc: " + this.gioLamViec;
    }
 
}