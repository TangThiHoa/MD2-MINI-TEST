public class Person {
    private String soDt ;
    private String nhom ;
    private String gioiTinh ;
    private String hoTen ;
    private String diaChi ;
    private String ngaySinh ;

    public Person() {
    }

    public Person(String soDt, String nhom, String gioiTinh, String hoTen, String diaChi, String ngaySinh) {
        this.soDt = soDt;
        this.nhom = nhom;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return soDt+"," + hoTen+ "," + diaChi+"," + ngaySinh+"," + nhom +",";
    }
}
