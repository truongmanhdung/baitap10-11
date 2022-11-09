import java.util.Scanner;

public class Main {

    private static Sinhvien[] listSV ;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true){
            System.out.println("---------------Quan ly sinh vien--------------");
            System.out.println("1. Nhap vao sinh vien");
            System.out.println("2. Hien thi cac sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ten");
            System.out.println("Moi ban nhap so tuong ung voi chuc nang can thuc hien: ");
            int so = Integer.parseInt(sc.nextLine());

            switch (so){
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    inSinhVien();
                case 3:
                    timKiemSinhVien();
            }
        }
    }

    private static void timKiemSinhVien() {
        System.out.println("Moi ban nhap vao ten sinh vien can tim kiem: ");
        String ten = sc.nextLine();
        System.out.println("Ket qua tim kiem la: ");
        for (int i = 0; i < listSV.length; i++) {
            if(listSV[i].getTen().equals(ten)){
                listSV[i].inThongTinSinhVien();
            }
        }
    }

    private static void inSinhVien() {
        for (int i = 0; i < listSV.length; i++) {
            listSV[i].inThongTinSinhVien();
        }
    }

    private static void nhapSinhVien(){
        System.out.println("Moi ban nhap so luong sinh vien can nhap: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Moi ban nhap vao ten sinh vien thu: " + (i + 1));
            String ten = sc.nextLine();
            System.out.println("Moi ban nhap vao tuoi sinh vien thu: " + (i + 1));
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao nam sinh sinh vien thu: " + (i + 1));
            int namSinh = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao trinh do van hoa sinh vien thu: " + (i + 1));
            String trinhDoVanHoa = sc.nextLine();
            System.out.println("Moi ban nhap vao gioi tinh sinh vien thu: " + (i + 1));
            int gioiTinh = Integer.parseInt(sc.nextLine());
            Sinhvien sv = new Sinhvien(ten, tuoi, namSinh, trinhDoVanHoa, gioiTinh);
            listSV[i] = sv;
        }
    }
}