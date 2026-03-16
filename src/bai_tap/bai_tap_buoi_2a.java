package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi_2a {
    public static void main(String[] args) {
        //ví dụ:xếp loại học sinh dựa trên điểm trung bình
        //đtb < 5.0: học sinh yếu
        //5.0 <= đtb < 7.0: học sinh trung bình
        //7.0 <= đtb < 8.5: học sinh khá
        //8.5 <= đtb <= 10: học sinh giỏi
        //cho nhập điểm 3 môn: toán, văn, anh, và họ tên

        Scanner sc = new Scanner(System.in);
        //input:
        System.out.println("Nhập họ và tên học sinh: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm toán: ");
        double diemToan = sc.nextDouble();
        System.out.println("Nhập điểm văn: ");
        double diemVan = sc.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double diemAnh = sc.nextDouble();

        //process:
        double dtb = (diemToan + diemVan + diemAnh) / 3;
        String xepLoai = "";
        if (dtb < 5.0) {
            xepLoai = "Yếu";
        }else if(dtb >= 5 && dtb < 7.0 ){
            xepLoai = "Trung bình";
        }else if (dtb >= 7.0 && dtb < 8.5){
            xepLoai = "Khá";
        }else if (dtb >= 8.5 && dtb <= 10){
            xepLoai = "Giỏi";
        }else {
            xepLoai = "Điểm không hợp lệ - vui lòng nhập lại";
        }
        //output:
        System.out.println("Học sinh " + hoTen + " có xếp loại là: " + xepLoai);

        //bài tập 2: tính tiền điện
        //điều kiện: nếu số điện tiêu thụ <= 50kwh thì giá điện là 1000đ/kw
        //nếu số điện tiêu thụ <= 100 thì giá điện là 1200đ/kw
        //nếu số điện tiêu thụ > 100 thì giá điện là 1500đ/kw
        //input:
        System.out.println("Nhập số điện tiêu thụ (kwh): ");
        int soDienTieuThu = sc.nextInt();
        //process:
        int tongTien = 0;
        if(soDienTieuThu <= 50){
            tongTien = soDienTieuThu * 1000;
        }else if (soDienTieuThu <=100){
            tongTien = soDienTieuThu * 1200;
        } else if (soDienTieuThu > 100) {
            tongTien = soDienTieuThu * 1500;
        }else{
            System.out.println("Số điện tiêu thụ không hợp lệ - vui lòng nhập lại");
        }
        //output:
        System.out.println("Tổng tiền điện phải trả: " + tongTien + "đ");

        //bài tập 3: tính tiền taxi
        //điều kiện: km đầu tiên là 20.000
        //km tiếp theo từ 2-5km là 15.000đ/km
        //km tiếp theo từ 5-10km là 12.000đ/km
        //km tiếp theo > 10km là 10.000đ/km

        //input:
        System.out.println("Nhập số km đã đi: ");
        float soKm = sc.nextInt();
        //process:
        float tongTienTaxi = 0;
        if(soKm <= 1){
            tongTienTaxi = 20000;
        }else if (soKm > 1 && soKm <= 5){
            tongTienTaxi = 20000 + (soKm - 1) * 15000;
        }else if (soKm > 5 && soKm <= 10){
            tongTienTaxi = 20000 + 4 * 15000 + (soKm - 5) * 12000;
        } else if (soKm > 10) {
            tongTienTaxi = 20000 + 4 * 15000 + 5 * 12000 + (soKm - 10)* 10000;
        }
        //output:
        System.out.println("Tổng tiền taxi phải trả: " + tongTienTaxi + "đ");
    }
}
