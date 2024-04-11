package ra.run.menuUser;

import ra.business.config.InputMethods;

public class ManagerMenu
{
    public static void roleManager()
    {
        byte choice;
        do {
            System.out.println("-------------------------- MANAGER ----------------------------");
            System.out.println("|  1.Quản lý nhân viên          |" +  "  2.Quản lý khách hàng         | ");
            System.out.println("|  3.Quản lý hợp đồng           |" +  "  4.Quản lý dự án              | ");
            System.out.println("---------------------------------------------------------------");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    employeeManager();
                    break;
                case 2:
                    customerManager();
                    break;
                case 3:
                    contractManager();
                    break;
                case 4:
                    projectManager();
                    break;
                case 5:
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
    public static void employeeManager(){
        byte choice;
        do {
            System.out.println("-------------------------- QUẢN LÝ NHÂN VIÊN ----------------------------");
            System.out.println("|  1.Thêm mới tài khoản           |" +  " 2. Xem danh sách tài khoản          | ");
            System.out.println("|  3.Cập nhật thông tin tài khoản |" +  " 4. Xoá nhân viên                    | ");
            System.out.println("|  5.Tìm kiếm theo tên            |" +  " 6. Quay lại                         | ");
            System.out.println("--------------------------------------------------------------------------");
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
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }
    public static void contractManager(){
        byte choice;
        do {
            System.out.println("-------------------------- QUẢN LÝ HỢP ĐỒNG ----------------------------");
            System.out.println("|  1.Thêm mới tài khoản           |" +  " 2. Xem danh sách                    | ");
            System.out.println("|  3.Cập nhật thông tin           |" +  " 4. Xoá                              | ");
            System.out.println("|  5.Tìm kiếm theo tên            |" +  " 6. Quay lại                         | ");
            System.out.println("--------------------------------------------------------------------------");
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
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }
    public static void projectManager(){
        byte choice;
        do
        {
            System.out.println("------------------------------ QUẢN LÝ DỰ ÁN ------------------------------");
            System.out.println("|  1.Thêm mới tài khoản           |" + " 2. Hiển thị danh sách               | ");
            System.out.println("|  3.Cập nhật thông tin           |" + " 4. Cập nhật trạng thái              | ");
            System.out.println("|  5.Quay lại                     |" + " 6. Thoát                            | ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice)
            {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
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
    public static void customerManager(){
        byte choice;
        do
        {
            System.out.println("-------------------------- QUẢN LÝ KHÁCH HÀNG ----------------------------");
            System.out.println("|  1.Thêm mới                     |" + " 2. Xem danh sách                    | ");
            System.out.println("|  3.Cập nhật thông tin           |" + " 4. Xoá                              | ");
            System.out.println("|  5.Tìm kiếm theo tên            |" + " 6. Quay lại                         | ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn nhập lựa chọn :");
            choice = InputMethods.getByte();
            switch (choice)
            {
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
