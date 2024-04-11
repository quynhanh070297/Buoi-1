package ra.business.implement;

import ra.business.IGeneric.IContract;
import ra.business.entity.Contract;
import ra.business.entity.Department;
import ra.data.IOFile;

import java.util.ArrayList;
import java.util.List;

public class ContractImplement implements IContract
{
    public static List<Contract> contractList;
    static {
        contractList = IOFile.readObjectFromFile(IOFile.PATH_CONTRACT);
    }
    @Override
    public void read()
    {
        System.out.println("Danh sach hop dong la : ");
        contractList.forEach(Contract::displayContract);
    }

    @Override
    public void create()
    {
        Contract contract = new Contract();
        contract.inputContract();
        contractList.add(contract);
        IOFile.writeObjectToFile(contractList,IOFile.PATH_CONTRACT);

    }

    @Override
    public void update()
    {

    }

    @Override
    public void delete()
    {

    }

    @Override
    public Contract finByID(Integer integer)
    {

         return contractList.stream().filter(contract -> contract.getContractId() == integer).findFirst().orElse(null);
    }

    @Override
    public void findContractByName()
    {

    }
}
