/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author jayanti
 */
public class Organisation {
    Enterprise enterprise;
    String name;
    ArrayList<Role> rolesDirectory;
    
    public Organisation(){
        rolesDirectory = new ArrayList<>();
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Role> getRolesDirectory() {
        return rolesDirectory;
    }

    public void setRolesDirectory(ArrayList<Role> rolesDirectory) {
        this.rolesDirectory = rolesDirectory;
    }
    
    
}
