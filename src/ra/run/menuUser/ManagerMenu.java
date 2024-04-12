package ra.run.menuUser;

import ra.business.config.InputMethods;
import ra.business.entity.Contract;
import ra.business.implement.ContractImplement;
import ra.business.implement.CustomerImplement;
import ra.business.implement.EmployeeImplement;
import ra.business.implement.ProjectImplement;

public class ManagerMenu
{
    public static void roleManager()
    {
        EmployeeImplement employeeImplement = new EmployeeImplement();
        CustomerImplement customerImplement = new CustomerImplement();
        ContractImplement contractImplement = new ContractImplement();
        ProjectImplement projectImplement = new ProjectImplement();

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
                    employeeManager(employeeImplement);
                    break;
                case 2:
                    customerManager(customerImplement);
                    break;
                case 3:
                    contractManager(contractImplement);
                    break;
                case 4:
                    projectManager(projectImplement);
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
    public static void employeeManager(EmployeeImplement employeeImplement){
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
                    employeeImplement.create();
                    break;
                case 2:
                    employeeImplement.read();
                    break;
                case 3:
                    employeeImplement.update();
                    break;
                case 4:
                    employeeImplement.delete();
                    break;
                case 5:
                    employeeImplement.findEmployeeByName();
                    break;
                case 6:
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
    public static void contractManager(ContractImplement contractImplement){
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
                    contractImplement.create();
                    break;
                case 2:
                    contractImplement.read();
                    break;
                case 3:
                    contractImplement.update();
                    break;
                case 4:
                    contractImplement.delete();
                    break;
                case 5:
                    contractImplement.findContractByName();
                    break;
                case 6:
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
    public static void projectManager(ProjectImplement projectImplement){
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
                    projectImplement.create();
                    break;
                case 2:
                    projectImplement.read();
                    break;
                case 3:
                    projectImplement.update();
                    break;
                case 4:
                    projectImplement.updateProjectStatus();
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
    public static void customerManager(CustomerImplement customerImplement){
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
                    customerImplement.create();
                    break;
                case 2:
                    customerImplement.read();
                    break;
                case 3:
                    customerImplement.update();
                    break;
                case 4:
                    customerImplement.delete();
                    break;
                case 5:
                    customerImplement.findCustomerByName();
                    break;
                case 6:
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
