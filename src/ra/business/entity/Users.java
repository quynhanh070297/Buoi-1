package ra.business.entity;

import ra.business.config.Role;

public class Users
{
    private  int userId;
    private  String username;

    private  String password;

    private Role role;

    private  boolean status;

    public Users()
    {

        this.role = Role.ROLE_USER;
        this.status = true;
    }

    public Users(int userId, String username, String password, Role role, boolean status)
    {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = Role.ROLE_USER;
        this.status = status;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

}
