public class Sinhvien {
    private String ten;
    private int tuoi;
    private int namSinh;
    private String trinhDoVanHoa;
    private int gioiTinh;

    public Sinhvien(String ten, int tuoi, int namSinh, String trinhDoVanHoa, int gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.trinhDoVanHoa = trinhDoVanHoa;
        this.gioiTinh = gioiTinh;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrinhDoVanHoa() {
        return trinhDoVanHoa;
    }

    public void setTrinhDoVanHoa(String trinhDoVanHoa) {
        this.trinhDoVanHoa = trinhDoVanHoa;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void inThongTinSinhVien() {
        String nameGt = gioiTinh == 1 ? "nam" : gioiTinh == 0 ? "nu" : "gioi tinh thu 3";
        System.out.println("Thong tin sinh vien: ");
        System.out.println("ten: " + ten + "- tuoi: " + tuoi + "- nam sinh: " + namSinh + "- trinh do van hoa: " + trinhDoVanHoa + "- gioi tinh: " + nameGt);
    }
}
