package ra.business.entity;

import java.time.LocalDate;

public class Project
{
    private Integer projectId;
    private String projectName;
    private Integer contractId;
    private Integer leader_id;
    private int totalMember;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status;
    private String description;
    private String technology;

    public Project()
    {
    }

    public Project(Integer projectId, String projectName, Integer contractId, Integer leader_id, int totalMember, LocalDate startDate, LocalDate endDate, boolean status, String description, String technology)
    {
        this.projectId = projectId;
        this.projectName = projectName;
        this.contractId = contractId;
        this.leader_id = leader_id;
        this.totalMember = totalMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.description = description;
        this.technology = technology;
    }

    public Integer getProjectId()
    {
        return projectId;
    }

    public void setProjectId(Integer projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public Integer getContractId()
    {
        return contractId;
    }

    public void setContractId(Integer contractId)
    {
        this.contractId = contractId;
    }

    public Integer getLeader_id()
    {
        return leader_id;
    }

    public void setLeader_id(Integer leader_id)
    {
        this.leader_id = leader_id;
    }

    public int getTotalMember()
    {
        return totalMember;
    }

    public void setTotalMember(int totalMember)
    {
        this.totalMember = totalMember;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getTechnology()
    {
        return technology;
    }

    public void setTechnology(String technology)
    {
        this.technology = technology;
    }

    @Override
    public String toString()
    {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", contractId=" + contractId +
                ", leader_id=" + leader_id +
                ", totalMember=" + totalMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
    public void displayProject(){
        System.out.println(this);
    };

}
