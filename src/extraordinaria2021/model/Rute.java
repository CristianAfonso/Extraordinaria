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
    private double distance;
    private ArrayList<PatrimonialElement> patrimonialElements;
    
    public Rute(String name, ArrayList<PatrimonialElement> patrimonialElements){
        this.name=name;
        this.patrimonialElements=patrimonialElements;
    }
    
}


