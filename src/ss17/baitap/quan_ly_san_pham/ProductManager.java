package ss17.baitap.quan_ly_san_pham;

import java.io.Serializable;

public class ProductManager implements Serializable {
    private int maSanPham   ;
    private String tenSanPham ;
    private String hangSanPham ;
    private double gia ;
    private String moTaKhac ;

    public ProductManager(){

    }

    public ProductManager(int maSanPham, String tenSanPham, String hangSanPham, double gia, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanPham = hangSanPham;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanPham() {
        return hangSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanPham='" + hangSanPham + '\'' +
                ", gia=" + gia +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}

