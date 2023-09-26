/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vaishnavipatel
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        
        this.history= new ArrayList<>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
   
    public VitalSigns addNewVital(){
        
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(VitalSigns vs){
        history.remove(vs);
    }
    
}
