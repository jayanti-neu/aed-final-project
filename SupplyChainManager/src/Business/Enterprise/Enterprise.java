/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organisation.OrganisationDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author jayanti
 */
public class Enterprise {
    String name;
    int id;
    OrganisationDirectory organisationDirectory;
    WorkQueue workRequestList;
    
    public Enterprise(){
        organisationDirectory = new OrganisationDirectory();
        workRequestList = new WorkQueue();
    }
    
    public void addOrganisation(String name){
        organisationDirectory.addOrganisation(name);
    }
    
    public void addWorkRequest(){
//        WorkRequest workRequest = workRequestList.addWorkRequest();
//        workRequest.setSenderEnterprise(this);
//        workRequest.setReceivingEnterprise(recieverEnterprise);
    }
    
}
