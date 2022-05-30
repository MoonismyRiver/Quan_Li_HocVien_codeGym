package QuanLiHocVienCodeGym;

import java.util.Date;

public class Hocsinh {
    private String ten;
    private int tuoi;
    private Date ngaysinh;
    private String quequan;
    private Lop lop;

    public String getLop() {
        return lop.getTenLop();
    }

    public void setLop(String lop) {
         this.lop.setTenLop(lop);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return "Hocsinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", ngaysinh=" + ngaysinh +
                ", quequan='" + quequan + '\'' +
                '}';
    }
}
