package ra.business.implement;

import ra.business.IGeneric.IProject;
import ra.business.entity.Project;
import ra.data.IOFile;

import java.util.ArrayList;
import java.util.List;

public class ProjectImplement implements IProject
{
    public static List<Project> projectList ;
    static {
        projectList = IOFile.readObjectFromFile(IOFile.PATH_PROJECT);
    }
    @Override
    public void read()
    {

    }

    @Override
    public void create()
    {

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
    public Project finByID(Integer integer)
    {
        return null;
    }
}
