package ra.business.implement;

import ra.business.IGeneric.ICustomer;
import ra.business.config.InputMethods;
import ra.business.config.Role;
import ra.business.entity.Customer;
import ra.business.entity.Employee;
import ra.business.entity.Users;
import ra.data.IOFile;

import java.util.ArrayList;
import java.util.List;

import static ra.business.implement.ContractImplement.contractList;
import static ra.business.implement.UsersImplement.choice;
import static ra.business.implement.UsersImplement.userList;

public class CustomerImplement implements ICustomer
{
    public static List<Customer> customerList ;
    static {
        customerList= IOFile.readObjectFromFile(IOFile.PATH_CUSTOMER);
    }

    @Override
    public void read()
    {
        for (Customer customer : customerList)
        {
            System.out.println("==================================================");
            customer.displayCustomer();
        }

    }

    @Override
    public void create()
    {
        boolean isExit = true;
        while (isExit)
        {
            System.out.println("Bạn muốn thêm khách hàng mới, hay chọn từ danh sách người dùng đã có tài khoản :");
            System.out.println("1. Chọn từ danh sách người dùng hiện tại");
            System.out.println("2. Tạo tài khoản người dùng mới cho khách hàng");

            switch (choice())
            {
                case 1:
                    choiceUser();
                    isExit = false;
                    break;
                case 2:
                    creatCustomer();
                    isExit = false;
                    break;
                default:
                    System.out.println("Lua chon khong chinh xac");
            }
        }
    }

    private void creatCustomer()
    {
        Customer customer = new Customer();
        customer.inputCustomer(customer.getIdCustomer());
        customerList.add(customer);
        IOFile.writeObjectToFile(customerList, IOFile.PATH_CUSTOMER);
        System.out.println("Them moi thanh cong");
    }

    private void choiceUser()
    {
        readUserList();
        System.out.println("Moi ban nhap vaoo ID muon chon");
        boolean isExit = true;
        while (isExit)
        {
            byte choiceId = choice();
            if (userList.stream().anyMatch(users -> users.getUserId() == choiceId))
            {
                Customer customer = new Customer();
                customer.inputCustomer(choiceId);
                customerList.add(customer);
                IOFile.writeObjectToFile(customerList, IOFile.PATH_CUSTOMER);
                System.out.println("Them moi thanh cong");
                isExit = false;
            } else
            {
                System.out.println("ID không đúng mời nhập lại");
            }
        }
    }


    private void readUserList()
    {
        for (Users users : userList)
        {
            if (users.getRole() == Role.ROLE_USER)
            {
                System.out.println("==================================================");
                users.displayUser();
            }
        }
    }

    @Override
    public void update()
    {
        boolean isExit = true;
        while (isExit)
        {
            read();
            System.out.println("Mời bạn nhập vào ID muốn sửa");
            int inputIdUpdate = InputMethods.getInteger();
            if (finByID(inputIdUpdate) == null)
            {
                System.out.println("id bạn nhập vào chưa đúng");
            } else
            {
                while (isExit)
                {
                    System.out.println("chọn trường bạn cần sửa \n" +
                            "|1: Customer Name|\n" +
                            "|2: Birthday     |\n" +
                            "|3: Address      |\n" +
                            "|4: Email        |\n" +
                            "|5: Note         |\n" +
                            "|6: PhoneNumber  |\n" +
                            "|7: Sex          |\n" +
                            "|0: Thoát        |");
                    System.out.println("Mời bạn chọn");
                    byte choice = InputMethods.getByte();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("Moi ban nhap ten moi :");
                            finByID(inputIdUpdate).setCustomerName(InputMethods.getString());
                            System.out.println("Update Thanh cong");
                            break;
                        case 2:
                            System.out.println("Moi ban nhap ngay sinh can update");
                            finByID(inputIdUpdate).setBirthday(InputMethods.getLocalDate());
                            System.out.println("Update Thanh cong");
                            break;
                        case 3:
                            System.out.println("Moi ban nhap dia chi muon update");
                            finByID(inputIdUpdate).setAddress(InputMethods.getString());
                            System.out.println("Update Thanh cong");
                            break;
                        case 4:
                            System.out.println("Moi ban nhap Email muon update");
                            finByID(inputIdUpdate).setEmail(InputMethods.getString());
                            System.out.println("Update Thanh cong");
                            break;
                        case 5:
                            System.out.println("Moi ban nhap ghi chu muon update");
                            finByID(inputIdUpdate).setNote(InputMethods.getString());
                            System.out.println("Update Thanh cong");
                            break;
                        case 6:
                            System.out.println("Moi ban nhap luong muon update");
                            finByID(inputIdUpdate).setPhoneNumber(InputMethods.getString());
                            System.out.println("Update Thanh cong");
                            break;
                        case 7:
                            System.out.println("Moi ban nhap gioi tinh muon update |True - Nam | False - Nu|");
                            finByID(inputIdUpdate).setSex(InputMethods.getBoolean());
                            System.out.println("Update Thanh cong");
                            break;
                        case 0:
                            isExit = false;
                            break;
                        default:
                            System.err.println("lựa chọn sai ");
                    }
                }
            }
        }
        IOFile.writeObjectToFile(customerList,IOFile.PATH_CUSTOMER);
    }

    @Override
    public void delete()
    {
        boolean isExit= true;
        read();
        while (isExit){
            System.out.println("Mời bạn nhập vào ID muốn xóa");
            int idDelete = InputMethods.getInteger();

            if (finByID(idDelete)==null){
                System.out.println("Id bạn nhập vào chưa đúng");
            }else {
                if(contractList.stream().noneMatch(contract -> contract.getCustomerId()==idDelete))
                {
                    customerList.remove(finByID(idDelete));
                    IOFile.writeObjectToFile(customerList,IOFile.PATH_CUSTOMER);
                    isExit = false;
                }
                else {
                    System.out.println("Khách hàng có hợp đồng không thể xoá");
                }
            }
        }


    }

    @Override
    public Customer finByID(Integer customerID)
    {
        return customerList.stream().filter(customer -> customer.getCustomerId() == customerID).findFirst().orElse(null);
    }

    @Override
    public void findCustomerByName()
    {
        System.out.println("Moi ban nhap ten nhan vien muon tim : ");
        String inputName = InputMethods.getString();
        boolean check = true;
        for (Customer customer : customerList)
        {
            if (customer.getCustomerName().contains(inputName)){
                customer.displayCustomer();
                check = false;
            }
        }
        if (check){
            System.out.println("Khong tim thay ID muon tim");
        }
    }

}
