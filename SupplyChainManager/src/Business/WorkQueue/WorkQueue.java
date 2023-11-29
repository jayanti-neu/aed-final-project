/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class WorkQueue {
    ArrayList<WorkRequest> workRequestList;
    
    public WorkRequest addWorkRequest(){
        WorkRequest wr = new WorkRequest();
        wr.add();
        return wr;
    }
}
