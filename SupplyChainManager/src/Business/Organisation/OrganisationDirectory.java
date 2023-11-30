/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation;

import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class OrganisationDirectory {
    ArrayList<Organisation> organisationList;
    
    public OrganisationDirectory(){
        organisationList = new ArrayList<>();
    }
    
    public void setOrganisationList(ArrayList<Organisation> organisationList){
        this.organisationList = organisationList; 
    }
    
    public ArrayList<Organisation> getOrganisationList(){
        return organisationList;
    }
    
    public Organisation addOrganisation(String name){
        Organisation org = new Organisation();
        org.setName(name);
        organisationList.add(org);
        return org;
    }
    
    
}
