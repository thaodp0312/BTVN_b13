public class Checkmasv {
    void masv(String str) {
        if (str.matches("[N][V][0-9]{7}")) {
            System.out.println("Đúng định dạng mã số sinh viên");
        } else {
            System.out.println("Không đúng định dạng mã số sinh viên ");
        }
    }
}
