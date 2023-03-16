/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int soNhanVienFullTime, soNhanVienPastTime;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
         
        System.out.print("Nhập số nhân viên full time: ");
        soNhanVienFullTime = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN FULL TIME");
        for (int i = 0; i < soNhanVienFullTime; i++) {
            System.out.println("Nhập thông tin nhân viên full time thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienFullTime(); 
            nhanVien.xuatThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.print("Nhập số nhân viên past time: ");
        soNhanVienPastTime = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN PAST TIME");
        for (int i = 0; i < soNhanVienPastTime; i++) {
            System.out.println("Nhập thông tin nhân viên past time thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienPastTime();
            nhanVien.xuatThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.println("THÔNG TIN NHÂN VIÊN");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
 
}
