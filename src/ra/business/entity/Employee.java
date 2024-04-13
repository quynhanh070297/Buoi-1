package ra.business.entity;

import ra.business.config.InputMethods;
import ra.business.implement.DepartmentImplement;
import ra.business.implement.EmployeeImplement;
import ra.data.IOFile;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import static ra.business.implement.DepartmentImplement.departmentList;

public class Employee implements Serializable
{
    private Integer employeeId;
    private String employeeName;
    private Integer departmentId;
    private LocalDate birthday;
    private boolean sex;
    private LocalDate createdDate;
    private double salary;

    public Employee()
    {
    }

    public Employee(Integer employeeId, String employeeName, Integer departmentId, LocalDate birthday, boolean sex, LocalDate createdDate, double salary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentId = departmentId;
        this.birthday = birthday;
        this.sex = sex;
        this.createdDate = createdDate;
        this.salary = salary;
    }

    public Integer getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public Integer getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday = birthday;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public LocalDate getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate)
    {
        this.createdDate = createdDate;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void inputEmployee()
    {

        this.employeeId = getInputEmployeeId(EmployeeImplement.employeeList);
        System.out.println("Mời bạn nhập tên nhân viên");
        this.employeeName = InputMethods.getString();
        this.departmentId = getInputDepartmentId();
        this.birthday = InputMethods.getLocalDate();
        System.out.println("Mời bạn nhập giới tính");
        this.sex = InputMethods.getBoolean();
        this.createdDate = LocalDate.now();
        System.out.println("Mời bạn nhập lương");
        this.salary = InputMethods.getFloat();
    }
    public void displayEmployee()
    {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Employee Name : %-15s | Department ID : %-3s | Ngay sinh : %-10s | Sex : %-5s | Ngay tao : %-15s\n",
                this.employeeId, this.employeeName, this.departmentId, this.birthday, this.sex ? "Nam" : "Nữ", this.createdDate);
    }

    private Integer getInputEmployeeId(List<Employee> employeeList)
    {
        //Nếu list chưa có phần tử nào thì đây chính là phần tử đầu tiên
        if (employeeList.isEmpty())
        {
            return 1;
        } else
        {
            int maxId = employeeList.getFirst().getEmployeeId();
            for (Employee employee : employeeList)
            {
                //Tìm ra id lớn nhất hiện có trong list employee
                if (employee.getEmployeeId() > maxId)
                    maxId = employee.getEmployeeId();
            }
            return ++maxId;
        }
    }

    private Integer getInputDepartmentId()
    {
        if (departmentList.isEmpty())
        {
            System.out.println("Hien tai chua co phong ban nao moi ban them moi phong ban");
            Department department = new Department();
            department.inputDepartment();
            departmentList.add(department);
            IOFile.writeObjectToFile(departmentList, IOFile.PATH_DEPARTMENT);
            System.out.println("Them moi thanh cong, nhan vien se tu dong duoc them vao phong ban nay");
            return department.getDepartmentId();
        } else
        {
            System.out.println("Danh sach phong ban");
            for (Department department1 : departmentList)
            {
                department1.displayDepartment();
            }
            System.out.println("Moi ban nhap id phong ban muon them");
            do
            {
                int departmentId = InputMethods.getInteger();
                for (Department department : departmentList)
                {
                    if (departmentId == department.getDepartmentId())
                    {
                        return department.getDepartmentId();
                    }
                }
                System.out.println("Nhap sai moi nhap lai");
            } while (true);
        }
    }
}