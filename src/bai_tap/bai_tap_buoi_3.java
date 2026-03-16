package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi_3 {
    public static void main(String[] args) {
        //bài tập 1: quản lý chi tiết cá nhân trong 7 ngày. cho phép người dùng nhập vào
        //chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
        //chi tiêu cao nhất và thấp nhất trong 7 ngày

        Scanner sc = new Scanner(System.in);
//        double[] chiTieu = new double[7];
//
//        for(int i = 0; i < chiTieu.length; i++){
//            System.out.println("nhập vào chi tiêu ngày " + (i + 1) + ": ");
//            chiTieu[i] = sc.nextDouble();
//        }
//
//        double tongChiTieu = 0;
//        double chiTieuTrungBinh = 0;
//        double chiTieuCaoNhat = chiTieu[0];
//        double chiTieuThapNhat = chiTieu[0];
//        for (double chi : chiTieu){
//            tongChiTieu += chi; //tongChiTieu = tongChiTieu + chi;
//            if (chi > chiTieuCaoNhat){
//                chiTieuCaoNhat = chi;
//            }
//
//            if (chi < chiTieuThapNhat){
//                chiTieuThapNhat = chi;
//            }
//        }
//
//        for (int i = 0; i < chiTieu.length; i++){
//            if(chiTieu[i] > chiTieuCaoNhat){
//                chiTieuCaoNhat = chiTieu[i];
//            }
//            if (chiTieu[i] < chiTieuThapNhat){
//                    chiTieuThapNhat = chiTieu[i];
//            }
//        }
//        chiTieuTrungBinh = tongChiTieu / chiTieu.length;
//        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
//        System.out.println("Trung bình chi tiêu mỗi ngày: " + chiTieuTrungBinh);
//        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
        //bài tập 2: quản lý điểm số của học sinh trong 5 môn học. cho phép người dùng nhập vào
        //điểm số của học sinh trong 5 môn học, sau đó in ra điểm trung bình, điểm cao nhất và thấp nhất,
        // và số môn học có điểm số >= 5.0

//        double[] mangDiem = new double[5];
//        for(int i = 0; i < mangDiem.length; i++){
//            System.out.println("Nhập số điểm môn thứ " + (i + 1) + " của học sinh");
//            mangDiem[i] = sc.nextDouble();
//        }
//
//        double dtb = 0;
//        double tong = 0;
//        double diemCaoNhat = mangDiem[0];
//        double diemThapNhat = mangDiem[0];
//        int soMonLonHonBang5 = 0;
//
//        for(double diem : mangDiem){
//            tong += diem;
//
//            if( diem > diemCaoNhat){
//                diemCaoNhat = diem;
//            }
//
//            if (diem < diemThapNhat){
//                diemThapNhat = diem;
//            }
//
//            if(diem >= 5 ){
//                soMonLonHonBang5++;
//            }
//        }
//
//        dtb = tong / mangDiem.length;
//        System.out.println(dtb);
//        System.out.println(soMonLonHonBang5);

        //bài tập 3: quản lý thông tin của nhân viên. cho phép người dùng nhập thông tin nhân viên
        //số giờ làm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm mỗi ngày,
        // và số ngày làm việc có số giờ làm >= 8 giờ

        int[] soGioLam = new int[7];
        for (int i = 0; i < soGioLam.length; i++) {
            System.out.println("Nhập số giờ làm ngày " + (i + 1) + " của nhân viên");
            soGioLam[i] = sc.nextInt();
        }

        int tongSoGioLam = 0;
        int soNgayLamViecLonHonBang8 = 0;

        for (int gio : soGioLam){
            tongSoGioLam += gio;

            if (gio >= 8){
                soNgayLamViecLonHonBang8++;
            }
        }
        double soGioLamTrungBinh = (double) tongSoGioLam / soGioLam.length; // -> int -> ép kiểu sang double
        System.out.println("Tổng số giờ làm trong tuần: " + tongSoGioLam);
        System.out.println("Trung bình số giờ làm mỗi ngày: " + soGioLamTrungBinh);
        System.out.println("Số ngày làm việc có số giờ làm >= 8 giờ: " + soNgayLamViecLonHonBang8);
    }
}
