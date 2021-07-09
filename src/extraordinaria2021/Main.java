/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinaria2021;

import extraordinaria2021.model.*;

/**
 *
 * @author can97
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PatrimonialElement busto1 = new Busto(5, "Busto al poeta", "José Bezoya", 1999, "A pico y pala", "Caliza", "Buen estado de conservación", "Política");
        PatrimonialElement iglesia1 = new Iglesia(3, "Iglesia del pueblo", "Manuel Perez", 1230, "BloqueSobreBloque", "Mármol", "Mal estado de conservación", "Gótica", true);
        PatrimonialElement edificio1 =new Edificio(4, "Edificio futurista", "Ana Melián" , 2019, "Ingeniería avanzada", "Grafeno", "Buen estado de conservación", "Política", false);
        PatrimonialElement estatua1 = new Estatua(2, "Estatua al político", "Santiago Iglesias", 2016, "Cincel", "Pizarra", "Excelente estado de conservación", "Política");
        PatrimonialElement grafiti = new Graffiti(1, "Protesta por presos políticos andaluces", "Anonimo", 2019, "Graffiti sobre pared antigua", "Spray","Buen estado de conservación", "Política");
        PatrimonialElement puente1 = new Puente(6, "Puente antiguo", "Población de la época", 1353, "Arquitectura mediaval", "Piedra y concreto", "Buen estado de conservación", "Mediaval", false);
        
        puente1.admirar();
    }
    
}
