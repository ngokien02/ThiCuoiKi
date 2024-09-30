package model;

/**
 *
 * Họ tên sinh viên: Ngô Trung Hiếu Kiên
 */
public class KhachHang {

    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //phương thức tính toán    
    public double getTieuThu() {
        return chisomoi - chisocu;
    }
 
    public double getDinhMuc() {
        return sonhankhau * 4;
    }
    
    public boolean vuotDinhMuc(){
        if(getTieuThu()<= getDinhMuc()){
            return false;
        }
        else{
            return true;
        }
    }

    public double tinhTienTra() {
        double giaBan;
        if (getTieuThu() <= getDinhMuc()) {
            giaBan = 6700 * getTieuThu();
            return giaBan + (giaBan * 0.05) + (giaBan * 0.25) + ((giaBan * 0.25) * 0.08);
        } else {
            double soDMVuot = (getTieuThu() / sonhankhau);
            if (soDMVuot > 4 && soDMVuot <= 6) {
                return 0;
            }
            else{
                return 0;
            }
        }
    }
}
