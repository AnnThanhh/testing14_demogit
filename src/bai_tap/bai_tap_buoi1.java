package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi1 {
    public static void main(String[] args) {
        //bài 1: tính điểm trung bình của học sinh, cho phép nhập vào họ tên,
        //điểm toán, lý, hóa. Sau đó in ra thông tin của học sinh đó
        //sử dụng scanner, tính toán, system.out.println để in thông tin

        //bài 2: tính lương nhân viên, cho phép nhập vào họ tên, lương cơ bản, số ngày làm việc.
        //Sau đó in ra thông tin của nhân viên đó

        // sử dụng mô hình IPO (Input: dữ liệu đầu vào - Process: xử lý logic để đạt đuược output
        //                                  - Output: kết quả mong muốn)

        //bài 1:
        // input: họ tên, điểm toán, lý, hóa
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên học sinh: ");
        String hoTen = sc.nextLine(); // Trịnh An Thành,...
        System.out.println("Nhập điểm toán: ");
        float diemToan = sc.nextFloat(); // 8.5, 9.
        System.out.println("Nhập điểm lý: ");
        float diemLy = sc.nextFloat(); // 7.5, 8.0
        System.out.println("Nhập điểm hóa: ");
        float diemHoa = sc.nextFloat(); // 6.5, 7.0

        //process: tính điểm trung bình
        float diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;

        //output: in ra những thông tin của học sinh: tên, toán, lý, hóa, điểm trung bình(*)
        System.out.println("Họ tên học sinh: " + hoTen);
        System.out.println("Điểm toán: " + diemToan);
        System.out.println("Điểm lý: " + diemLy);
        System.out.println("Điểm hóa: " + diemHoa);
        System.out.println("Điểm trung bình: " + diemTrungBinh);

        sc.nextLine();

        //bài 2:
        //input: họ tên, lương cơ bản, số ngày làm việc
        System.out.println("Nhập họ tên nhân viên: ");
        String fullName = sc.nextLine(); // xóa dòng
        System.out.println("Nhập lương cơ bản: ");
        double luongCoBan = sc.nextFloat();
        System.out.println("Nhập số ngày làm việc: ");
        double soNgayLamViec = sc.nextInt();

        //process: tính lương thực nhận của nhân viên
        double luongThucNhan = luongCoBan * soNgayLamViec;

        //output: in ra những thông tin của nhân viên: tên, lương cơ bản, số ngày làm việc, lương thực nhận(*)
        System.out.println("Họ tên nhân viên: " + fullName);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
        System.out.println("Lương thực nhận: " + luongThucNhan);
    }
}
