/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author can97
 */
public class Rute {
    private String name;
    private ArrayList<PatrimonialElement> patrimonialElements;
    private int index;
    private PatrimonialElement currentPatrimonialElement;
    
    public Rute(String name, ArrayList<PatrimonialElement> patrimonialElement){
        this.name=name;
        this.patrimonialElements= patrimonialElement;
        this.index=0;
    }
    public String getName(){
        return this.name;
    }
    
    public void addToRute(PatrimonialElement pe){
        this.patrimonialElements.add(pe);
    }
    
    public ArrayList<PatrimonialElement> getRute(){
        return this.patrimonialElements;
    }
    
    public PatrimonialElement getCurretPatrimonialElement(){
        return this.currentPatrimonialElement;
    }
    
    public void nextElement(){
        
        if(this.index == this.patrimonialElements.size()-1){
            System.out.print("Se ha acabado la ruta " + this.getName());
        } else {
            System.out.println("Avanzamos por la ruta");
            this.index = this.index+1;
        }
        this.currentPatrimonialElement = this.patrimonialElements.get(index);
    }
    
    public void previous(){
        if(this.index == 0){
            System.out.print("Ya estas al comiendo de la ruta " + this.getName());
        } else {
            this.index = this.index-1;
        }
        this.currentPatrimonialElement = this.patrimonialElements.get(index);
    }
    
}


