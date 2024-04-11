package ra.business.implement;

import ra.business.IGeneric.IAdmin;
import ra.business.entity.Contract;
import ra.business.entity.Employee;
import ra.business.entity.Project;

import static ra.business.implement.ContractImplement.contractList;
import static ra.business.implement.CustomerImplement.customerList;
import static ra.business.implement.ProjectImplement.projectList;

public class  AdminImplement  implements IAdmin
{
    @Override
    public void addUser()
    {


    }

    @Override
    public void displayUser()
    {
        System.out.println("Danh sach nguoi dung hien tai");
        EmployeeImplement.employeeList.forEach(Employee::displayEmployee);

    }

    @Override
    public void openOrBlockUser()
    {

    }

    @Override
    public void statisticsCustomers()
    {
        System.out.println("So khach hang hien tai la :" + customerList.size());



    }

    @Override
    public void statisticsContract()
    {
        System.out.println("So hop dong da ky la" + contractList.size());
    }

    @Override
    public void displayProjectByContract()
    {
        for (Contract contract : contractList)
        {
            System.out.println("Hop dong :" + contract.getContractName());
            projectList.stream().filter(project -> project.getContractId()==contract.getContractId()).forEach(Project::displayProject);
            System.out.println("==================================================================");
        }
    }
}
