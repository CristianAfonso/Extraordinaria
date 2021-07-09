/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.mock;

import extraordinaria2021.model.*;
import extraordinaria2021.view.*;

/**
 *
 * @author can97
 */
public class RuteMockPanel implements RuteDisplay {
    private Rute rute;

    public RuteMockPanel() {
        this.execute();
    }

    private void execute() {
        //GraphicalAssets
    }

    @Override
    public void display(Rute rute) {
        this.rute = rute;
    }

    
}
