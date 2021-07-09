/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.controller;

import extraordinaria2021.model.Rute;

/**
 *
 * @author can97
 */
public class GoBackCommand implements Command{
    private final Rute rute;
    
    public GoBackCommand(Rute rute){
        this.rute=rute;
    }
    @Override
    public void execute() {
        this.rute.previous();
    }
    
}
