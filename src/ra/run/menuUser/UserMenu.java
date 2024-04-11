package ra.run.menuUser;

import ra.business.config.InputMethods;

public class UserMenu
{
    public static void userManager()
    {
        byte choice;
        do {
            System.out.println("------------------------------- USER -------------------------------");
            System.out.println("|  1.Xem Hợp đồng                 |" +  "  2.Xem dự án                     | ");
            System.out.println("|  3.Xem thông tin tài khoản      |" +  "  4.Đổi mật khẩu                  | ");
            System.out.println("|  5.Xem thông tin cá nhân        |" +  "  6.Xem TTTK                      | ");
            System.out.println("|  7.Đăng xuất ?                  |" +  "  8.Quay lại ?                    | ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
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
