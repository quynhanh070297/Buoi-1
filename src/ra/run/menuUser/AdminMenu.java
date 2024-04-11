package ra.run.menuUser;

import ra.business.config.InputMethods;
import ra.business.implement.EmployeeImplement;
import ra.business.implement.UsersImplement;

public class AdminMenu
{

    public static void adminManager()
    {
        boolean isExit = true;
        byte choice;
        do {
            System.out.println("-------------------------- ADMIN ----------------------------");
            System.out.println("|  1.Quản trị tài khoản         |" +  "  2.Báo cáo thống kê         | ");
            System.out.println("|  3.Đăng xuất ?                |" +  "  4.Quay lại ?               | ");
            System.out.println("|  5.Đổi mật khẩu?              |" +  "  0.Thoát ?                  | ");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    acountManager();
                    break;
                case 2:
                    reportList();
                    break;
                case 3:
                    UsersImplement.logout();
                    isExit = false;
                    break;
                case 4:
                    isExit = false;
                    break;
                case 5:
                    UsersImplement.changePassword();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (isExit);
    }
    public static void acountManager(){
        byte choice;
        do {
            System.out.println("-------------------------- QUẢN TRI TÀI KHOAN ----------------------------");
            System.out.println("|  1.Thêm mới tài khoản           |" +  " 2. Xem danh sách tài khoản          | ");
            System.out.println("|  3.Khoá mở tài khoản            |" +  " 4.Quay lại                          | ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:

                    break;
                case 2:


                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }
    public static void reportList(){
        byte choice;
        do {
            System.out.println("--------------------------  BÁO CÁO THỐNG KÊ   ----------------------------");
            System.out.println("|1.Thống kê số lượng khách hàng      |" +  " 2. Thống kê số lượng hợp đồng       | ");
            System.out.println("|3.Xem danh sách dự án theo hợp đồng |" +  " 4.Quay lại                          | ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

}