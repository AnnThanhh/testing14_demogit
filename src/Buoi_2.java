public class Buoi_2 {
    public static void main(String[] args) {
        //4.3 toán tử gán: "=", +=, -=, *=, /=
        String ngay = "thứ 2: 09.03.2026";
        int soA = 10;
        soA += 5; // tương đương với soA = soA + 5
        System.out.println("soA: " + soA);
        soA -= 3; // tương đương với soA = soA - 3
        System.out.println("soA: " + soA);
        soA *= 2; // tương đương với soA = soA * 2
        System.out.println("soA: " + soA);
        soA /= 4; // tương đương với soA = soA /
        System.out.println("soA: " + soA);

        //4.4 toán tử logic: &&, ||, !: sử dụng cho những biến kiểu Boolean
        // &&: kết hợp tất cả các điều kiện của các logic : và
        Boolean logicA = true;
        Boolean logicB = true;
        Boolean logicC = false;
        Boolean ketQua1 = logicA && logicB && logicC;
        System.out.println("ketQua1: " + ketQua1);

        // ||: ấn shift + \: hoặc -> hoặc logicA hoặc logicB
        Boolean logicD = false;
        Boolean logicE = false;
        Boolean logicF = true;
        Boolean ketQua2 = logicD || logicE || logicF;
        System.out.println("ketQua2: " + ketQua2);

        // !: phủ định: đảo ngược giá trị của biến logic
        Boolean logicG = true;
        Boolean ketQua3 = !logicG; // phủ định logicG
        System.out.println("ketQua3: " + ketQua3);

        //tiền tố và hậu tố: ++, --


        //Cấu trúc câu điều kiện
        // if statment:
        // if (điều kiện đúng){ thực hiện logic}
        int thu = 2;
        if(thu == 2 || thu == 6 ){
            System.out.println("Hôm nay tôi cần đi học");
        }

        // if else statement:
        //if(điều kiện đúng) {logic A} else {logic B}
        int soBuoiNghi = 4;
        float dtb = 8;
        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
        if (isQuaMon){
            //logic A
            System.out.println("Sinh viên đã qua môn");
        } else {
            //logic B
            System.out.println("Sinh viên chưa qua môn");
        }

        //if else if statement:
        //if(điều kiện A đúng) {logic A} else if (điều kiện B đúng) {logic B} else {logic C}

        // switch case statement:
        //switch (điều kiện cần kiểm tra)
        // case giá trị 1: thực hiện logic 1; break;
        // case giá trị 2: thực hiện logic 2; break;
        //case giá trị 3: thực hiện logic 3; break;
        // default: thực hiện logic mặc định; break;
        // default chỉ xảy ra khi không có giá trị nào khớp với điều kiện cần kiểm tra

        int soC = 2;
//        switch (soC){
//            case 1:
//                System.out.println("Số C là 1");
//                break;
//            case 2:
//                System.out.println("Số C là 2");
//                break;
//            case 3:
//                System.out.println("Số C là 3");
//                break;
//            default:
//                System.out.println("Số C không phải là 1, 2, hoặc 3");
//                break;
//        }

        switch (soC){
            case 1:
                System.out.println("Số C là 1");
                break;
            case 2:
            case 3:
                System.out.println("Số C là 2 hoặc 3");
                break;
            default:
                System.out.println("Số C không phải là 1, 2, hoặc 3");
                break;
        }

        // vòng lặp: vòng lặp while
        // cú pháp: while (điều kiện đúng) { thực hiện logic}
        // miễn là điều kiện đúng thì vòng lặp sẽ tiếp tục thực hiện logic
//        while (true){
//            System.out.println("Vòng lặp while đang chạy...");
//        }
        int soD = 2;
        while (soD <= 10) {
            System.out.println("soD: " + soD);
            soD += 2; // 4, 6, ... 12
        }

        int soE = 1;
        while (soE <=5){
            System.out.println("soE: " + soE);
            soE++; // soE++ -> ++ tăng lên 1 đơn vị, -- giảm đi 1 đơn vị -> hậu tố
        }

        // vòng lặp do...while
        // cú pháp: do { thực hiện logic} while (điều kiện đúng);
        // logic sẽ được thực hiện ít nhất 1 lần dù điều kiện có đúng hay không

        int soF = 1;
        do {
            System.out.println("số F: " + soF);
            soF++;
        }while (soF <= 3); // điều kiện = false -> vòng lặp sẽ dừng

        // vòng lặp For (*)
        //cú pháp: for (giá trị khởi tạo; điều kiện đúng; giá trị thay đổi) { thực hiện logic}
        //lưu ý: dùng khi biết được số lần lặp cụ thể

        for(int i = 1; i < 5; i++){
            System.out.println("i: " + i);
        }
    }
}