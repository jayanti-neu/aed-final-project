/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author jayanti
 */
public class Business {
    public Business business;
    public EnterpriseDirectory enterpriseDirectory;
    
    public Business getInstance(){
        if (business == null){
            business = new Business();
        } 
        return business;
    }
    
    
}
