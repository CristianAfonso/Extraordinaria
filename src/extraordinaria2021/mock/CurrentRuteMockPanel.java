/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.mock;

import extraordinaria2021.model.Rute;
import extraordinaria2021.view.RuteDisplay;

/**
 *
 * @author can97
 */
public class CurrentRuteMockPanel implements RuteDisplay {
    private Rute rute;

    public CurrentRuteMockPanel() {
        this.execute();
    }
    
    private void execute() {}  

    public void display(Rute rute) {
        this.rute = rute;
    }

    public void change() {
        System.out.println("Elemento patrimonial actual: " + this.rute.getCurretPatrimonialElement().getName());
    }
}
