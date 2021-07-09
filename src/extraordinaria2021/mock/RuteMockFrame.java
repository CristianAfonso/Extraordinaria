/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021.mock;

import extraordinaria2021.controller.*;
import extraordinaria2021.model.*;
import extraordinaria2021.view.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author can97
 */
public class RuteMockFrame {
        
    private Rute rute;
    private RuteDisplay ruteDisplay;
    private RuteDisplay currentRuteDisplay;
    private HashMap<String,Command> comandos;
    private RuteMockLoader ruteMockLoader;
    
    public RuteMockFrame() {
        this.execute();
    }

    private void execute() {
        this.currentRuteDisplay = new CurrentRuteMockPanel();
        this.ruteDisplay = new RuteMockPanel();
        this.ruteMockLoader = new RuteMockLoader();
        this.rute = new Rute("NewRute", ruteMockLoader.load());
        this.initLogic();
        this.start();
    }

    private void start(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            this.comandos.getOrDefault(scanner.next(), WaitCommand.instance).execute();
        }
    }

    private void initLogic() {
        this.currentRuteDisplay.display(rute);
        this.ruteDisplay.display(rute);
        this.createComands();
    }

    private void createComands() {
        this.comandos = new HashMap();
        this.comandos.put("admire", new AdmireCommand(this.rute));
        Scanner scanner = new Scanner(System.in);
        this.comandos.put("create", new CreateNewThemedRute(this.rute, scanner.next()));
        this.comandos.put("continue", new ContinueComand(this.rute));
        this.comandos.put("prev", new GoBackCommand(this.rute));
        this.comandos.put("exit", new ExitCommand());
    }
}
