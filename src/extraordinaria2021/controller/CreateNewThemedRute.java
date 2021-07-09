/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.controller;

import extraordinaria2021.model.PatrimonialElement;
import extraordinaria2021.model.Rute;
import java.util.Iterator;

/**
 *
 * @author can97
 */
public class CreateNewThemedRute implements Command {
    private final Rute rute;
    private Rute newRute;
    private final String theme;
    
    public CreateNewThemedRute(Rute rute, String theme) {
        this.rute = rute;
        this.theme=theme;
    }

    @Override
    public void execute() {
        
        this.createRute();
    }
    
    public void createRute(){
        PatrimonialElement actualPatrimonial;
        for(Iterator<PatrimonialElement> it = rute.getRute().iterator(); it.hasNext();){
            actualPatrimonial = it.next();
            if(actualPatrimonial.getTematica()==theme){
                newRute.addToRute(actualPatrimonial);
            }
     
        }
    }
    
}
