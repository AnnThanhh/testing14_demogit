package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi_2 {
    public static void main(String[] args) {
        // bài tập: kiểm tra sinh viên có qua môn học hay k với điều kiện là đtb >= 5.0,
        //và không được nghỉ quá 3 buổi

        //input: đtb, số buổi nghỉ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();
        System.out.println("Nhập số buổi nghỉ: ");
        int soBuoiNghi = sc.nextInt();

        //process: kiểm tra điều kiện
        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
        if (isQuaMon){
            //logic A
            System.out.println("Sinh viên đã qua môn");
        } else {
            //logic B
            System.out.println("Sinh viên chưa qua môn");
        }
        //output: in ra kết quả sinh viên có qua môn hay không
//        System.out.println("Kết quả sinh viên có qua môn hay không: " + isQuaMon);

        //bài tập 2: kiểm tra xem khách hàng có được giảm giá hay không
        //điều kiện là sinh viên hoặc có tổng đơn hàng >= 500.000đ
        //Boolean isSinhVien = sc.nextBoolean(); -> nhập true/false

        //input: isSinhVien, tongDonHang
        System.out.println("Khách hàng có phải là sinh viên hay không? (true/false)");
        Boolean isSinhVien = sc.nextBoolean();
        System.out.println("Nhập tổng đơn hàng: ");
        double tongDonHang = sc.nextDouble();

        //process: kiểm tra điều kiện
        Boolean isGiamGia = isSinhVien || tongDonHang >= 500000;

        //output: in ra kết quả khách hàng có được giảm giá hay không
        System.out.println("Kết quả khách hàng có được giảm giá hay không: " + isGiamGia);
    }
}
