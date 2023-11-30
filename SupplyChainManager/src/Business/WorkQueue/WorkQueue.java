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
    
    public WorkQueue(){
        workRequestList = new ArrayList<WorkRequest>();
    }
    
    public WorkRequest addWorkRequest(WorkRequest workRequest){
        WorkRequest wr = new WorkRequest();
        workRequestList.add(wr);
        return wr;
    }
}
