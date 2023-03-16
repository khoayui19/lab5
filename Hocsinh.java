/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5s2;

/**
 *
 * @author Admin
 */
public class Hocsinh {
    private String hoTen;
    private String lop;
    String toan;
    String ly;
    String hoa;
    public int diemTrungBinh;
    private Object scanner;
 public Hocsinh() {
        super();
    }
 
    public Hocsinh(String hoTen, String lop, String toan, String ly, String hoa, int diemTrungBinh) {
        super();
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemTrungBinh = diemTrungBinh;
    }
     public String getHoTen(){
         return this.hoTen;
     }
     public void setHoTen(){
         this.hoTen = hoTen;
     }
     public String getLop(){
         return this.lop;
     }
     public void setLop(){
         this.lop = lop;
     }
     public String getToan(){
         return this.toan;
     }
     public void setToan(){
         this.toan = toan;
     }
     public String getLy(){
         return this.ly;
     }
     public void setLy(){
         this.ly = ly;
     }
     public String getHoa(){
         return this.hoa;
     }
     public void setHoa(){
         this.hoa = hoa;
     }
     public void getDiemTrungBinh(){
         this.diemTrungBinh = diemTrungBinh;
     }
     public int setDiemTrungBinh(){
         return this.diemTrungBinh;
     }
}

