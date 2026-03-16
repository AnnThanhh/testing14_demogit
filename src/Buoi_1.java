import java.util.Scanner;
public class Buoi_1 {

    //comment code: cmd + / (mac) hoặc ctrl + / (win)
    //snippet code: gõ code nhanh
    //main + tab/enter: tạo hàm main nhanh
    public static void main(String[] args) {
        //1. lệnh xuất dữ liệu / in dữ liệu dưới terminal
        //print: in dữ liệu trên cùng một dòng
        //println: in dữ liệu trên một dòng, sau đó xuống dòng mới
//        System.out.print("Hello Testing 14");
//        System.out.print("Hello Trịnh An Thành");
        System.out.println("Hello Testing 14");
        System.out.println("Hello Trịnh An Thành");
        //sout + tab/enter: tạo lệnh System.out.println nhanh
        System.out.println("Hello Việt Nam");
        System.out.println("Hello Việt Nam");
        System.out.println("Hello Việt Nam");

        //2. biến: là một khu vực để lưu trữ dữ liệu trên bộ nhớ
        //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>
        //chuỗi: String
        //số: int (số nguyên), float/double (số thập phân),
        //float: 7,8 số sau dấu phẩy, double: 15-16 số sau dấu phẩy
        //boolean: true/false

        // tạo ra biến tên là họ tên
        String hoTen = "Trịnh An Thành";
        String diaChi = "Hà Nội";
        int tuoi = 18;
        System.out.println(hoTen);
        System.out.println(hoTen);
        System.out.println(hoTen);

        Boolean isStudent = true;
        Boolean isLogin = false;
        System.out.println("Họ và tên: " + hoTen);

//        //3. scanner: dùng để nhận dữ liệu từ người dùng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập họ và tên: ");
//        String fullName = sc.nextLine(); //nhận dữ liệu dạng chuỗi
//        System.out.println("Họ và tên: " + fullName);
//        //ví dụ: nhập và in thông tin học sinh bao gồm họ tên, tuổi, trường, lớp
//
//        //họ tên học sinh
//        System.out.println("Nhập họ và tên học sinh: ");
//        String studentName = sc.nextLine(); // chuỗi
//        //tuổi học sinh
//        System.out.println("Nhập tuổi học sinh: ");
//        int studentAge = sc.nextInt(); //kiểu dữ liệu là int
//        sc.nextLine(); // xóa dòng
//        //trường học sinh
//        System.out.println("Nhập trường học sinh:");
//        String studentSchool = sc.nextLine();
//        //lớp
//        System.out.println("Lớp học sinh");
//        String studentClass = sc.nextLine();
//
//        System.out.println("Họ và tên học sinh " + studentName);
//        System.out.println("Tuổi của học sinh " + studentAge);
//        //họ tên: hoTen, tuổi: age, ....
//        System.out.println("Họ tên học sinh: " + studentName + ", tuổi: " + studentAge);

        //4. toán tử
        // 4.1 toán tử số học + - * / %
        int soA = 5;

        int soB =10;
        int tinhTong = soA + soB;
        int tinhHieu = soB - soA;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;
        // %: chia lấy dư
        int tinhDu = soA % soB;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu);
        //4.2 toán tử so sánh
        //so sánh ==
        Boolean kq1 = soA == soB; // true hoặc false
        System.out.println(kq1);
        // so sánh khác !=
        Boolean kq2 = soA != soB; // true
        System.out.println("kq2: " + kq2);

        // so sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        Boolean kq3 = soA > soB; //<
        Boolean kq4 = soA >= soB; // <=
        System.out.println("kq3: " + kq3 + ", kq4: " + kq4);

        String a = "Hello";
        String b = "Hello";
        System.out.println(System.identityHashCode(a));// tìm tới vị trí trên string pool
        System.out.println(System.identityHashCode(b));
        String c = new String("Hello");
        System.out.println(System.identityHashCode(c));
        Boolean kq5 = a == b; //true
        Boolean kq6 = b.equals(c); //?? true
        Boolean kq7 = b == c; // false
        System.out.println(kq6);
    }
}

